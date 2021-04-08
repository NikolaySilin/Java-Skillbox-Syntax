package ru.geekbrains.nikolaysilin.task;

public class Main {

    public static void main(String[] args) {

        Ingredients();
        Ages();

    }

    public static void Ingredients() {
        System.out.println("Task 1");
        int milkAmount = 8; // ml
        int powderAmount = 15; // g
        int eggsCount = 8; // items
        int sugarAmount = 8; // g
        int oilAmount = 1000; // ml
        int appleCount = 10; // items
        boolean canBuyAnything = false;

        // powder - 400g, sugar - 10g, milk - 1000ml, oil - 30ml.
        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
            System.out.println("Pancakes");
            canBuyAnything = true;
        }

        // milk - 300ml, powder - 5g, eggs - 5.
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            System.out.println("Omelette");
            canBuyAnything = true;
        }

        //apples - 3, milk 100ml, powder - 300g, eggs - 4.
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            System.out.println("Apple pie");
            canBuyAnything = true;
        }

        if (canBuyAnything == false) {
            System.out.println("Not enough ingredients");
        }
    }

    public static void Ages() {
        System.out.println("\nTask 2");
        int vasyaAge = 25;
        int katyaAge = 22;
        int mishaAge = 28;

        int min = Math.min(Math.min(vasyaAge, katyaAge), mishaAge);
        int middle = Math.max(Math.min(vasyaAge, katyaAge), Math.min(Math.max(vasyaAge, katyaAge), mishaAge));
        int max = Math.max(Math.max(vasyaAge, katyaAge),mishaAge);


        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximum age: " + max);

    }

    }

