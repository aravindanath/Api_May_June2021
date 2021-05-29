package day2;

import java.util.List;

public class StudentFinalObject {


    /**
     * {
     *
     *     "firstName": "Oscar",
     *     "lastName": "Barclay",
     *     "email": "non.ante.bibendum@risusDonecegestas.edu",
     *     "programme": "Mechanical Engineering",
     *     "courses": [
     *         "Machine Element Design",
     *         "Engineering Analysis I",
     *         "Calculus & Linear Algebra I "
     *     ]
     * }
     */

    private String firstName;

    public StudentFinalObject(String firstName, String lastName, String email, String programme, List<String> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.programme = programme;
        this.courses = courses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    private String lastName;
    private String email;
    private String programme;
    private List<String> courses;

}
