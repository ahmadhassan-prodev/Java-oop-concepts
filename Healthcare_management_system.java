import java.util.Scanner;

class Patient{
    private int patientID;
    private String name;
    private int age;
    private String medicalHistory;
    private String prescriptions;

    Patient()
    {
        patientID = 0;
        name = null;
        age = 0;
        medicalHistory = null;
        prescriptions = null;
    }

    void addPatient()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("***Add a patient***");
        System.out.print("Enter patient ID: ");
        patientID = s.nextInt();
        s.nextLine();
        System.out.print("Enter patient name: ");
        name = s.nextLine();
        System.out.print("Enter patient age: ");
        age = s.nextInt();
    }

    void updateMedicalRecord()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Medical History: ");
        medicalHistory = s.nextLine();
        System.out.print("Enter Prescription: ");
        prescriptions = s.nextLine();

    }

    void updatePatient()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = s.nextLine();
        System.out.print("Enter age: ");
        age = s.nextInt();
    }

    void viewPersonalDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void viewMedicalDetails()
    {
        System.out.println("Medical History: " + medicalHistory);
        System.out.println("Prescriptions: " + prescriptions);
    }

    int getPatientID()
    {
        return patientID;
    }
}

public class Healthcare_management_system {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Patient[] P = new Patient[10];
        for(int i=0; i<10; i++)
        {
            P[i] = new Patient();
        }
        int patient = 0;
        int role;
        char loop;
        do {
            System.out.println("\n***Select your role***");
            System.out.println("1: Administrator\n2: Doctor\n3: Patient\n0: Exit");
            role = s.nextInt();
            switch (role) {
                case 1:
                    if(patient<10) {
                        do {
                            P[patient].addPatient();
                            patient++;
                            System.out.println("Do you want to perform another process?Y/N");
                            loop = s.next().charAt(0);
                        } while (loop == 'y' || loop == 'Y');
                    }
                    else
                        System.out.println("Limit exceeded..");
                    break;
                case 2:
                    System.out.print("Enter your Doctor ID: ");
                    int dID = s.nextInt();
                    if (dID == 1379) {
                        do{
                        System.out.println("*Choose Process*\n1: View record\n2: Add/Update Record");
                        int p = s.nextInt();
                        if (p == 1) {
                            System.out.print("Enter patient ID: ");
                            int pID = s.nextInt();
                            for (int i = 0; i < 10; i++) {
                                if (pID == P[i].getPatientID()) {
                                    P[i].viewMedicalDetails();
                                    break;
                                }
                                else if(i==9)
                                    System.out.println("Invalid Patient ID!");
                            }
                        } else if (p == 2) {
                            System.out.println("***Add/Update Patient Medical Record***");
                            System.out.print("Enter patient ID: ");
                            int pID = s.nextInt();
                            for (int i = 0; i < 10; i++) {
                                if (pID == P[i].getPatientID()) {
                                    P[i].updateMedicalRecord();
                                    break;
                                }
                                else if(i==9)
                                    System.out.println("Invalid Patient ID!");
                            }
                        } else {
                            System.out.print("Access denied: You are not an Authorized doctor.");
                        }
                            System.out.println("Do you want to perform another process?Y/N");
                            loop = s.next().charAt(0);
                    }while(loop=='y'||loop=='Y');
                    }
                    else
                        System.out.println("Access denied: You are not an authorized doctor!");
                    break;
                case 3:
                    do {
                        System.out.println("*Choose Process*\n1: View Personal Details\n2: Update Personal Details");
                        int p = s.nextInt();
                        if (p == 1) {
                            System.out.print("Enter patient ID: ");
                            int pID = s.nextInt();
                            for (int i = 0; i < 10; i++) {
                                if (pID == P[i].getPatientID()) {
                                    P[i].viewPersonalDetails();
                                    break;
                                }
                                else if(i==9)
                                    System.out.println("Invalid Patient ID!");
                            }
                        } else if (p == 2) {
                            System.out.println("***Update personal details***");
                            System.out.print("Enter patient ID: ");
                            int pID = s.nextInt();
                            for (int i = 0; i < 10; i++) {
                                if (pID == P[i].getPatientID()) {
                                    P[i].updatePatient();
                                    break;
                                }
                                else if(i==9)
                                    System.out.println("Invalid Patient ID!");
                            }
                        } else
                            System.out.println("Invalid choice!");
                        System.out.println("Do you want to perform another process?Y/N");
                        loop = s.next().charAt(0);
                    }while(loop=='y'||loop=='Y');
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(role!=0);
    }
}
