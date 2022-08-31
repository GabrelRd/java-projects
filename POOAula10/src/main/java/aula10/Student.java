
package aula10;

public class Student extends Person{
    private int registrationNum;
    private String course;

    public int getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(int registrationNum) {
        this.registrationNum = registrationNum;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    public void cancelRegistration(){
        
    }
}
