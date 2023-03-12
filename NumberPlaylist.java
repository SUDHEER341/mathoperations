package com.mathoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class NumberPlaylist {
    public static void main(String[] args) {

        //collection
        ArrayList<Integer> mylist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mylist.add(i);
        }
        // iterator
        Iterator<Integer> iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // consumer interface
        class MyClass implements Consumer<Integer>{
            public void accept(Integer m){
                System.out.println(" consumer implementation : " + m);
            }
        }
        MyClass myClass = new MyClass();
        mylist.forEach(myClass);

        // anonymous consumer interface
        mylist.forEach(new Consumer<Integer>() {
            public void accept(Integer g){
                System.out.println(" anonymous consumer implementation : " + g);
            }
        });


        // explicit lambda function
        Consumer<Integer> consumer = n ->{
            System.out.println(" using explicit lambda function: " + n);};
        mylist.forEach(consumer);

        // lambda function

        mylist.forEach(n -> {
            System.out.println(" implicit lambda function: " + n);
        });

        // lambda function to print double value

        Function<Integer,Double> toDoubleFunction= Integer::doubleValue;
        mylist.forEach(n -> {
            System.out.println(" forEach lambda double value: "+ n);
            toDoubleFunction.apply(n);
        });

    }
}

