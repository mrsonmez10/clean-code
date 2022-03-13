package com.tutorial.clean.code.chapter11.c01.abstractfactory.factories;

import com.tutorial.clean.code.chapter11.c01.abstractfactory.buttons.Button;
import com.tutorial.clean.code.chapter11.c01.abstractfactory.checkboxes.Checkbox;
import com.tutorial.clean.code.chapter11.c01.abstractfactory.buttons.MacOSButton;
import com.tutorial.clean.code.chapter11.c01.abstractfactory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
