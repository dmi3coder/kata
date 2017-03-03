package io.github.dmi3coder;

import java.util.Arrays;

/**
 * Created by dim3coder on 3/3/17.
 */
public class Kata {

  public static int FindShort(String s) {
    String[] splittedStrings = s.split(" ");
    Arrays.sort(splittedStrings, (o1, o2) -> {
      if(o1.length()==o2.length())return 0;
      return o1.length()>o2.length()?1:-1;
    });
    return splittedStrings[0].length();
  }

  public static void main(String[] args) {
    System.out.println(FindShort("123 1234 1234567 123 12"));
  }
}