package java8;

import java.util.Arrays;
import java.util.List;

public class Employees {

    private String empId;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String newJoiner;
    private int salary;
    private int rating;

    public Employees() {
    }

    public Employees(String empId, String firstName, String lastName, String email, String gender, String newJoiner, int salary, int rating) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.newJoiner = newJoiner;
        this.salary = salary;
        this.rating = rating;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNewJoiner() {
        return newJoiner;
    }

    public void setNewJoiner(String newJoiner) {
        this.newJoiner = newJoiner;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empId='" + empId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", newJoiner='" + newJoiner + '\'' +
                ", salary=" + salary +
                ", rating=" + rating +
                '}';
    }
    public static List<Employees> getEmpList() {
        return Arrays.asList(
                new Employees("59-385-1088", "Zacharias", "Schwerin", "zchwerin@gmail.com", "Male", "True", 101146, 0),
                new Employees("73-274-6476", "Kyle", "Frudd", "kfrudd1@ovh.net", "Male", "FALSE", 29310, 2),
                new Employees("85-939-9584", "Axe", "Gumb", "agumb2@twitter.com", "Female", "FALSE", 62291, 4),
                new Employees("08-180-8292", "Robinet", "Batterham", "rbatterham3@last.fm", "Female", "FALSE", 142439, 4),
                new Employees("21-825-2623", "Zulick", "Burrel", "uburrel4@google.ru", "Female", "FALSE", 128764, 5),
                new Employees("66-708-5539", "Tailor", "Ridding", "Ridding", "Female", "FALSE", 152924, 4),
                new Employees("81-697-2363", "Joete", "Braybrooke", "jbraybrooke6@prnewswire.com", "Male", "TRUE", 128907, 0),
                new Employees("63-019-1110", "Elroy", "Baverstock", "ebaverstock7@ehow.com", "Male", "TRUE", 2510, 0)
        );
    }
}
