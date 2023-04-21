package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsDemoUsingTraderTransaction {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));

        // Predicate<Transaction> inYear2011 = (t) -> t.getYear() == 2011;
        // Predicate<Trader> inCambridge = (t) -> t.getCity().equals("Cambridge");
        // Predicate<Trader> inMilan = (t) -> t.getCity().equals("Milan");

        // 1. Find all transactions in the year 2011 and sort them by value (small to
        // high).

        System.out.println("Answer 1");
        transactions.stream()
                .filter(new Year2011Predicate())
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        // 2. What are all the unique cities where the traders work?

        System.out.println("Answer 2");
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity).distinct()
                .forEach(System.out::println);

        // 3. Find all traders from Cambridge and sort them by name.

        System.out.println("Answer 3");
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(new CityPredicateTrader("Cambridge"))
                .map(Trader::getName)
                .sorted().distinct()
                .forEach(System.out::println);

        // 4. Return a string of all traders’ names sorted alphabetically.

        System.out.println("Answer 4");
        System.out.println(transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted().distinct()
                .collect(Collectors.joining()));

        // 5. Are any traders based in Milan?

        System.out.println("Answer 5");
        System.out.println(transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(new CityPredicateTrader("Milan")));

        // 6. Print all transactions’ values from the traders living in Cambridge.

        System.out.println("Answer 6");
        transactions.stream()
                .filter(new CityPredicateTransaction("Cambridge"))
                .forEach(System.out::println);

        // 7. What’s the highest value of all the transactions?

        System.out.println("Answer 7");
        System.out.println(transactions.stream()
                .mapToInt(Transaction::getValue)
                .max().getAsInt());

        // 8. Find the transaction with the smallest value

        System.out.println("Answer 8");
        System.out.println(transactions.stream()
                .mapToInt(Transaction::getValue)
                .min().getAsInt());
    }
}

class Year2011Predicate implements Predicate<Transaction> {

    @Override
    public boolean test(Transaction transaction) {
        return transaction.getYear() == 2011;
    }
}

class CityPredicateTrader implements Predicate<Trader> {
    private String cityName;

    public CityPredicateTrader(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean test(Trader trader) {
        return trader.getCity().equalsIgnoreCase(cityName);
    }
}

class CityPredicateTransaction implements Predicate<Transaction> {
    private String cityName;

    public CityPredicateTransaction(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean test(Transaction transaction) {
        return transaction.getTrader().getCity().equalsIgnoreCase(cityName);
    }
}

class Transaction {
    private final Trader trader;
    private final int year;
    private final int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return this.trader;
    }

    public int getYear() {
        return this.year;
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        return "{" + this.trader + ", " +
                "year: " + this.year + ", " +
                "value:" + this.value + "}";
    }
}

class Trader {
    private final String name;
    private final String city;

    public Trader(String n, String c) {
        this.name = n;
        this.city = c;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public String toString() {
        return "Trader:" + this.name + " in " + this.city;
    }
}