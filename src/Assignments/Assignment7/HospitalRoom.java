package Assignments.Assignment7;

public class HospitalRoom {
    private final int MAX_DOC_NUM = 1;
    private final int MAX_PAT_NUM = 3;
    private static int docNum = 0;
    private static int patNum = 0;


    public HospitalRoom() {
    }

    public synchronized boolean doctorEnter(Doctor d) throws InterruptedException {
        try {
            //Thread.sleep(500);
            if (docNum==0){
                System.out.println("Doctor "+d.name+" Entered, number of doctor 1");
                docNum = 1;
                return true;
            }else {
                System.out.println("Doctor "+d.name+" is waiting to Enter, number of doctor 1");
                Thread.sleep(50);
                return false;
            }

        }catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean doctorLeave(Doctor d){
        System.out.println("Doctor "+d.name+" Left, number of doctor 0");
        docNum = 0;
        return true;
    }

    public synchronized boolean patientEnter(Patient p) throws InterruptedException {
        try {
            if (patNum< MAX_PAT_NUM){
                patNum++;
                System.out.println("Patient "+p.name+" entered, number of patients "+patNum);
                return true;
            }else {
                System.out.println("Patient "+p.name+" is waiting to enter, number of patients 3");
                Thread.sleep(50);
                return false;
            }

        }catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean patientLeave(Patient p){
        System.out.println("Patient "+p.name+" left");
        patNum--;
        return true;
    }

}

class Doctor {
    public String name;
    public Doctor(String name) {
        this.name = name;
    }
}

class Patient {
    public String name;
    public Patient(String name) {
        this.name = name;
    }
}

class Main2 {
    public static void main(String[] args) {
        HospitalRoom room = new HospitalRoom();
        Doctor siva = new Doctor("siva");
        Doctor john = new Doctor("john");
        Patient p1 = new Patient("p1");
        Patient p2 = new Patient("p2");
        Patient p3= new Patient("p3");
        Patient p4 = new Patient("p4");
        Patient p5 = new Patient("p5");
        Thread doctor1 = new Thread(() -> {
            try {
                while(!room.doctorEnter(siva)) {}
                Thread.sleep(500);
                while(!room.doctorLeave(siva)) {}

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread doctor2 = new Thread(() -> {
            try {
                while(!room.doctorEnter(john)) {}
                Thread.sleep(500);
                while(!room.doctorLeave(john)) {}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient1 = new Thread(() -> {
            try {
                    while(!room.patientEnter(p1)) {}
                Thread.sleep(500);
                    while(!room.patientLeave(p1)) {}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient2 = new Thread(() -> {
            try {
                while(!room.patientEnter(p2)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p2)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient3 = new Thread(() -> {
            try {
                while(!room.patientEnter(p3)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p3)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient4 = new Thread(() -> {
            try {
                while(!room.patientEnter(p4)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p4)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient5 = new Thread(() -> {
            try {
                while(!room.patientEnter(p5)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p5)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        doctor1.start();
        doctor2.start();
        patient1.start();
        patient2.start();
        patient3.start();
        patient4.start();
        patient5.start();
    }

    /*
    OUTPUT:

    Doctor siva Entered, number of doctor 1
    Patient p3 entered, number of patients 1
    Patient p4 entered, number of patients 2
    Patient p2 entered, number of patients 3
    Patient p1 is waiting to enter, number of patients 3
    Patient p1 is waiting to enter, number of patients 3
    Patient p1 is waiting to enter, number of patients 3
    Patient p1 is waiting to enter, number of patients 3
    Patient p1 is waiting to enter, number of patients 3
    Patient p1 is waiting to enter, number of patients 3
    Patient p1 is waiting to enter, number of patients 3
    Patient p1 is waiting to enter, number of patients 3
    Patient p1 is waiting to enter, number of patients 3
    Doctor john is waiting to Enter, number of doctor 1
    Doctor siva Left, number of doctor 0
    Patient p3 left
    Patient p4 left
    Patient p2 left
    Doctor john Entered, number of doctor 1
    Patient p1 entered, number of patients 1
    Patient p5 entered, number of patients 2
    Doctor john Left, number of doctor 0
    Patient p1 left
    Patient p5 left
    */
}
