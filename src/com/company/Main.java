package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<String, String[]> dict = new HashMap<>();

        dict.put("green", new String[]{"apple", "grass"});
        dict.put("yellow", new String[]{"chicken", "sun"});
        dict.put("black", new String[]{"space", "night", "босс"});
        dict.put("blue", new String[]{"ocean", "sky"});

        Set<Map.Entry<String, String[]>> r = dict.entrySet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Color?");
        String word = scanner.nextLine();

        for (Map.Entry<String, String[]> rd : r) {
            for (String st : rd.getValue()) {
                if (word.equals(st)) {
                    System.out.println(rd.getKey());
                    for (String s : rd.getValue()) {
                        System.out.println(s);
                    }
                }
            }
        }
        for (Map.Entry<String, String[]> rd : r) {
            if (word.equals(rd.getKey())) {
                for (String s : rd.getValue()) {
                    System.out.println(s);
                }
            }
        }

        Map<String, String[]> dictionaryMap = new HashMap<>();

        for (Map.Entry<String, String[]> returnKeyValue : r) {
            String key = returnKeyValue.getKey();
            String[] value = returnKeyValue.getValue();
            for (int i = 0; i < value.length; i++) {
                String synonym = value[i];
                String[] values = new String[value.length];
                for (int a = 0; a < values.length; a++) {
                    String value2 = value[a];
                    if (value2.equals(synonym)) {
                        values[a] = key;
                    } else {
                        values[a] = value2;
                    }
                }
                dictionaryMap.put(synonym, values);
            }

        }
    }
}

