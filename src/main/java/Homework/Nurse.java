package Homework;

public class Nurse extends  MedicalStaff{


    private String callingPatient;

    public Nurse(String name) {
        super(name);
    }

    public String getCallingPatient() {
        return callingPatient;
    }

    public void setCallingPatient(String callingPatient) {
        this.callingPatient = callingPatient;
    }
}
