package org.launchcode.studio7;

public abstract class BaseDisc {

    private String discName;
    private String discType;
    private final double discStorage;
    private boolean isBeingRead = false;
    private boolean isSpinning = false;
    private boolean isPaused = false;
    private boolean isStopped = false;

    public BaseDisc(String discName, String discType, double discStorage) {
        this.discName = discName;
        this.discType = discType;
        this.discStorage = discStorage;
    }

    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public double getDiscStorage() {
        return discStorage;
    }

    public boolean getIsSpinning() {
        return isSpinning;
    }

    public void setIsSpinning(boolean isSpinning) {
        this.isSpinning = isSpinning;
    }

    public boolean getIsBeingRead() {
        return isBeingRead;
    }

    public void setBeingRead(boolean isBeingRead) {
        this.isBeingRead = isBeingRead;
    }

    public boolean getIsPaused() {
        return isPaused;
    }

    public void setPaused(boolean paused) {
        isPaused = paused;
    }

    public boolean getIsStopped() {
        return isStopped;
    }

    public void setIsStopped(boolean isStopped) {
        this.isStopped = isStopped;
    }
}
