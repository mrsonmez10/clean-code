package com.tutorial.clean.code.chapter09.c02;

public class BookExampleRefactored {

    /*


    public void testGetPageHierarchyAsXml() throws Exception {
        makePages("PageOne", "PageOne.ChildOne", "PageTwo");
        submitRequest("root", "type:pages");
        assertResponseIsXML();
        assertResponseContains(
                "<name>PageOne</name>", "<name>PageTwo</name>", "<name>ChildOne</name>"
        );
    }
    public void testSymbolicLinksAreNotInXmlPageHierarchy() throws Exception {
        WikiPage page = makePage("PageOne");
        makePages("PageOne.ChildOne", "PageTwo");
        addLinkTo(page, "PageTwo", "SymPage");
        submitRequest("root", "type:pages");
        assertResponseIsXML();
        assertResponseContains(
                "<name>PageOne</name>", "<name>PageTwo</name>", "<name>ChildOne</name>"
        );
        assertResponseDoesNotContain("SymPage");
    }

     public void testGetDataAsXml() throws Exception {
        makePageWithContent("TestPageOne", "test page");
        submitRequest("TestPageOne", "type:data");
        assertResponseIsXML();
        assertResponseContains("test page", "<Test");
     }

     */

}
