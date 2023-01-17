package machine;

import java.util.Arrays;
import java.util.Scanner;

public class CoffeeMachine {

    static Scanner scanner = new Scanner(System.in);

    // What one cup of coffee contains
    static final int WATER_PER_ONE_CUP = 200;
    static final int MILK_PER_ONE_CUP = 50;
    static final int COFFEE_BEANS_PER_ONE_CUP = 15;

    // Coffee ingredients
    static final int ESPRESSO_WATER = 250;
    static final int ESPRESSO_COFFEE_BEANS = 16;
    static final int ESPRESSO_PRICE = 4;

    // Latte ingredients
    static final int LATTE_WATER = 350;
    static final int LATTE_MILK = 75;
    static final int LATTE_COFFEE_BEANS = 20;
    static final int LATTE_PRICE = 7;

    // Cappuccino ingredients
    static final int CAPPUCCINO_WATER = 200;
    static final int CAPPUCCINO_MILK = 100;
    static final int CAPPUCCINO_COFFEE_BEANS = 12;
    static final int CAPPUCCINO_PRICE = 6;

    //The initial coffee machine's state
    static int cashRegister = 550;
    static int totalWater = 400;
    static int totalMilk = 540;
    static int totalCoffeeBeans = 120;
    static int disposableCups = 9;


    public static void main(String[] args) {
        //ingredientCalculator();
        //estimateNumberOfServings();
        processUserQuery();
    }

    private static void processUserQuery() {

        showCoffeeMachineState();

        System.out.println("\nWrite action (buy, fill, take):");
        String userQuery = scanner.nextLine();

        switch (userQuery) {
            case "buy" -> buyTypeOfCoffee();
            case "fill" -> fillTheCoffeeMachine();
            case "take" -> takeAllTheMoney();
        }
    }

    private static void buyTypeOfCoffee() {

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int coffeeType = scanner.nextInt();

        switch (coffeeType) {
            case 1 -> {
                totalWater -= ESPRESSO_WATER;
                totalCoffeeBeans -= ESPRESSO_COFFEE_BEANS;
                disposableCups--;
                cashRegister += ESPRESSO_PRICE;
            }
            case 2 -> {
                totalWater -= LATTE_WATER;
                totalMilk -= LATTE_MILK;
                totalCoffeeBeans -= LATTE_COFFEE_BEANS;
                disposableCups--;
                cashRegister += LATTE_PRICE;
            }
            case 3 -> {
                totalWater -= CAPPUCCINO_WATER;
                totalMilk -= CAPPUCCINO_MILK;
                totalCoffeeBeans -= CAPPUCCINO_COFFEE_BEANS;
                disposableCups--;
                cashRegister += CAPPUCCINO_PRICE;
            }
        }

        showCoffeeMachineState();
    }

    private static void fillTheCoffeeMachine() {

        System.out.println("Write how many ml of water you want to add:");
        totalWater += scanner.nextInt();

        System.out.println("Write how many ml of milk you want to add:");
        totalMilk += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add:");
        totalCoffeeBeans += scanner.nextInt();

        System.out.println("Write how many disposable cups you want to add:");
        disposableCups += scanner.nextInt();

        showCoffeeMachineState();
    }

    private static void takeAllTheMoney() {

        // Give all the money from selling coffee
        cashRegister = 0;

        showCoffeeMachineState();
    }

    private static void showCoffeeMachineState() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water%n", totalWater);
        System.out.printf("%d ml of milk%n", totalMilk);
        System.out.printf("%d g of coffee beans%n", totalCoffeeBeans);
        System.out.printf("%d disposable cups%n",disposableCups);
        System.out.printf("$%d of money%n", cashRegister);
    }

    private static void estimateNumberOfServings() {

        System.out.println("Write how many ml of water the coffee machine has:");
        final int ML_OF_WATER = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        final int ML_OF_MILK = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        final int GRAMS_OF_COFFEE_BEANS = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        final int CUPS_OF_COFFEE_REQUESTED = scanner.nextInt();

        int woterCups = ML_OF_WATER / WATER_PER_ONE_CUP;
        int milkCups = ML_OF_MILK / MILK_PER_ONE_CUP;
        int coffeeBeansCups = GRAMS_OF_COFFEE_BEANS / COFFEE_BEANS_PER_ONE_CUP;

        // The coffee machine supplies
        int numberOfCups = woterCups;
        numberOfCups = Math.min(milkCups, numberOfCups);
        numberOfCups = Math.min(coffeeBeansCups, numberOfCups);

        if (CUPS_OF_COFFEE_REQUESTED == numberOfCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (CUPS_OF_COFFEE_REQUESTED < numberOfCups){
            System.out.printf("Yes, I can make that amount of coffee " +
                    "(and even %d more than that)", numberOfCups - CUPS_OF_COFFEE_REQUESTED);
        } else if (CUPS_OF_COFFEE_REQUESTED > numberOfCups) {
            System.out.printf("No, I can make only %d cup(s) of coffee", numberOfCups);
        }
    }

    private static void ingredientCalculator() {
        // How many cups of coffee?
        System.out.println("Write how many cups of coffee you will need:");
        int cupsOfCoffee = scanner.nextInt();

        System.out.printf("%nFor %d cups of coffee you will need:", cupsOfCoffee);
        System.out.printf("%n%d ml of water", WATER_PER_ONE_CUP * cupsOfCoffee);
        System.out.printf("%n%d ml of milk", MILK_PER_ONE_CUP * cupsOfCoffee);
        System.out.printf("%n%d g of coffee beans", COFFEE_BEANS_PER_ONE_CUP * cupsOfCoffee);
    }
}

