package org.example;

import org.example.stradegy.Drive;

public class Vehicle {

    Drive driveobj;

    Vehicle(Drive driveobj)
    {
        this.driveobj = driveobj;
    }

    public void drive()
    {
        driveobj.Drive();
    }

}
