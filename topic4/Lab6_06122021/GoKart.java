public class GoKart {
    private String name; // customer name
    private String typeOfCar; // couple or single seat
    private String strokeEngine; // 200cc or 150cc
    private int option; // 1- quick experience
    // 2- race adventure
    private int numberOfLaps;
    private boolean safetySet;// true if choose safety set

    public GoKart(String name, String type, String stroke, int option, int numLap, boolean safetySet) {
        this.name = name;
        typeOfCar = type;
        strokeEngine = stroke;
        this.option = option;
        numberOfLaps = numLap;
        this.safetySet = safetySet;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.typeOfCar;
    }

    public String getEngineStroke() {
        return this.strokeEngine;
    }

    public int getOption() {
        return this.option;
    }

    public int getNumLaps() {
        return this.numberOfLaps;
    }

    public boolean getSafetySet() {
        return this.safetySet;
    }

    public String toString() {
        String optionString;

        if (option == 1)
            optionString = "1. Quick Adventure";
        else
            optionString = "2. Race Adventure";

        return (
            "Customer Name : " + name + "\n" +
            "Type of Car   : " + typeOfCar + "\n" +
            "Stroke Engine : " + strokeEngine + "\n" +
            "Option        : " + optionString + "\n" +
            "Number of Laps: " + numberOfLaps + "\n" +
            "Safety Set    : " + safetySet + "\n"
        );
    }
}
