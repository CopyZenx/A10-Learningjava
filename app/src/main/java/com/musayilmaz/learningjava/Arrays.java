package com.musayilmaz.learningjava;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args) {

       String[] myArray = new String[4];

       myArray[0] = "James";
       myArray[1] = "Lance";
       myArray[2] = "Kirk";
       myArray[3] = "Rob";

       System.out.println(myArray[3]);

       int[] myNumberArray = new int[5];
       int[] mySecondNumberArray = {10, 20, 30, 40, 50,};

        System.out.println(mySecondNumberArray[3]);

        //List

        ArrayList<String> myMusician = new ArrayList<String>();

        myMusician.add("James");
        myMusician.add("Lars");
        myMusician.add(1, "Kirk");

        System.out.println(myMusician.get(0));
        System.out.println(myMusician.get(1));
        System.out.println(myMusician.get(2));

        //Set

        HashSet<String> mySet = new HashSet<String>(  );

        mySet.add("Rob");
        mySet.add("Kirk");
        mySet.add("Rob");

        System.out.println(mySet.size());

        //Map

        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("name", "James");
        myHashMap.put("Instrument", "Guitar");

        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("Instrument"));





    }

}
