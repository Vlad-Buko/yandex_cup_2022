package ru.yandex.backend.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Vladislav Domaniewski
 */

public class KolyaAndDataCenters {
    public static void main(String[] args) {
        System.out.println("Enter please amount: data center, server, and amount doings");
        Scanner sc = new Scanner(System.in);
        String values = sc.nextLine();

        Solution solution = new Solution();
        String [] arrayString = values.split(" ");
        int [] arrayNumbers = new int[arrayString.length];
        for (int i = 0; i < arrayString.length; i++) {
            arrayNumbers[i] = Integer.parseInt(arrayString[i]);
        }
        solution.inputValueForSolution(arrayNumbers[0], arrayNumbers[1], arrayNumbers[2]);
    }
}

class Solution {

    private int dataCenterInInput = 0;
    private int serverInInput = 0;

    public void inputValueForSolution (int amountDataCenter, int amountServer, int amountDoing) {

        ArrayList<int []> arrayDatacenter = new ArrayList<>();
        int count = 1;

        // amount data center

        for (int i = 0; i < amountDataCenter; i++) {
            arrayDatacenter.add(new int[3]) ;
        }

        int counter = 0;
        while (counter < amountDoing) {
            counter++;
            Scanner input = new Scanner(System.in);
            String command = input.nextLine();
            String [] inputValue = command.split(" ");

            this.dataCenterInInput = Integer.parseInt(inputValue[1]);
            this.serverInInput = Integer.parseInt(inputValue[2]);

            switch (inputValue[0]) {
                // DISABLE 2 1
                // 2 - data center
                // 1 - server

                case "DISABLE" :
                    int [] serversFromDataCenter = arrayDatacenter.get(dataCenterInInput-1);
                    serversFromDataCenter[serverInInput-1] = 1;
                    // Here wrote how disable datacenter server
                    Arrays.stream(serversFromDataCenter).forEach(System.out::print);
                    continue;

                case "RESET" :
                    int countResetForDataCenter = 0;
                    int lastIndexArray = arrayDatacenter.size() + 1;

                    arrayDatacenter.lastIndexOf(1);
                case "GETMAX" :

            }
        }
    }
}
