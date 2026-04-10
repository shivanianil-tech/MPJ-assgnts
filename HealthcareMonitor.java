class DataCollection extends Thread {
    public void run() {
        try {
            int heartRate = (int)(Math.random() * 120);

            if (heartRate <= 0) {
                throw new Exception("Invalid Sensor Reading");
            }

            System.out.println("Collected Heart Rate: " + heartRate + " bpm");

        } catch (Exception e) {
            System.out.println("Error in Data Collection: " + e.getMessage());
        }
    }
}

class DataAnalysis extends Thread {
    public void run() {
        try {
            int heartRate = (int)(Math.random() * 120);

            if (heartRate <= 0) {
                throw new Exception("Invalid Data for Analysis");
            }

            if (heartRate > 100) {
                System.out.println("Alert: High Heart Rate!");
            } else {
                System.out.println("Heart Rate Normal.");
            }

        } catch (Exception e) {
            System.out.println("Error in Data Analysis: " + e.getMessage());
        }
    }
}

public class HealthcareMonitor {
    public static void main(String[] args) {

        DataCollection t1 = new DataCollection();
        DataAnalysis t2 = new DataAnalysis();

        t1.start();
        t2.start();

    }
}