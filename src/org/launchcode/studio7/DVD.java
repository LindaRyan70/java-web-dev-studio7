package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc{

    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    };
    public void readData() {
        System.out.println("Now playing a DVD!");
    };

    public void storeData() {
        System.out.println("DVD Data is stored!");

    };

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public DVD(String name, int capacity, int capacityUsed, ArrayList<String> contents, String discType) {
        super(name, capacity, capacityUsed, contents, discType);


    }

}
