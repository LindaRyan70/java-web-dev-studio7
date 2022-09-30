package org.launchcode.studio7;
import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String diskType;
    private ArrayList<String> contents;

    public BaseDisc(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        name = aName;
        storageCapacity = maxCapacity;
        diskType = aType;
        capacityUsed = checkCapacity(someUsedCapacity);
        remainingCapacity = spaceLeft();
    }

    /*  EXTRA - When experimenting to add DVD-Class-only fields, I needed to add this empty constructor to create a
    custom constructor in DVD Class to allow for creating a DVD obj with only the DVD Class rating field in Main:
    DVD dvdB = new DVD(aRating: "Also Excellent");   */
    public BaseDisc() {
    }

    /* EXTRA - Added Getter in order to print individual DVD Class or CD Class name values from the new Object instances
     on Main.Could add other getters for each BaseDisc Class field, as needed for access. */
    public String getName() {
        return name;
    }



    private int checkCapacity(int dataWritten) {
        if (storageCapacity < dataWritten){
            return storageCapacity;
        }
        return dataWritten;
    }

    private int spaceLeft(){
        return storageCapacity - capacityUsed;
    }

    public String diskInfo(){
        String output = String.format("\nDisk Name: %s\nMax capacity: %d" +
                "\nSpace used: %d" +
                "\nAvailable space: %d\n", name, storageCapacity, capacityUsed, remainingCapacity);
        return output;
    }

    public String writeData(int dataSize){
        if (dataSize > remainingCapacity){
            return "Not enough disc space!";
        }
        capacityUsed += dataSize;
        remainingCapacity -= dataSize;

        return "Data written to disc.  Remaining space = " + remainingCapacity;
    }

}
