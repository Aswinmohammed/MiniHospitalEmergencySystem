public class HospitalApp {

    public static void main(String[] args) {

        System.out.println(" MINI HOSPITAL EMERGENCY SYSTEM ");
        System.out.println("-".repeat("MINI HOSPITAL EMERGENCY SYSTEM ".length()));


        Patient patient1 = new Patient(
                101,
                "Aswin",
                23,
                "0778514532",
                "Fever"
        );

        Patient patient2 = new Patient(
                102,
                "Arsath",
                35,
                "0719876543",
                "Chest Pain"
        );

        System.out.println("\nPatient 1");
        patient1.displayPatient();

        System.out.println("\nPatient 2");
        patient2.displayPatient();
    }
}