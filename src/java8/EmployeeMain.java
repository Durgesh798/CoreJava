package java8;

import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {

        Employees emp=new Employees();
        List<Employees> empList = emp.getEmpList();
       // System.out.println(empList);

        //list to map
       /* Map<String, List<Employees>> emp = empList.stream().
                collect(Collectors.groupingBy(Employees::getGender));
        emp.forEach((k,v)->
                        {
                            System.out.println("gender : " + k + " ," + "employee : " + v);
                        });
*/

        //sort on salary
      /*  empList.stream().sorted(Comparator.comparing(Employees::getSalary).reversed())
                .skip(3).forEach(System.out::println);*/

        //find highest salary
      /*  Employees employees1 = empList.stream().reduce(((employees, employees2) ->
                employees.getSalary() > employees2.getSalary() ?employees : employees2)).get();
        System.out.println(employees1);*/

       // get female employees
      /*  empList.stream().filter(i->i.getGender().equals("Female")).collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();*/

        //filter the employees list with newJoiner as True
       /* empList.stream().filter(i->i.getNewJoiner().equalsIgnoreCase("True"))
                .collect(Collectors.toList()).forEach(System.out::println);*/


        // sort the employee list by rating asc
       //empList.stream().sorted(Comparator.comparingInt(Employees::getRating)).forEach(System.out::println);

        // sort the employee list by rating asc
        /*empList.stream().sorted(Comparator.comparingInt(Employees::getRating).reversed()).
                forEach(System.out::println);*/

        //sort on salary
        //empList.stream().sorted(Comparator.comparing(Employees::getSalary)).forEach(System.out::println);

        //sort the employee list by both rating and salary
        /*empList.stream().sorted(Comparator.comparing(Employees::getRating))
                .sorted(Comparator.comparing(Employees::getSalary)).forEach(System.out::println);
*/

        //all employees with salary more than 1000
        //empList.stream().filter(i->i.getSalary()>1000).forEach(System.out::println);

        //retrieve employee with max salary
       //empList.stream().max(Comparator.comparing(Employees::getSalary)).ifPresent(System.out::println);

        //retrieve employee with min salary
        //empList.stream().min(Comparator.comparing(Employees::getSalary)).ifPresent(System.out::println);

        // group all our employees by Gender
       /* Map<String, List<Employees>> emp = empList.stream()
                .collect(Collectors.groupingBy(Employees::getGender));

        emp.forEach((s, employees) -> {
            System.out.println(s);
            employees.forEach(System.out::println);
        });*/

        // Use Java 8 streams to find the average salary of all employees.
        /*double average = empList.stream().mapToDouble(Employees::getSalary).average().orElse(0.0);
        System.out.println(average);*/

        //calculate the total salary of all employees.
        /*int sum = empList.stream().mapToInt(Employees::getSalary).sum();
        System.out.println(sum);*/

        //filter out employees who have a salary greater than 150000.
       /* empList.stream().filter(Employees->Employees.getSalary()>100000)
                .collect(Collectors.toList()).forEach(System.out::println);*/

        //find the names of employees whose names start with "z".
       /* empList.stream().filter(Employees->Employees.getFirstName().startsWith("Z"))
                .collect(Collectors.toList()).forEach(System.out::println);
*/

        //find the employee with the longest name.
        /*Employees employees = empList.stream().reduce((emp, emp1) ->
                emp.getFirstName().length() > emp1.getFirstName().length() ? emp : emp1).get();
        System.out.println(employees);*/

        // find the employees with the top 5 highest salaries.
     /*   empList.stream().sorted(Comparator.comparingInt(Employees::getSalary).reversed()).limit(5)
                .forEach(System.out::println);*/

        //filter out employees who has rating >2 and have a salary less than 100000.
      /*  empList.stream().filter(emp1->emp1.getRating()>2).filter(emp2->emp2.getSalary()<100000)
                .collect(Collectors.toList()).forEach(System.out::println);*/

        // find the total number of employees based on gender.
        /*Map<String, Long> emps = empList.stream().collect(Collectors.groupingBy(Employees::getGender,
                    Collectors.counting()));
        emps.forEach((gender, count)->
                System.out.println(gender + " : "+ count));*/

        //find the average salary of employees based on gender
        /*Map<String, Double> emps = empList.stream().collect(Collectors.groupingBy(Employees::getGender,
                Collectors.averagingDouble(Employees::getSalary)));
        emps.forEach((gender, count)->
                System.out.println(gender + " : "+ count));*/

        //find the employee with the highest salary in each gender.
        /*Map<String, Optional<Employees>> highestSalary = empList.stream().collect(Collectors
                .groupingBy(Employees::getGender, Collectors.maxBy(Comparator
                        .comparingDouble(Employees::getSalary))));
        highestSalary.forEach((gender,salary)->
                System.out.println(gender+" : "+salary));*/

        //find the employee with the shortest name.
        /*empList.stream().reduce((emp1,emp2)->emp1.getFirstName().length()<emp2.getFirstName().length()?
                emp1:emp2).ifPresent(System.out::println);*//*
        Employees employees = empList.stream().min(Comparator.comparingInt(e -> e.getFirstName().length()))
                .orElse(null);
        System.out.println(employees.getFirstName());*/

        // find the sum of salaries for new joiner employees
        /*double aTrue = empList.stream().filter(i -> i.getNewJoiner().equalsIgnoreCase("true"))
                .mapToDouble(Employees::getSalary).sum();
        System.out.println(aTrue);*/

        //filter out employees whose names contain a specific substring
        //empList.stream().filter(i->i.getLastName().contains("tter")).forEach(System.out::println);

        // find the highest rated employee.
       /* Employees employees = empList.stream().max(Comparator.comparingInt(Employees::getRating)).get();
        System.out.println(employees.getFirstName());*/

        //sort a list of Employee objects based on their names in alphabetical order
        /*empList.stream().sorted(Comparator.comparing(Employees::getFirstName)).collect(Collectors.toList())
                .forEach(System.out::println);*/

        //emp wth shortest name
        //empList.stream().min(Comparator.comparing(e->e.getLastName().length()))
        //       .ifPresent(System.out::println);

        //find the number of employees in each rating group (e.g., 0-2, 3-5).
  /*      Map<String, Long> rating = empList.stream().collect(Collectors.groupingBy(e ->
                 getRatingGroupLabel(e.getRating()), Collectors.counting()));

        rating.forEach((group,count)->
                System.out.println(group+ " : "+ count));*/

        //convert a list of Employee objects into a map, where the key is the employee's name, and
        // the value is the employee object
        /*Map<String, Employees> collect = empList.stream().collect(Collectors.toMap(Employees::getFirstName
                , e -> e));
        collect.forEach((name,emp1)->
        {
            System.out.println(name+" : "+emp1);
        });*/

        //find the gender with the highest total salary.
     /*   Map<String, Double> collect = empList.stream().collect(Collectors.groupingBy(Employees::getGender
                , Collectors.summingDouble(Employees::getSalary)));
        String aNull = collect.entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse("null");
        System.out.println(aNull);*/

        //sort on empid descending
        //empList.stream().sorted(Comparator.comparing(Employees::getEmpId).reversed()).forEach(System.out::println);

        empList.parallelStream().forEach(employees -> new Thread());

    }

    public static String getRatingGroupLabel(int rating) {
        if (rating >= 0 && rating <= 2) {
            return "0-2";
        } else if (rating >= 3 && rating <= 5) {
            return "3-5";
        } else {
            return "5+";
        }
    }

}
