//Write a program to implement set interface which sorts the given randomly ordered names in
//
//        ascending order. Convert the sorted set in to an array list
//        Input : Harry Olive Alice Bluto Eugene
//        Output :
//        Sorted Set : Alice Bluto Eugene Harry Olive
//        Array list from Set : Alice Bluto Eugene Harry Olive
package com.stackroute.pe5;
import java.util.*;
public class SortArrayList {
    public void listSorting()
    {
        SortedSet<String> sortedSet=new TreeSet<>();
        sortedSet.add("Harry");
        sortedSet.add("Olive");
        sortedSet.add("Alice");
        sortedSet.add("Bluto");
        sortedSet.add("Eugene");

        ArrayList<String> strings=new ArrayList<>(sortedSet);
        System.out.println(strings);

    }

    public static void main(String[] args) {
        SortArrayList sortList=new SortArrayList();
        sortList.listSorting();
    }
}
