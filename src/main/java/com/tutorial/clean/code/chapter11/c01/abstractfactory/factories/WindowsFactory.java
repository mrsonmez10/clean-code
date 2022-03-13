package com.tutorial.clean.code.chapter11.c01.abstractfactory.factories;

import com.tutorial.clean.code.chapter11.c01.abstractfactory.buttons.Button;
import com.tutorial.clean.code.chapter11.c01.abstractfactory.checkboxes.Checkbox;
import com.tutorial.clean.code.chapter11.c01.abstractfactory.buttons.WindowsButton;
import com.tutorial.clean.code.chapter11.c01.abstractfactory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
