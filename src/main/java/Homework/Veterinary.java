package Homework;

public class Veterinary extends MedicalStaff {

    private String giveDiagnostic;
    private String doSurgery;
    private String doExamination;
    private String giveMedicine;

    public Veterinary(String name) {
        super(name);
    }

    public String getGiveDiagnostic() {
        return giveDiagnostic;
    }

    public void setGiveDiagnostic(String giveDiagnostic) {
        this.giveDiagnostic = giveDiagnostic;
    }

    public String getDoSurgery() {
        return doSurgery;
    }

    public void setDoSurgery(String doSurgery) {
        this.doSurgery = doSurgery;
    }

    public String getDoExamination() {
        return doExamination;
    }

    public void setDoExamination(String doExamination) {
        this.doExamination = doExamination;
    }

    public String getGiveMedicine() {
        return giveMedicine;
    }

    public void setGiveMedicine(String giveMedicine) {
        this.giveMedicine = giveMedicine;
    }
}
