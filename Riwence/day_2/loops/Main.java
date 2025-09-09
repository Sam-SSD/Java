package Riwence.day_2.loops;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Array
        Scanner sc = new Scanner(System.in);

        int [] numbers = {22,43,54,67,11};

        for (int num : numbers){
            System.out.println(num*2);
        }

        int [] numbers2 = new int[6];

        for (int i = 0; i < numbers2.length; i++){
            System.out.println("Insert "+ (i+1) + " number:");
            numbers2[i] = sc.nextInt();
        }

        for (int num : numbers2){
            System.out.println(num);
        }

        //ArrayList
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("John");
        studentNames.add("Jane");
        studentNames.add("Jessica");
        studentNames.add("Joseph");
        studentNames.add("Jose");

        for (String name : studentNames){
            System.out.println(name);
        }

        //HashMap
        HashMap<Integer, String> studentNames2 = new HashMap<>();
        studentNames2.put(1038928372, "John");
        studentNames2.put(1038928373, "Jane");
        studentNames2.put(1038928374, "Jessica");
        studentNames2.put(1038928375, "Joseph");
        studentNames2.put(1038928376, "Jose");

        for (int key : studentNames2.keySet()){
            System.out.println(key + " -> " + studentNames2.get(key));
        }



    }
}
