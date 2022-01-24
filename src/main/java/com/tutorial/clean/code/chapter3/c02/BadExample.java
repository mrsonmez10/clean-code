package com.tutorial.clean.code.chapter3.c02;

import org.springframework.beans.factory.annotation.Autowired;

public class BadExample {

    @Autowired
    private HelperClass helperClass;

    // Soru bu fonksiyonun içinden x tane daha fonsiyon çıkar mı??
    public void getAnswerFlow(ChannelRequest channelRequest) {
        if (channelRequest.isPostback() && channelRequest.isEarlyControl()){ // Ne anlatıyor?
            /*

             */
            helperClass.getButtonAnswer();
        }
        String nlpResult = helperClass.nlpEngine();
        /*
            Uzayabilir...
         */
        helperClass.getAnswer(nlpResult);
    }

}
