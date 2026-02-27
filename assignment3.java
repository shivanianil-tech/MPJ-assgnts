class Fare {

    int tripId;
    double distance;
    String passengerType;
    double baseFare;

    Fare(int tripId, double distance, String passengerType, double baseFare) {
        this.tripId = tripId;
        this.distance = distance;
        this.passengerType = passengerType;
        this.baseFare = baseFare;
    }

    double calculateFare(double distance) {
        return baseFare + distance * 2;
    }

    double calculateFare(double distance, String passengerType) {

        if(passengerType.equals("Student"))
            return baseFare + distance * 1.5;

        else
            return baseFare + distance * 2;
    }
}

class BusFare extends Fare {

    BusFare(int tripId, double distance, String passengerType, double baseFare) {
        super(tripId, distance, passengerType, baseFare);
    }

    double calculateFare(double distance) {
        return baseFare + distance * 1; // Bus cheaper
    }
}

public class Main {

    public static void main(String[] args) {

        Fare f = new Fare(101, 10, "Adult", 5);

        System.out.println("Normal Fare = " + f.calculateFare(10));
        System.out.println("Student Fare = " + f.calculateFare(10,"Student"));

        BusFare b = new BusFare(102, 10, "Adult", 5);

        System.out.println("Bus Fare = " + b.calculateFare(10));

    }
}