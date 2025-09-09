package Riwence.day_2.investigation;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //Array
        int[] gold = {11, 22, 44, 55, 14};

        System.out.println("First Element: " + gold[0]);
        System.out.println("Last Element: " + gold[gold.length - 1]);

        //ArrayList

        ArrayList<String> mochila = new ArrayList<>();
        mochila.add("Espada");
        mochila.add("Mapa");
        mochila.add("Poción");

        System.out.println(mochila.get(1));
        mochila.remove(1);

        //HashMap

        HashMap<String, Integer> tesoros = new HashMap<>();
        tesoros.put("Oro", 100);
        tesoros.put("Plata", 50);
        tesoros.put("Diamantes", 5);

        tesoros.put("Oro", 200);

        System.out.println("Hay: "+ tesoros.get("Diamantes") + " diamantes" );

        System.out.println(tesoros);

        //Final

        int [] goldQuantity = {1122, 2233, 4455};

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Jessica");

        HashMap<Integer, String> studentNames = new HashMap<>();
        studentNames.put(goldQuantity[0], names.getFirst());
        studentNames.put(goldQuantity[1], names.get(1));
        studentNames.put(goldQuantity[2], names.getLast());

        System.out.println(studentNames);
        int maxGold = 0;
        for (int key : studentNames.keySet()) {
            if (key > maxGold) {
                maxGold = key;
            }
        }
        System.out.println("The student with the highest gold quantity is " + studentNames.get(maxGold) + " with: " + maxGold + " goldCuantity.");
    }
}
