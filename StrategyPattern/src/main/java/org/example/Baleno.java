package org.example;

import org.example.stradegy.NormalDrive;

public class Baleno extends Vehicle{

    Baleno()
    {
       super(new NormalDrive());
    }
}
