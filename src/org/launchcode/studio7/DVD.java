package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String discName, String discType, double discStorage) {
        super(discName, discType, discStorage);
    }

    @Override
    public void spinDisc() {
        System.out.println("DVD is spinning");
    }

    @Override
    public void pauseDisc() {
        System.out.println("DVD is paused");
    }

    @Override
    public void stopDisc() {
        System.out.println("DVD is stopped");
    }

    @Override
    public void readInfoFromDisc() {
        System.out.println("DVD is being read");
    }

    @Override
    public void loadInfoToDisc() {
        System.out.println("Info is being loaded onto DVD");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
