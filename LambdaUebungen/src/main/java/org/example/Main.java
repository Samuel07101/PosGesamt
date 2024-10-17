package org.example;

import java.awt.*;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static SumUp sum = (x, y) -> x+y;
    static CheckEmpty check = (s) -> s.isEmpty();
    static ToUpperLower upper = (list -> {
        for(String s : list){
            s.toUpperCase();
        }
    });
    static ToUpperLower lower = (list -> {
        for (String s : list){
            s.toLowerCase();
        }
    });
    static OddEvenFilter odd = list -> {
        list.stream().filter(x -> x%2 != 0);
    };
    static OddEvenFilter even = list -> {
        list.stream().filter(x -> x%2 == 0);
    };

    public static void main(String[] args) {
        sum(5,3);

    }

    public static int sum(int numb1,int numb2){
        return sum.sum(numb1,numb2);
    }

    public static boolean checkEmpty(String s){
        return check.checkEmpty(s);
    }

    public static void toUpperLower(List<String> list){
        upper.change(list);
        lower.change(list);
    }

    public static void filter(List<Integer> list){
        odd.filter(list);
        even.filter(list);
    }

    public static void sortString(List<String> list){
        
    }
}