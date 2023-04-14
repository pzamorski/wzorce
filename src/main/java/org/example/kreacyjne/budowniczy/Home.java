package org.example.kreacyjne.budowniczy;

public class Home {
    private int doorNumber;
    private int windowsNumber;
    private int numberFloors;

    private Home(int doorNumber, int windowsNumber, int numberFloors) {
        this.doorNumber = doorNumber;
        this.windowsNumber = windowsNumber;
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Home{" +
                "doorNumber=" + doorNumber +
                ", windowsNumber=" + windowsNumber +
                ", numberFloors=" + numberFloors +
                '}';
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public int getWindowsNumber() {
        return windowsNumber;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public static class Builder {
        private int doorNumber;
        private int windowsNumber;
        private int numberFloors;
        public Builder setDoorNumber(int doorNumber) {
            this.doorNumber = doorNumber;
            return this;
        }

        public Builder setWindowsNumber(int windowsNumber) {
            this.windowsNumber = windowsNumber;
            return this;
        }

        public Builder setNumberFloors(int numberFloors) {
            this.numberFloors = numberFloors;
            return this;
        }
        public Home build(){return new Home( doorNumber,  windowsNumber,  numberFloors) ;}
    }
}
