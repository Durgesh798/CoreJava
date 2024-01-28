package qa;

class Student
{
    private int rollno;
    private String sname;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
public class Encapsulation
{
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.setRollno(3);
        s1.setSname("Chandu");

        System.out.println(s1.getRollno());
        System.out.println(s1.getSname());
    }
}
