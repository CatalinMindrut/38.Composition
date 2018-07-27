package com.Catalin;

public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    /**Using extends here, would constitute a problem because you can only extend one class at a time.
     * Here we are actually using 3 different classes, Case, Monitor and Motherboard.
     * These are declared similar to data types, having theCase of type Case, monitor of type Monitor and
     * motherboard of type Motherboard. Just like having a number of type int or double.
     */

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.theMonitor = monitor;
        this.theMotherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return theMonitor;
    }

    public Motherboard getMotherboard() {
        return theMotherboard;
    }
    public  void powerUp(){
        getTheCase().pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        getMonitor().drawPixelAt(1200, 50, "yellow");
    }
    /** You can either call the getters or the class directly:
     * getMonitor().drawPixelAt
     * monitor.drawPixelAt
     */
}
