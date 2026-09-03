public class HospitalApp {

    public static void main(String[] args) {
        System.out.println( " MINI HOSPITAL EMERGENCY SYSTEM ");
        System.out.println( "----------------------------" );

        PatientBST bst = new PatientBST();

        Patient p1 = new Patient(
                105,
                "Ahamed",
                23,
                "0771234567",
                "Fever"
        );

        Patient p2 = new Patient(
                102,
                "Nimal",
                35,
                "0719876543",
                "Chest Pain"
        );


        Patient p3 = new Patient(
                110,
                "Kamal",
                46,
                "0761112233",
                "High Blood Pressure"
        );


        Patient p4 = new Patient(
                101,
                "Sunil",
                29,
                "0754445566",
                "Headache"
        );


        Patient p5 = new Patient(
                108,
                "Amal",
                40,
                "0779998877",
                "Back Pain"
        );

        // Insert patients

        bst.insert(p1);
        bst.insert(p2);
        bst.insert(p3);
        bst.insert(p4);
        bst.insert(p5);


        // Display patients

        bst.displayAllPatients();

        // Search patient

        System.out.println( "\nSearching Patient ID 108..." );


        Patient foundPatient =
                bst.search(108);


        if (foundPatient != null) {

            System.out.println( "Patient found:");

            foundPatient.displayPatient();

        } else {

            System.out.println( "Patient not found.");
        }


        // Delete patient

        System.out.println( "\nDeleting Patient ID 102...");

        bst.delete(102);

        // Display after deletion

        bst.displayAllPatients();
    }
}