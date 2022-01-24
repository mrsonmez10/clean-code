package com.tutorial.clean.code.chapter3.c02;

import org.springframework.beans.factory.annotation.Autowired;

public class GoodExample {

    @Autowired
    private HelperClass helperClass;

    // Soru bu fonksiyonun içinden x tane daha fonsiyon çıkar mı??
    public void getAnswerFlow(ChannelRequest channelRequest) {
        if (!checkNlpNeed(channelRequest)){
            helperClass.getButtonAnswer();
        }
        getAnswerWithNlpEngine(channelRequest);
    }

    public boolean checkNlpNeed(ChannelRequest channelRequest) {
        if (channelRequest.isEarlyControl() && channelRequest.isPostback()) {
            return false;
        }
        return true;
    }

    public void getAnswerWithoutNlpEngine(ChannelRequest channelRequest) {
        helperClass.getEarlyAnswer();
    }

    public void getAnswerWithNlpEngine(ChannelRequest channelRequest) {
        String nlpResult = helperClass.nlpEngine();
        helperClass.getAnswer(nlpResult);
    }

}
