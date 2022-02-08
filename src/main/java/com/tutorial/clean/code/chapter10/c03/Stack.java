package com.tutorial.clean.code.chapter10.c03;

import java.util.LinkedList;
import java.util.List;

public class Stack {
    private int topOfStack = 0;
    List<Integer> elements = new LinkedList<>();

    public int size() {
        return topOfStack;
    }

    public void push(int element) {
        topOfStack++;
        elements.add(element);
    }

    public int pop() throws PoppedWhenEmpty {
        if (topOfStack == 0)
            throw new PoppedWhenEmpty();
        int element = elements.get(--topOfStack);
        elements.remove(topOfStack);
        return element;
    }
}
