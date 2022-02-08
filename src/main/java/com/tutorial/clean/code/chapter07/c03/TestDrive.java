package com.tutorial.clean.code.chapter07.c03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDrive {

    private static final List<Cheese> cheesesInStock = new ArrayList<>();

    /**
     * @return a list containing all of the cheeses in the shop,
     *     or null if no cheeses are available for purchase.
     */
    public static List<Cheese> getInStockCheeses() { // Look main method
        return cheesesInStock.isEmpty() ? Collections.emptyList() : new ArrayList<>(cheesesInStock);
    }

    public static void main(String[] args){

        List<Cheese> cheeses = getInStockCheeses();

        if (cheeses != null && cheeses.contains(Cheese.CHEDDAR)) { // You need to check null
            System.out.println("We have cheese in stock");
        }

    }

}
