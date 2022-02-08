package com.tutorial.clean.code.chapter03.c10;

public class UserValidator{
    private Cryptographer cryptographer;

    public boolean checkPasswordAndInitializeSession(String userName, String password){
        User user = UserGateway.findByName(userName);
        if(user != User.NULL){
            String codedPhrase = user.getPhraseEncodedByPassword();
            String phrase = cryptographer.decrypt(codedPhrase, password);
            if("Valid Password".equals(phrase)){
                Session.initialize();
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        UserValidator us = new UserValidator();

        us.checkPasswordAndInitializeSession("Furkan","furkan123");

    }

}

