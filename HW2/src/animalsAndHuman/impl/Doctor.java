package animalsAndHuman.impl;

public class Doctor extends Human{
    private String jobPlace;
    public Doctor(String name, Integer age, String profession, String jobPlace){
        super(name, age, "doctor");
        this.jobPlace = jobPlace;
    }
    public  Doctor(String name){
        this(name, 0, "doctor", null);
    }

    public void treat(){
        System.out.printf("%s %s said: Take medicine immediately!\n", getType(), getName());
    }
    public void takeVacation() {
        System.out.println("took vacation");
    }


}
