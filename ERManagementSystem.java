package EmergencyRoomSimulator;

import java.util.Scanner;

public class ERManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmergencyRoom emergencyRoom = new EmergencyRoom();
        System.out.println("Welcome to ER Management System :- ");
        while (true) {
            System.out.println("------------------------");
            System.out.println("1. Add Patient  ");
            System.out.println("2. Next Patient ");
            System.out.println("3. Display All Patient ");
            System.out.println("4. Exit ");
            System.out.println("--------------------------");
            System.out.println("Enter -> ");

            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.println("Patient Name : ");
                    String name = input.nextLine();
                    System.out.println("Patient age : ");
                    int age = input.nextInt();
                    System.out.println("SeverityLevel :");
                    int level = input.nextInt();
                    PatientNode patientNode = new PatientNode(name, age, level);
                    emergencyRoom.addPatient(patientNode);
                    System.out.println("Patient Add successfully ");

                }
                case 2 -> {
                    System.out.println("Next Patient : ");
                    emergencyRoom.treatNextPatient();
                }
                case 3 -> {
                    System.out.println("All Display Patient : ");
                    emergencyRoom.DisplayAllPatient();
                }
                case 4 -> {
                    System.out.println("Exit Successfully ");
                    System.exit(0);
                }
            }

        }
    }
}
