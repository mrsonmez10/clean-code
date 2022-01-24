package com.tutorial.clean.code.chapter3.c04.solution;

import com.tutorial.clean.code.chapter3.c04.Money;

public abstract class Employee {
    public abstract boolean isPayday();
    public abstract Money calculatePay();
    public abstract void deliverPay(Money pay);
}
