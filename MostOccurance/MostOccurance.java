package MostOccurance;

import java.util.HashMap;

public class MostOccurance {

  static char maxOccuringCharacter(String s) throws EmptyStringException {
    if (s == null || s.isEmpty()) {
      throw new EmptyStringException("Input cannot be null or empty");
    }

    HashMap<Character, Integer> map = new HashMap<>();

    char ans = '\0';
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (Character.isWhitespace(c)) continue;
      int cnt = map.getOrDefault(c, 0) + 1;
      map.put(c, cnt);

      if (cnt > count) {
        ans = c;
        count = cnt;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    String s = "greener";
    try {
      System.out.println(maxOccuringCharacter(s));
    } catch (EmptyStringException e) {
      System.err.println(e.getMessage());
    }
  }
}
