package ru.geekbrains.nikolaysilin.task;

public class ClassWork {

    public static void main(String[] args) {

        buyCoffe();

    }

    public static void buyCoffe () {
        int moneyAmmount = 300;

        int cappucinoPrice = 150;
        int lattePrice = 120;
        int espressoPrice = 100;
        int waterPrice = 18;

        boolean isMilkEnough = false;
        boolean canBuyAnything = false;

        boolean moneyEnoughForCappucino = moneyAmmount >= cappucinoPrice;

        if (moneyEnoughForCappucino && isMilkEnough == true) {
            System.out.println("Вы можете купить капучино");
            canBuyAnything = true;
        }

        if (moneyAmmount >= lattePrice && isMilkEnough == true) {
            System.out.println("Вы можете купить латте");
            canBuyAnything = true;
        }

        if (moneyAmmount >= espressoPrice) {
            System.out.println("Вы можете купить эспрессо");
            canBuyAnything = true;
        }

        if (moneyAmmount >= waterPrice) {
            System.out.println("Вы можете купить воды");
            canBuyAnything = true;
        }

        /**
         * Тернарный оператор (Троичный)
         * @return Возвращает булевское значение в зависимости от выполнения условий.
         * @param canBuyAnything <- если это значение буде равно "falsе" то выполнится второе условие, тоесть "Недостаточно средств".
         * если будет "true" то соответсвенно вам предложат "Выберете напиток"
         */

        System.out.println(canBuyAnything ? "Выберете напиток" : "Недостаточно средств");

//        if (canBuyAnything == false) {
//            System.out.println("Недостаточно средств");
//        }

    }


}