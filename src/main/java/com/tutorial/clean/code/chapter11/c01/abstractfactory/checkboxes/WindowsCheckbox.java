package com.tutorial.clean.code.chapter11.c01.abstractfactory.checkboxes;

/**
 * All products families have the same varieties (MacOS/Windows).
 * <p>
 * This is another variant of a checkbox.
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
