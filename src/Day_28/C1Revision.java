package Day_28;

import javax.print.Doc;

public class C1Revision {
    public static void main(String[] args) {
        Dentist d = new Dentist();
        d.treatPatient();

    }

}

abstract class Doctor{
    abstract void treatPatient();
    void eat(){
        System.out.println("Eating pizza");
    }
}

class Dentist extends Doctor{
    @Override
    void treatPatient() {
        System.out.println("Dentist is treating patient");
    }
}
