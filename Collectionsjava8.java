package com.company;
import java.util.Spliterator;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       Scanner in = new Scanner(System.in);
       int n,i;
       n = in.nextInt();
       for(i=0;i<n;i++)
       {
           list.add(in.nextInt());
       }
       Spliterator<Integer> Students = list.spliterator();
       Students.forEachRemaining(System.out::println);
    }
}
