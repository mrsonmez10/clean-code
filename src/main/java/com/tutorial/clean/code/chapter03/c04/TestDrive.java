package com.tutorial.clean.code.chapter03.c04;

import java.math.BigDecimal;

public class TestDrive {

    public static void main(String[] args) {

        String isim = "Ali";
        switch (isim) {
            case "Ali":
                // TODO
                System.out.println("a");
                break;
            case"Veli":
            case"cenker":
                System.out.println("Yazdır");
            case"Bomba":
                System.out.println("sa");
            default:
                System.out.println("s");
        }


        BigDecimal senderMoney = null;
        BigDecimal receiverMoney = null;

    }

}
