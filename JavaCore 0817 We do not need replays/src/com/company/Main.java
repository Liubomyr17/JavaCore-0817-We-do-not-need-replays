package com.company;

/*
0817 We do not need replays

Create a dictionary (Map <String, String>), enter ten entries in it according to the principle of “last name” - “first name”.
Delete people with the same name.

Requirements:
1. The program should not display text on the screen.
2. The program should not read values ​​from the keyboard.
3. The Solution class should contain only four methods.
4. The createMap () method should create and return a HashMap dictionary with the type of String elements, String consisting of 10 entries.
5. The removeTheFirstNameDuplicates () method should remove from the dictionary all people who have the same name.
6. The removeTheFirstNameDuplicates () method should call the removeItemFromMapByValue () method.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Stallone","Piter" );
        map.put("Bush", "Jhon" );
        map.put("Ivanov", "Maikl");
        map.put("Oland", "Vadim");
        map.put("Ford", "Jordan");
        map.put("Washington", "Maikl");
        map.put("Jeferson", "Piter");
        map.put("Mugabe", "Mngo");
        map.put("Adenauer", "Wiliam");
        map.put("Dred", "Maikl");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String, String> pair:copy.entrySet()) {
            String value = pair.getValue();
            if(!list.isEmpty() && list.contains(value)) {
                removeItemFromMapByValue(map, value);
            }
            else list.add(value);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap <String, String> copy = new HashMap<String, String>(map);
        for(Map.Entry<String, String> pair : copy.entrySet()) {
            if(pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}





