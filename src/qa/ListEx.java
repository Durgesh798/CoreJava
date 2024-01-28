package qa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students>
{
    int rollno,marks;
    String name;

    public Students(int rollno, int marks, String name) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "qa.Students{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students s) {
        return marks>s.marks?1:-1;
    }
}
public class ListEx
{
    public static void main(String[] args)
    {
        List<Students> s=new ArrayList<>();
        s.add(new Students(1,89,"Rahul"));
        s.add(new Students(5,99,"Surya"));
        s.add(new Students(4,79,"Rohit"));

        Collections.sort(s);

        for(Students st:s)
        {
            System.out.println(st);
        }
    }
}
