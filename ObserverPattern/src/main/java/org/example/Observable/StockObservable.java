package org.example.Observable;

import org.example.Observer.NotificationObserver;


//ye to ho gya observale interface ye bahut chijo ka ho sakta hai
public interface StockObservable {

    void add(NotificationObserver obj);

    void remove(NotificationObserver obj);

    void notifySubscriber();

    void setstock (int data);

    int getstock();
}
