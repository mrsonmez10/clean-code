package com.tutorial.clean.code.chapter11.c01.abstractfactory.factories;

import com.tutorial.clean.code.chapter11.c01.abstractfactory.buttons.Button;
import com.tutorial.clean.code.chapter11.c01.abstractfactory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
