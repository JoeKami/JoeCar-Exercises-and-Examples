package com.coderscampus.unit9collections;
import java.util.*;

public class ListApplication {
    public static void main(String[] args) {
        String[] names = new String[4];

        names[0] = "Trevor Page";
        names[1] = "Jane Doe";
        names[2] = "John Doe";
        names[3] = "Elon Musk";

        names[1] = null;

        for (String name : names) {
            System.out.println(name);
        }

        //Collections -> Java solution to common data structure problems
        //List (a type of collection)
        //Set (a type of collection)
        //map (a type of collection)

        List<String> elements = new ArrayList<String>();

    }
}
