package org.launchcode.studio7;

public class DVD extends BaseDisc implements  OpticalDisc {

   /* EXTRA - Experimented with adding a unique DVD-Class-only field < String rating > to create new objects,
   access and print rating field value. Had to add private instance field to use in modified constructor lower down. */

    private String rating;


    /* ORIGINAL DEBUGGING STUDIO CONSTRUCTOR FOR CLASS - w/o any < String rating > private (DVD CLass-only)
     instance field added. */
    public DVD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }


    /* EXTRA - Modified version of orig constructor above to add a DVD-Class-only param <String rating> per field above.
    * To test the addition of <String aRating> within the original constructor, toggle this on and the above one off.
    * Then ALSO add the appropriate rating string to the new DVD object creations on Main and turn on the println's!  */

//    public DVD(String aName, int maxCapacity, String aType, int someUsedCapacity, String aRating) { // , String aRating
//        super(aName, maxCapacity, aType, someUsedCapacity);
//        rating = aRating;   // Added to inherited BaseDisc constructor to initialize rating field above.
//    }


    /* EXTRA - Added custom constructor below to enable passing ONLY the DVD-Class-only <rating> field param. Also,
    had to add empty constructor in the BaseDisc Class!  */

    public DVD(String aRating) {
        rating = aRating;
    }


    /*  EXTRA - Added this getter in order to access/print a DVD-Class-only <rating> field param.  */

    public String getRating() {
        return rating;
    }


    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("I'm sorry, Dave. I'm afraid I can't do that.");
    }


}


