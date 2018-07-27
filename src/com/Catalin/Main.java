package com.Catalin;

public class Main {

    public static void main(String[] args) {
        /** Inheritance = vehicle class and car class, the car extends the vehicle, the car is a vehicle, this is
         * an "is" relationship.
         * Composition = "has" relationship, a computer had a monitor, a motherboard etc. The computer is not
         * a motherboard and the monitor is not a computer, etc. They are parts of the computer as a whole.
         * Look in the PC class.
         */

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

//        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, nativeResolution);
        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540, 1440));
        /** If you don't need to create a variable and you only want to pass the values to a method, you can create an
         * instance of a class, without using a variable. "new Resolution(2540, 1440)".
         */
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        /** Now that we have instantiated the classes, creating objects, we can start building the PC.
         */

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        /** As a general rule, in most situations, it would be better to use composition instead of inheritance, it adds
         * more flexibility.
         */

    }
}