package com.tutorial.clean.code.chapter4.c06;

import java.util.concurrent.atomic.AtomicBoolean;

public class TestDrive{

    /*
    public void testConcurrentAddWidgets() throws Exception{
        WidgetBuilder widgetBuilder = new WidgetBuilder(new Class[]{BoldWidget.class});
        String text = "'''bold text'''";
        ParentWidget parent = new BoldWidget(new MockWidgetRoot(), "'''bold text'''");
        AtomicBoolean failFlag = new AtomicBoolean();
        failFlag.set(false);

        //This is our best attempt to get a race condition
        //by creating large number of threads.
        for(int i = 0; i < 25000; i++){
            WidgetBuilderThread widgetBuilderThread = new WidgetBuilderThread(widgetBuilder, text, parent, failFlag);
            Thread thread = new Thread(widgetBuilderThread);
            thread.start();
        }
        assertEquals(false, failFlag.get());
    }
     */

}
