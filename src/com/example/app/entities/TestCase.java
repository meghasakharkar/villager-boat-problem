package com.example.app.entities;

import java.util.ArrayList;
import java.util.List;

public class TestCase {
    private int numberOfVillages;
    private List<Integer> costs;

    public TestCase() {
        costs = new ArrayList<>();
    }

    public int getNumberOfVillages() {
        return numberOfVillages;
    }

    public void setNumberOfVillages(int numberOfVillages) {
        this.numberOfVillages = numberOfVillages;
    }

    public List<Integer> getCosts() {
        return costs;
    }

    public void setCosts(List<Integer> costs) {
        this.costs = costs;
    }

    @Override
    public String toString() {
        return "TestCase{" +
                "numberOfVillages=" + numberOfVillages +
                ", costs=" + costs +
                '}';
    }
}
