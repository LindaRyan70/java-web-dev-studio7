package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private int capacity;
    private int capacityUsed;
    private ArrayList<String> contents;
    private String discType;

    public BaseDisc(String name, int capacity, int capacityUsed, ArrayList<String> contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.capacityUsed = capacityUsed;
        this.contents = contents;
        this.discType = discType;
    }






    private int checkCapacity(int dataWritten) {
        if (capacity < dataWritten) {
            return capacity;
        }
        return dataWritten;
    }

    public String diskInfo() {
        String output = String.format("\nDisc name: %s\nDisc contents: %s\nMax capacity: %d\nSpace used: %d\nAvailable space: %d\nDisk type: %s", name, contents, capacity, capacityUsed, spaceLeft(), discType);
        return output;
    }

    private int spaceLeft() {
        return capacity - capacityUsed;
    }

    public String writeData(int dataSize) {
        if (dataSize > spaceLeft()) {
            return "Not enough disc space.";
        }
        capacityUsed += dataSize;
        return "\n" + dataSize + " MBs of data written to " + discType + ". Remaining space = " + spaceLeft() + " MBs.";
    }
}
