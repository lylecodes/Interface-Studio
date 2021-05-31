package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD cd = new CD("myCD", "CD", 500);
        DVD dvd = new DVD("myDVD", "DVD", 1000);

        cd.loadInfoToDisc();
        cd.readInfoFromDisc();
        cd.spinDisc();
        cd.pauseDisc();
        cd.stopDisc();

        dvd.loadInfoToDisc();
        dvd.readInfoFromDisc();
        dvd.spinDisc();
        dvd.pauseDisc();
        dvd.stopDisc();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
