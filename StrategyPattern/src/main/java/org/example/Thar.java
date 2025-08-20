package org.example;

import org.example.stradegy.OffRoadDrive;

public class Thar extends Vehicle{

    Thar()
    {
        super(new OffRoadDrive());
    }
}
