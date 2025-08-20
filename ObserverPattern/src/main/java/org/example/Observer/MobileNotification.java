package org.example.Observer;

import org.example.Observable.StockObservable;

public class MobileNotification implements NotificationObserver{

    String username;
    StockObservable observable;


    public MobileNotification(String username , StockObservable observable)
    {
        this.username = username;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessage(username, "product is in stock");
    }

    private void sendMessage(String username , String msg)
    {
        System.out.println("Msg sent to "+ username + msg);
    }
}
