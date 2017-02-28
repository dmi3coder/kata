package com.dmi3coder.sorting;

import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * Created by dim3coder on 2/28/17.
 */
public class Sorting {


  public static void main(String[] args) {
    int[] unsortedArray = {0,65536,1,5,254,11,2,1,93,0,222,53};
    bubbleSort(unsortedArray,true);
    printArray(unsortedArray);
    bubbleSort(unsortedArray,false);
    printArray(unsortedArray);
  }

  private static void printArray(int[] array){

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]+" ");
    }
    System.out.println("\n");

  }


  public static void bubbleSort(int[] objects, boolean reverse){
    boolean flag = true;
    int temp;

    while (flag){
      flag = false;
      for (int i = 0; i < objects.length-1; i++) {
        if(reverse?objects[i]>objects[i+1]:objects[i]<objects[i+1]){
          temp = objects[i];
          objects[i] = objects[i+1];
          objects[i+1] = temp;
          flag = true;
        }
      }
    }
  }

}
