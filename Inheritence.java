public class Inheritence {
  public static void main(String[] args) {
    LevelFour obj = new LevelFour();
  }
}

class LevelOne {
  LevelOne() {
    System.out.println("Calling Level One");
  }
}

class LevelTwo extends LevelOne {
  LevelTwo() {
    System.out.println("Calling Level Two");
  }
}

class LevelThree extends LevelTwo {
  LevelThree() {
    System.out.println("Calling Level Three");
  }
}

class LevelFour extends LevelThree {
  LevelFour() {
    System.out.println("Calling Level Four");
  }
}