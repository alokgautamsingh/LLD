package org.example;

import org.example.Observable.IphoneObservableImpl;
import org.example.Observable.StockObservable;
import org.example.Observer.EmailNotification;
import org.example.Observer.MobileNotification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        //first making observable obj

        StockObservable iphoneObservableobj = new IphoneObservableImpl();
        EmailNotification emailNotification = new EmailNotification("alok@gmail.com", iphoneObservableobj);
        EmailNotification emailNotification1 = new EmailNotification("ap@gmail.com",iphoneObservableobj);
        MobileNotification mobileNotification = new MobileNotification("alok",iphoneObservableobj);

        iphoneObservableobj.add(emailNotification);
        iphoneObservableobj.add(emailNotification1);
        iphoneObservableobj.add(mobileNotification);

        iphoneObservableobj.setstock(10);

    }
}