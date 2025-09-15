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


        //Exercises
        System.out.println("---Exercise 1---");
        System.out.println("Enter the number to see the factorial:");
        int number = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);

        System.out.println("---Exercise 2---");

        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("The random number is " + randomNumber);
        int tryCount = 10;
        int attempts = 0;
        int numberIngresed;
        do {
            if (attempts == tryCount) {
                System.out.println("You dont guessed the number, you are out of tries the random number was: " + randomNumber);
                break;
            }
            System.out.println("Insert a number between 1 and 100 (You have " + (tryCount - attempts) + " tries left):");
            numberIngresed = sc.nextInt();
            if (numberIngresed == randomNumber) {
                System.out.println("You guessed the number in " + attempts + " tries");
                break;
            } else if (numberIngresed < randomNumber) {
                System.out.println("The number is lower than the guessed number");
                attempts++;
            } else{
                System.out.println("The number is higher than the guessed number");
                attempts++;
            }

        }while (numberIngresed != randomNumber);

        System.out.println("---Exercise 3---");
        int number2;
        int sum = 0;
        int count = 0;

        System.out.println("Insert numbers (0 to stop):");

        do {
            number2 = sc.nextInt();
            if (number2 != 0) {
                sum += number2;
                count++;
            }

        }while (number2 != 0);

        System.out.println("The sum is: " + sum + " and the average is: " + (double) sum / count);

        System.out.println("---Exercise 4---");
        System.out.println("No exercise");


        System.out.println("Insert a number:");
        int number5 = sc.nextInt();

        for (int i = 1; i < 11; i++) {

            System.out.println(number5 + " x " + i + " = " + (number5 * i));

        }

    }
}
