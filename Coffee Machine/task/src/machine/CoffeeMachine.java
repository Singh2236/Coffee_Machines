/*
Methods Used:
-inputStr() : to read a string
-inputInt() : to read a int
-makeEspresso : checks if the machine has enough resources to make an Espresso, minus the resources from what the machine has if not print what's less in the machine.
-makeLatte
-makeCappuccino
-fillCoffeeMachine
-takeMoney
-exitFromWorking
-showRemaining


 */

package machine;

import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachine {
    public static int coffeeMachineWater = 400;
    public static int coffeeMachineMilk = 540;
    public static int coffeeMachineCoffeeBeans = 120;
    public static int coffeeMachineDisposableCups = 9;
    public static int coffeeMachineMoney = 550;
    public static boolean runningMachine = true;


    public static void main(String[] args) {


        while (runningMachine) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String read = inputStr();

            if (Objects.equals(read, "buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                var whichCoffee = inputStr();


                if (Objects.equals(whichCoffee, "1")) {
                    makeEspresso();
                }
                else if (Objects.equals(whichCoffee, "2")) {
                    makeLatte();
                }
                else if (Objects.equals(whichCoffee, "3")) {
                    makeCappuccino();
                }
            }
            else if (Objects.equals(read, "fill")) {
                fillCoffeeMachine();
            }
            else if (Objects.equals(read, "take")) {
                takeMoney();
            }
            else if (Objects.equals(read, "exit")) {
                exitFromWorking();
            }
            else if (Objects.equals(read, "remaining")) {
                showRemaining();
            }
        }
    }
    //input methods

    //String input
    public static String inputStr() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    //int input
    public static int inputInt() {
        Scanner intInput = new Scanner(System.in);
        return intInput.nextInt();
    }


    // methods when buy is selected
    public static void makeEspresso() {

        final int espressoWater = 250;
        final int espressoMilk = 0;
        final int espressoCoffeeBeans = 16;
        final int espressoCost = 4;

        if (coffeeMachineWater > espressoWater && coffeeMachineMilk > espressoMilk
                && coffeeMachineCoffeeBeans > espressoCoffeeBeans) {
            System.out.println("I have enough resources, making you a coffee!");
            coffeeMachineWater -= espressoWater;
            coffeeMachineCoffeeBeans -= espressoCoffeeBeans;
            coffeeMachineDisposableCups -= 1;
            coffeeMachineMoney += espressoCost;
        }
        else if (coffeeMachineWater < espressoWater) {
            System.out.println("Sorry, not enough water!");
        }
        else if (coffeeMachineMilk < espressoMilk) {
            System.out.println("Sorry, not enough milk!");
        }
        else if (coffeeMachineCoffeeBeans < espressoCoffeeBeans) {
            System.out.println("Sorry, not enough coffee beans");
        }
    }

    public static void makeLatte() {
        final int latteWater = 350;
        final int latteMilk = 75;
        final int latteCoffeeBeans = 20;
        final int latteCost = 7;

        if (coffeeMachineWater > latteWater && coffeeMachineMilk > latteMilk
                && coffeeMachineCoffeeBeans > latteCoffeeBeans) {
            System.out.println("I have enough resources, making you a coffee!");
            coffeeMachineWater -= latteWater;
            coffeeMachineMilk -= latteMilk;
            coffeeMachineCoffeeBeans -= latteCoffeeBeans;
            coffeeMachineDisposableCups -= 1;
            coffeeMachineMoney += latteCost;

        }
        else if (coffeeMachineWater < latteWater) {
            System.out.println("Sorry, not enough water!");
        }
        else if (coffeeMachineMilk < latteMilk) {
            System.out.println("Sorry, not enough milk!");
        }
        else if (coffeeMachineCoffeeBeans < latteCoffeeBeans) {
            System.out.println("Sorry, not enough coffee beans");
        }
    }

    public static void makeCappuccino() {
        int cappuccinoWater = 200;
        int cappuccinoMilk = 100;
        int cappuccinoCoffeeBeans = 12;
        int cappuccinoCost = 6;

        if (coffeeMachineWater > cappuccinoWater && coffeeMachineMilk > cappuccinoMilk
                && coffeeMachineCoffeeBeans > cappuccinoCoffeeBeans) {
            System.out.println("I have enough resources, making you a coffee!");
            coffeeMachineWater -= cappuccinoWater;
            coffeeMachineMilk -= cappuccinoMilk;
            coffeeMachineCoffeeBeans -= cappuccinoCoffeeBeans;
            coffeeMachineDisposableCups -= 1;
            coffeeMachineMoney += cappuccinoCost;

        }
        else if (coffeeMachineWater < cappuccinoWater) {
            System.out.println("Sorry, not enough water!");
        }
        else if (coffeeMachineMilk < cappuccinoMilk) {
            System.out.println("Sorry, not enough milk!");
        }
        else if (coffeeMachineCoffeeBeans < cappuccinoCoffeeBeans) {
            System.out.println("Sorry, not enough coffee beans");
        }
    }

    public static void fillCoffeeMachine() {
        System.out.println("Write how many ml of water you want to add:");
        coffeeMachineWater += inputInt();
        System.out.println("Write how many ml of milk you want to add:");
        coffeeMachineMilk += inputInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeMachineCoffeeBeans += inputInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        coffeeMachineDisposableCups += inputInt();
    }

    public static void takeMoney() {
        System.out.println("I gave you " + coffeeMachineMoney);
        coffeeMachineMoney = 0;
    }

    public static void exitFromWorking() {
        runningMachine = false;

    }

    public static void showRemaining() {
        System.out.println("The coffee machine has:\n" +
                coffeeMachineWater + " ml of water\n" +
                coffeeMachineMilk + " ml of milk\n" +
                coffeeMachineCoffeeBeans + " g of coffee beans\n" +
                coffeeMachineDisposableCups + " disposable cups\n" +
                "$" + coffeeMachineMoney + " of money");

    }

}
