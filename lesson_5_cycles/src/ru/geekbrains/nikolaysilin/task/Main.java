package ru.geekbrains.nikolaysilin.task;

public class Main {

    public static void main(String[] args) {

        //TiketFor ();
        TiketWhile();

    }

    public static void TiketFor() {
        for (int i = 200000; i <= 210000; i++) {
            System.out.println("Билет № : " + i);
        }
    }

    public static void TiketWhile () {
        int i = 220000;
        while (i <= 235000) {
            System.out.println("Билет № : " + i);
            i++;
        }
    }


}
