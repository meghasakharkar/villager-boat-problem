package com.example.app;

import com.example.app.entities.TestCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<TestCase> testCases = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of test cases: ");
        int numberOfTestCases = scanner.nextInt();
        for (int i = 1; i <= numberOfTestCases; i++) {
            TestCase testCase = new TestCase();
            System.out.println("------- TEST CASE - " + i + " -------");
            System.out.print("Number of people: ");
            int numberOfVillagers = scanner.nextInt();
            testCase.setNumberOfVillages(numberOfVillagers);
            System.out.print("Costs (separated by space): ");
            for (int villager = 0; villager < numberOfVillagers; villager++) {
                testCase.getCosts().add(scanner.nextInt());
            }
            testCases.add(testCase);
        }
        System.out.println("Output:");
        printOutput(testCases);
    }

    private static void printOutput(List<TestCase> testCases) {
        for (TestCase testCase : testCases) {
            System.out.println(calculate(testCase));
        }
    }

    private static int calculate(TestCase testCase) {
        Collections.sort(testCase.getCosts());
        List<Integer> costs = testCase.getCosts();
        int totalCost = 0;
        if (costs.size() == 1) {
            return costs.get(0);
        } else if (costs.size() == 2) {
            return costs.get(1);
        } else if (costs.size() == 3) {
            return costs.get(0) + costs.get(1) + costs.get(2);
        } else if (costs.size() >= 4) {
            int cheapMin = 0;
            int cheapMax = 1;
            int expensiveMax = testCase.getCosts().size() - 1;
            if (costs.get(cheapMin) * 2 > costs.get(cheapMax)) {
                while (expensiveMax > cheapMax) {
                    totalCost = totalCost + (costs.get(cheapMin) + costs.get(cheapMax));
                    totalCost = totalCost + costs.get(expensiveMax) + costs.get(cheapMax);
                    expensiveMax = expensiveMax - 2;
                }
                if (costs.size() % 2 == 0) {
                    totalCost = totalCost + costs.get(cheapMax);
                }
            } else {
                for (int j = 1; j < costs.size(); j++) {
                    totalCost = totalCost + costs.get(j);
                }
                totalCost = totalCost + costs.get(cheapMin) * (costs.size() - 2);
            }
        }
        return totalCost;
    }
}
