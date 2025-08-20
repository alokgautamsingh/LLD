package org.example.Observable;


import org.example.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

//ab observable to bna liye ab kispe observable lgana ahai wo product
// pr v to dekhna hai
public class IphoneObservableImpl implements StockObservable{

    public List<NotificationObserver> observerList = new ArrayList<>();


    public int stockcount =  0;

    @Override
    public void add(NotificationObserver obj) {
        observerList.add(obj);
    }

    @Override
    public void remove(NotificationObserver obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationObserver obj :observerList)
        {
            obj.update();
        }
    }

    @Override
    public void setstock(int data) {
        if(stockcount ==0)
            notifySubscriber();
        stockcount += data;
    }

    @Override
    public int getstock() {
        return stockcount;
    }
}
