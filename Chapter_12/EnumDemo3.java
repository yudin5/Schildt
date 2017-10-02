package Chapter_12;

// Use an enum constructor, instance variable, and method.
enum TransportDemo3 {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed; // typical speed of each transport

    // Constructor
    TransportDemo3(int s) { speed = s; }

    int getSpeed() { return speed; }
}

class EnumDemo3 {
    public static void main(String args[])
    {
        TransportDemo3 tp;

        // Display speed of an airplane.
        System.out.println("Typical speed for an airplane is " +
                TransportDemo3.AIRPLANE.getSpeed() +
                " miles per hour.\n");

        // Display all Transports and speeds.
        System.out.println("All Transport speeds: ");
        for(TransportDemo3 t : TransportDemo3.values())
            System.out.println(t + " typical speed is " +
                    t.getSpeed() +
                    " miles per hour.");
    }
}
