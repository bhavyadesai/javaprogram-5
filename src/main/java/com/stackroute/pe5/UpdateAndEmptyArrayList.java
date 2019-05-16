//Write a Java program to update specific array element by given element and empty the array list.
//        Input: [Apple, Grape, Melon, Berry]
//        Output: [Kiwi, Grape, Mango, Berry]
//       Array list after removing all elements []



package com.stackroute.pe5;
import java.util.ArrayList;
public class UpdateAndEmptyArrayList {
        ArrayList<String>list=new ArrayList<>();
        public void updateMethod()
        {
            list.add("Apple");
            list.add("Grape");
            list.add("Melon");
            list.add("Berry");

            System.out.println(list);

            System.out.println("List after Updation");

            list.set(0,"Kiwi");
            list.set(2,"Mango");
            System.out.println(list);
            list.removeAll(list);


            System.out.println("After removing all elements");
            System.out.println(list);
        }

        public static void main(String[] args) {
            UpdateAndEmptyArrayList update=new UpdateAndEmptyArrayList ();
            update.updateMethod();
        }
    }


