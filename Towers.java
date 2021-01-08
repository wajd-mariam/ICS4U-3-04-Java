/*
* Copyright (c) 2021
*
* The program Towers.java uses recursion to solve the tower of Hanoi problem.
*
* @author  Wajd Mariam
* @version 1.0
* @since   2021/01/07
*/

import java.util.Random;
import java.util.Scanner;

public class Towers {
  
  /**
   * The tower function uses recursion to solve the "Tower of Hanoi" problem.
   */ 
  static void tower(int disks, char rodA, char rodB, char rodC) {
    if (disks == 1) {
      System.out.println("Move disk 1 from rod " +  rodA + " to rod " + rodB);
      return;
    } else {
      tower(disks - 1, rodA, rodC, rodB);
      System.out.println("Move disk " + disks + " from rod " +  rodA + " to rod " + rodB);
      tower(disks - 1, rodC, rodB, rodA);
    }
  }
  
  
  /**
   * The main function passes values to the "tower" function.
   */ 
  public static void main(String[] args) {
    System.out.println();
    System.out.println("Solving Tours of Hanoi Problem with three rods and three disk: ");
    System.out.println();
    int diskNumber = 3;
    tower(diskNumber, 'A', 'C', 'B');
  }
}


    