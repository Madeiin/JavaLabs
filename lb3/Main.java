package com.company;

import java.util.*;


public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static int valueCount;
    private static LinkedList<GetSet> collections = new LinkedList<GetSet>();
    private static String name = "";
    private static int intrParphCount = 0;
    private static ArrayList<Integer> paragraphCount = new ArrayList<Integer>();
    private static ArrayList<Integer> paragraphCount2 = new ArrayList<Integer>();
    private static ArrayList<Integer> paragraphCount3 = new ArrayList<Integer>();
    private static ArrayList<Integer> paragraphCount4 = new ArrayList<Integer>();

    public static void main(String[] args) throws SbornikAnekdotov.SbornikAnekdotovException, SbornikCitat.SbornikCitatException {
        paragraphCount.add(10);
        name = "Citataa#1";
        intrParphCount = 2;
        collections.add(new SbornikCitat(paragraphCount, name, intrParphCount));

        paragraphCount2.add(10);
        name = "Citataa#2";
        intrParphCount = 2;
        collections.add(new SbornikCitat(paragraphCount2, name, intrParphCount));

        paragraphCount3.add(15);
        name = "Anekdot#1";
        intrParphCount = 4;
        collections.add(new SbornikAnekdotov(paragraphCount3, name, intrParphCount));

        paragraphCount4.add(25);
        name = "Anekdot#2";
        intrParphCount = 3;
        collections.add(new SbornikAnekdotov(paragraphCount4, name, intrParphCount));


        System.out.println(collections.get(0).paragraphCountWithoutIntr(0));

        var map = new HashMap<Integer, LinkedList<GetSet>>();
        int key;
        for (GetSet col : collections) {
            key = col.paragraphCountWithoutIntr(0);
            if (map.containsKey(key)) {
                map.get(key).add(col);
            } else {
                var list = new LinkedList<GetSet>();
                list.add(col);
                map.put(key, list);
            }
        }


        System.out.println("map");
        System.out.println(map);

       var sbornikCitat = new LinkedList<SbornikCitat>();
        var sbornikAnekdotov = new LinkedList<SbornikAnekdotov>();
        for (GetSet col : collections) {
            if (col instanceof SbornikCitat) {
                sbornikCitat.add((SbornikCitat) col);

            }

            else if (col instanceof SbornikAnekdotov) {
                sbornikAnekdotov.add((SbornikAnekdotov) col);

            }

    }
        System.out.println("sbornikCitat");
        System.out.println(sbornikCitat);
        System.out.println("sbornikAnekdotov");
        System.out.println(sbornikAnekdotov);





    }



}