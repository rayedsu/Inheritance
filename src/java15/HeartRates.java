package java15;


public class HeartRates {
    private String firstname;
    private String lastname;
    private int birthyear;


    public HeartRates(String firstname, String lastname, int birthyear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthyear = birthyear;


    }

    public Integer calculateAge() {
        return 2021 - birthyear;
    }

    public Integer calculateMaximumHeartRate(){
        return 220-calculateAge();
    }

    public String calculateTargetHeartRate(){
        Integer max = calculateMaximumHeartRate();
        return "Your Target Heart Rate is between " + max*50/100 + " and " + max*85/100;
    }

    public void Calculate() {

        System.out.println("Your first name is:" + firstname);
        System.out.println("Your last name is:" + lastname);
        System.out.println("Your age is:" + calculateAge());

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}






