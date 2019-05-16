
//Write a program to find the number of counts in the following String. Store the output in
//        Map<String,Integer> as key value pair.
//        Input : String str = “one one -one___two,,three,one @three*one?two”;
//        Output : {"one":5 , "two":2, "three" :2}
package com.stackroute.pe5;
import java.util.*;
public class FindOccurrenceOfString {
    public void findNumberOfCount()
    {
        String inputString="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        inputString=scanner.nextLine().toLowerCase().trim();
        List<String> list;

        list= Arrays.asList(inputString.split("[\\W_]+"));
        HashMap<String,Integer> stringCount=new HashMap<>();

        for (String s: list)
        {
            if(stringCount.containsKey(s))
            {
                stringCount.replace(s,stringCount.get(s)+1);
            }
            else
            {
                stringCount.put(s,1);
            }

        }
        System.out.println(stringCount);

    }

    public static void main(String[] args) {
        FindOccurrenceOfString  findStringOccurence=new FindOccurrenceOfString() ;
        findStringOccurence.findNumberOfCount();
    }
}



