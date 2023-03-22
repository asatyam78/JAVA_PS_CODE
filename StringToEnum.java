import java.util.Scanner;
public class StringToEnum {
    public enum MyEnum {
        VIRAT,
        ROHIT,
        DHONI,
        JADEJA    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        MyEnum myEnum = MyEnum.valueOf(str);
        System.out.println(myEnum);
        scanner.close();
    }
}
