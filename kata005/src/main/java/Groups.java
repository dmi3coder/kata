import java.util.ArrayDeque;

public class Groups {

  private static ArrayDeque<Character> charDeque;
  private static String openChars = "{[(";
  private static String closingChars = "}])";

  public static boolean groupCheck(String s) {
    if (s.isEmpty()) {
      return true;
    }
    charDeque = new ArrayDeque<>(s.length());
    int position = 0;
    while (position < s.length()) {
      char currentChar = s.charAt(position);
      if(openChars.contains(currentChar+"")){
          charDeque.add(currentChar);
      }else if(closingChars.contains(currentChar+"")){
        char open = openChars.charAt(closingChars.indexOf(currentChar));
          if (!charDeque.isEmpty()&&charDeque.getLast().equals(open)) {
            charDeque.removeLast();
          } else {
            return false;
          }
      }
      position++;
    }
    return charDeque.isEmpty();
  }

}