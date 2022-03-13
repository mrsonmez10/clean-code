package com.tutorial.clean.code.chapter11.c01.abstractfactory;

import com.tutorial.clean.code.chapter11.c01.abstractfactory.factories.GUIFactory;
import com.tutorial.clean.code.chapter11.c01.abstractfactory.factories.MacOSFactory;
import com.tutorial.clean.code.chapter11.c01.abstractfactory.factories.WindowsFactory;

public class Demo {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        osName = "mac";
        if(osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
