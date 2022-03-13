package com.tutorial.clean.code.chapter11.c01.abstractfactory;

import com.tutorial.clean.code.chapter11.c01.abstractfactory.buttons.Button;
import com.tutorial.clean.code.chapter11.c01.abstractfactory.checkboxes.Checkbox;
import com.tutorial.clean.code.chapter11.c01.abstractfactory.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
