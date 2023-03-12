package com.mathoperations;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Iterator;
import java.util.function.Function;
import java.util.List;
import java.util.function.Consumer;
public class Playlist {
    public static void main(String[] args) {

        //collection
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        class MyClass implements Consumer<Integer>
        {
            public void accept(Integer g){
                System.out.println(" consumer implementation: " + g);
            }
        }
        MyClass myClass = new MyClass();
        myList.forEach(myClass);

        myList.forEach(new Consumer<Integer>() {
            public void accept(Integer s){
                System.out.println(" anonymous consumer implementation: " + s);
            }
        });

        Consumer<Integer> consumer = n ->{
            System.out.println("  explicit lambda function: " + n);
        };
        myList.forEach(consumer);

        myList.forEach(n -> {
            System.out.println("  implicit lambda function: " + n);
        });

        Function<Integer,Double> toDoubleFunction= Integer::doubleValue;
        myList.forEach(n -> {
            System.out.println(" forEach lambda double value: "+ n);
            toDoubleFunction.apply(n);
        });

        Predicate<Integer> myPredicate = n -> n>0 && n%2==0;
        myList.forEach(n -> System.out.println(+ n + " check even number :"+ myPredicate.test(n)));
    }
}