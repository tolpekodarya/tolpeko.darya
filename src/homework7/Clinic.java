package homework7;

class Doctor {
    public void treat() {
        System.out.println("Врач лечит пациента");
    }
}
class Surgeon extends Doctor {
    public void treat() {
        System.out.println("Хирург делает операцию");
    }
}
class Therapist extends Doctor {
    public void treat() {
        System.out.println("Терапевт назначает лекарства");
    }
    public void assignDoctor(Patient patient) {
        if (patient.plan == 1) {
            patient.doctor = new Surgeon();
        } else if (patient.plan == 2) {
            patient.doctor = new Dentist();
        } else {
            patient.doctor = new Therapist();
        }
        patient.doctor.treat();
    }
}
class Dentist extends Doctor {
    public void treat() {
        System.out.println("Дантист лечит зубы");
    }
}
class Patient {
    int plan;
    Doctor doctor;
    Patient(int plan) {
        this.plan = plan;
    }
}
public class Clinic {
    public static void main(String[] args) {
        Therapist therapist = new Therapist();


        Patient p1 = new Patient(1);

        System.out.println("Пациент с планом 1:");
        therapist.assignDoctor(p1);

        Patient p2 = new Patient(2);

        System.out.println("\nПациент с планом 2:");
        therapist.assignDoctor(p2);

        Patient p3 = new Patient(3);

        System.out.println("\nПациент с планом 3:");
        therapist.assignDoctor(p3);
    }
}