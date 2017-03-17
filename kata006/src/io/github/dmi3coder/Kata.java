package io.github.dmi3coder;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

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
  public static int[] array = {8,1,9,2,5,8,11,42,8323,82,1,66,55,6,8};

  public static void main(String[] args) {
    long begin = System.nanoTime();
    Arrays.sort(array);
    for (int i = 0; i < array.length-1; i++) {
      if(array[i] == array[i+1]){
        System.out.println(array[i]);
      }
    }
    long diff = System.nanoTime() -begin;
    System.out.println("Diff : "+diff);
  }
}
// 1207565
//  610247