package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD cd = new CD("CD Example", 700, "CD-R", 350);
        DVD dvd = new DVD("DVD Example", 4700, "DVD-R", 1450);


        /* EXTRA - Use to test modified BaseDisc constructor that includes DVD-CLass-Only < String rating > field. */

//        DVD dvd = new DVD("DVD Example", 4700, "DVD-R", 1450, "Excellent");


        /* EXTRA - Use to test ADDED single param constructor in DVD Class I created to experiment with creating
         a DVD-Class object with only one (DVD-Class-only) rating field. Had to also create: an empty constructor
          in BaseDisc, and a new private rating field, a custom constructor, and a getRating() getter in DVD Class. */

        DVD dvdB = new DVD("Also Excellent");


        cd.spinDisc();
        dvd.spinDisc();

        cd.readData();
        dvd.readData();

        System.out.println(cd.writeData(275));
        System.out.println(dvd.writeData(8000));

        System.out.println(cd.diskInfo());
        System.out.println(dvd.diskInfo());


        /* EXTRA - Experimenting with printing only one parameter value from BaseDisc constructor. Had to add a getter
        to BaseDisc Class for name. Could add additional getters as needed for other BaseDisc fields from constructor. */

        System.out.println(dvd.getName());
        System.out.println(cd.getName());


        /* EXTRA - Use to test modified BaseDisc constructor with added DVD Class rating field to print ONLY the rating.
        Had to modify DVD Class to add <rating> field, add the getter, and the param to original BaseDisc constructor. */

//        System.out.println(dvd.getRating());  // prints Null if the modified dvd instance obj above is not turned on.


        /* EXTRA - Use to test ADDED single param constructor in DVD Class I created. Experimenting with printing
        the unique DVD-Class-only field by creating an empty constructor in BaseDisc Class which allowed me
        to create a custom single param constructor in DVD Class for DVD-Class-only <rating> field. */

//        System.out.println(dvdB.getRating());

    }
}
