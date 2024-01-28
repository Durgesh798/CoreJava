package qa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101,"ramesh",101,"active",5000));
        empList.add(new Employee(102,"raj",102,"active",8000));
        empList.add(new Employee(103,"siva",103,"inactive",2000));
        empList.add(new Employee(104,"reddy",101,"active",6000));
        empList.add(new Employee(105,"rahul",103,"inactive",1000));
        empList.add(new Employee(106,"shivam",102,"active",9000));
        empList.add(new Employee(107,"bob",103,"inactive",1400));

        //print emp by deptid
       /* Map<Integer, List<Employee>> grouyEmpByDeptId = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId));
        grouyEmpByDeptId.forEach((k,v)->{
            System.out.println(k+" : "+v);
        });*/

        //emp count by dept
       /* Map<Integer, Long> countEmpByDept = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));
        System.out.println(countEmpByDept);

        //emp active
        long active = empList.stream().filter(emp -> emp.getStatus().equals("active")).count();
        System.out.println(active);*/

        //max salary of emp
       /* int maxSalary = empList.stream().mapToInt(Employee::getSalary).max().getAsInt();
        System.out.println(maxSalary);

        Employee employee = empList.stream().min(Comparator.comparingInt(Employee::getSalary)).get();
        System.out.println(employee);
*/

        //find emp with highest salary by deptid
        /*Map<Integer, Optional<Employee>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId,
                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
        System.out.println(collect);*/

        //sort emp based on name
       /* List<Employee> sortByName = empList.stream().sorted(Comparator.comparing(Employee::getEmpName))
                .collect(Collectors.toList());
        System.out.println(sortByName);*/
        
        //group by status and sort by name
        Map<String, List<Employee>> sortEmp = empList.stream().collect(Collectors.groupingBy(Employee::getStatus));
        sortEmp.forEach((status, statusEmployees) -> {
            List<Employee> sortedEmployees = statusEmployees.stream()
                    .sorted(Comparator.comparing(Employee::getEmpName))
                    .collect(Collectors.toList());
            System.out.println(status + ": " + sortedEmployees);
        });


    }
}
