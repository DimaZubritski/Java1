package rfe.bsu.laba1;

import java.util.Scanner;
import java.util.*;
import java.util.Collections;

public class Main {


    public static void main(String[] args) throws Exception {

        List<Food> breakfast = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //  Collections.sort(breakfast, new FoodComparator());
        for(int i = 0; i < args.length; i++) {
            if (args[i].equals("Apple")) {
                breakfast.add(new Apple(args[++i]));
            }
            if (args[i].equals("Cheese")) {
                breakfast.add(new Cheese());
            }
            if (args[i].equals("IceCream")) {
                breakfast.add(new IceCream(args[++i]));
            }
        }
        System.out.println("sorted: ");
        Collections.sort(breakfast, new FoodComparator());
        List<Food> breakfast1 = new ArrayList<>();
        Collections.reverse(breakfast);

        int sum = 0;
        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
                sum += item.calculateCalories();
            } else {
                break;
            }
        }
        System.out.println("sum: " + sum);


        for (int i = 0; i < breakfast.toArray().length; i++) {
            System.out.println(breakfast.get(i).toString());
        }
    }

}

