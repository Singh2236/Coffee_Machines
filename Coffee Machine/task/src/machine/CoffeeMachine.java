package machine;

import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // CoffeeMachineData
        int coffeeMachineWater = 400;
        int coffeeMachineMilk = 540;
        int coffeeMachineCoffeeBeans = 120;
        int coffeeMachineDisposableCups = 9;
        int coffeeMachineMoney = 550;


        int espressoWater = 250;
        int espressoMilk = 0;
        int espressoCoffeeBeans = 16;
        int espressoCost = 4;

        int latteWater = 350;
        int latteMilk = 75;
        int latteCoffeeBeans = 20;
        int latteCost = 7;

        int cappuccinoWater = 200;
        int cappuccinoMilk = 100;
        int cappuccinoCoffeeBeans = 12;
        int cappuccinoCost = 6;

        boolean runningMachine = true;

        while (runningMachine) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String read = scanner.next();


            if (Objects.equals(read, "buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                var whichCoffee = scanner.next();



                if (Objects.equals(whichCoffee, "1")) {
                    if (coffeeMachineWater > espressoWater && coffeeMachineMilk > espressoMilk
                            && coffeeMachineCoffeeBeans > espressoCoffeeBeans) {
                        System.out.println("I have enough resources, making you a coffee!");
                        coffeeMachineWater -= espressoWater;
                        coffeeMachineMilk -= espressoMilk;
                        coffeeMachineCoffeeBeans -= espressoCoffeeBeans;
                        coffeeMachineDisposableCups -= 1;
                        coffeeMachineMoney += espressoCost;
                    } else if (coffeeMachineWater < espressoWater) {
                        System.out.println("Sorry, not enough water!");
                    } else if (coffeeMachineMilk < espressoMilk) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (coffeeMachineCoffeeBeans < espressoCoffeeBeans) {
                        System.out.println("Sorry, not enough coffee beans");
                    }


                } else if (Objects.equals(whichCoffee, "2")) {
                    if (coffeeMachineWater > latteWater && coffeeMachineMilk > latteMilk
                            && coffeeMachineCoffeeBeans > latteCoffeeBeans) {
                        System.out.println("I have enough resources, making you a coffee!");
                        coffeeMachineWater -= latteWater;
                        coffeeMachineMilk -= latteMilk;
                        coffeeMachineCoffeeBeans -= latteCoffeeBeans;
                        coffeeMachineDisposableCups -= 1;
                        coffeeMachineMoney += latteCost;

                    } else if (coffeeMachineWater < latteWater) {
                        System.out.println("Sorry, not enough water!");
                    } else if (coffeeMachineMilk < latteMilk) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (coffeeMachineCoffeeBeans < latteCoffeeBeans) {
                        System.out.println("Sorry, not enough coffee beans");
                    }


                } else if (Objects.equals(whichCoffee, "3")) {
                    if (coffeeMachineWater > cappuccinoWater && coffeeMachineMilk > cappuccinoMilk
                            && coffeeMachineCoffeeBeans > cappuccinoCoffeeBeans) {
                        System.out.println("I have enough resources, making you a coffee!");
                        coffeeMachineWater -= cappuccinoWater;
                        coffeeMachineMilk -= cappuccinoMilk;
                        coffeeMachineCoffeeBeans -= cappuccinoCoffeeBeans;
                        coffeeMachineDisposableCups -= 1;
                        coffeeMachineMoney += cappuccinoCost;

                    } else if (coffeeMachineWater < cappuccinoWater) {
                        System.out.println("Sorry, not enough water!");
                    } else if (coffeeMachineMilk < cappuccinoMilk) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (coffeeMachineCoffeeBeans < cappuccinoCoffeeBeans) {
                        System.out.println("Sorry, not enough coffee beans");
                    }
                }

            } else if (Objects.equals(read, "fill")) {
                System.out.println("Write how many ml of water you want to add:");
                coffeeMachineWater += scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                coffeeMachineMilk += scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                coffeeMachineCoffeeBeans += scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add:");
                coffeeMachineDisposableCups += scanner.nextInt();

            } else if (Objects.equals(read, "take")) {
                System.out.println("I gave you " + coffeeMachineMoney);
                coffeeMachineMoney = 0;
            } else if (Objects.equals(read, "exit")) {
                runningMachine = false;
            } else if (Objects.equals(read, "remaining")) {
                System.out.println("The coffee machine has:\n" +
                        coffeeMachineWater + " ml of water\n" +
                        coffeeMachineMilk + " ml of milk\n" +
                        coffeeMachineCoffeeBeans + " g of coffee beans\n" +
                        coffeeMachineDisposableCups + " disposable cups\n" +
                        "$" + coffeeMachineMoney + " of money");
            }
        }
    }
}
