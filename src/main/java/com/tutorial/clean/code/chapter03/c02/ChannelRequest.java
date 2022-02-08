package com.tutorial.clean.code.chapter03.c02;

public class ChannelRequest {

    private boolean isPostback;
    private boolean isEarlyControl;
    private boolean firstContact;

    public boolean isPostback() {
        return isPostback;
    }

    public void setPostback(boolean postback) {
        isPostback = postback;
    }

    public boolean isEarlyControl() {
        return isEarlyControl;
    }

    public void setEarlyControl(boolean earlyControl) {
        isEarlyControl = earlyControl;
    }

    public boolean isFirstContact() {
        return firstContact;
    }

    public void setFirstContact(boolean firstContact) {
        this.firstContact = firstContact;
    }

}
