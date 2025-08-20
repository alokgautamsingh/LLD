package org.example.Observer;

import org.example.Observable.StockObservable;

public class EmailNotification implements NotificationObserver{

    public String email;
    StockObservable observable;


    public EmailNotification(String email , StockObservable obj)
    {
        this.email = email;
        this.observable = obj;
    }

    @Override
    public void update() {
        sendMail(email, "product is in stock");
    }

    public void sendMail(String email , String msg)
    {
        System.out.println("mail sent to "+email + msg);
    }

}
