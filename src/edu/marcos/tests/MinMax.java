package edu.marcos.tests;

public class MinMax {

    public static void main(String[] args) {
        highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
    }

    public static String highAndLow(String numbers) {
        // ...
        String[] numbersListString = numbers.split(" ");
        int[] numbersList = new int[numbersListString.length];

        for (int i = 0; i < numbersListString.length; i++) {
            numbersList[i] = Integer.parseInt(numbersListString[i]);
        };

        for (int i = 0; i < numbersList.length; i++) {
            for (int j = i + 1; j < numbersList.length; j++) {
                if (numbersList[i] > numbersList[j]) {
                    int temp = numbersList[i];
                    numbersList[i] = numbersList[j];
                    numbersList[j] = temp;
                }
            }
        };

        int max = numbersList[numbersList.length - 1];
        int min = numbersList[0];
        return (max + " " + min);
    }

}
