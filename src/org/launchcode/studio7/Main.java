package org.launchcode.studio7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<String> myCdContent = new ArrayList<>();
        myCdContent.add("Church Girl");
        myCdContent.add("That Girl");

        ArrayList<String> myDvdContent = new ArrayList<>();
        myDvdContent.add("Jurassic Park Director's Cut");
        myDvdContent.add("Jurassic Park Bonus Footage");


        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD("Renaissance", 800, 400, myCdContent, "CD");
        DVD myDvd = new DVD("Jurassic Park", 5000,250, myDvdContent,"DVD");


        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCd.readData();
        myDvd.readData();

        System.out.println();

        myCd.storeData();
        myDvd.storeData();

        System.out.println();

        myCd.spinDisc();
        myDvd.spinDisc();

        System.out.println(myCd.diskInfo());
        System.out.println(myDvd.diskInfo());

        System.out.println(myCd.writeData(250));
        System.out.println(myDvd.writeData(250));
    }
}
