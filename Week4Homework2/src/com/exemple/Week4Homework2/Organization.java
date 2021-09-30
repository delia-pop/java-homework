package com.exemple.Week4Homework2;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.*;


public class Organization {
    static int nrOfEmp = 0;



    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();

    static List<Employee> employees = new LinkedList<>();

    public static void createEmployeesList (){
        UUID uuid;

        employee1.addEmployee(uuid = UUID.randomUUID() ,"ANA POP",25,"F","SALES",
                "BUSINESS ASSOCIATE");
        Organization.nrOfEmp++;
        employee2.addEmployee(uuid = UUID.randomUUID() ,"DAN MIHAI",30,"M","IT",
                "SYSTEM ENGINEER");
        employee3.addEmployee(uuid = UUID.randomUUID() ,"COSMINA DANCIU",25,"F","HR",
                "HR MANAGER");
    }

    public static void addToList(){
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
    }

    public static void displayEmployee(){

        System.out.println("Employee Initial Details: \t\t");
        System.out.println("ID\t\t\t\t\t\t\t\t\t\t\tName\t\tAge\t\tGender\t\tDepartment\t\tJob");

        for( Employee e : employees){

        System.out.println(e.getuuid() + "\t\t" + e.getEmployeeName() + "\t\t" + e.getEmployeeAge() + "\t\t" + e.getEmployeeGender()
                + "\t\t\t" + e.getEmployeeDepartment() + "\t\t" + e.getEmployeeJob());

        }

    }

    public static void searchEmployeeByName(String employeeName){
        System.out.println("/////////////////////////////////////////////////////////////");
        System.out.println("List of employees by Name '" + employeeName + "' is: ");

        for (Employee e : employees ) {
            if(e.getEmployeeName().contains(employeeName))

                System.out.println(e.getuuid() + "\t\t" + e.getEmployeeName() + "\t\t" + e.getEmployeeAge() + "\t\t" + e.getEmployeeGender()
                        + "\t\t\t" + e.getEmployeeDepartment() + "\t\t" + e.getEmployeeJob());
        }
    }

    public static void searchEmployeeByAge(int employeeAge){
        System.out.println("/////////////////////////////////////////////////////////////");
        System.out.println("List of employees by the same Age '" + employeeAge + "' is: ");

        for (Employee e : employees ) {
            if(Objects.equals(e.getEmployeeAge(), employeeAge));

                System.out.println(e.getuuid() + "\t\t" + e.getEmployeeName() + "\t\t" + e.getEmployeeAge() + "\t\t" + e.getEmployeeGender()
                        + "\t\t\t" + e.getEmployeeDepartment() + "\t\t" + e.getEmployeeJob());
        }
    }

    public static void searchEmployeeByGender(String employeeGender){
        System.out.println("/////////////////////////////////////////////////////////////");
        System.out.println("List of employees by Gender '" + employeeGender + "' is: ");

        for (Employee e : employees ) {
            if(e.getEmployeeGender().contains(employeeGender))

                System.out.println(e.getuuid() + "\t\t" + e.getEmployeeName() + "\t\t" + e.getEmployeeAge() + "\t\t" + e.getEmployeeGender()
                        + "\t\t\t" + e.getEmployeeDepartment() + "\t\t" + e.getEmployeeJob());
        }
    }

    public static void searchEmployeeByDepartment(String employeeDepartment){
        System.out.println("/////////////////////////////////////////////////////////////");
        System.out.println("List of employees by Department '" + employeeDepartment + "' is: ");

        for (Employee e : employees ) {
            if(e.getEmployeeDepartment().contains(employeeDepartment))

                System.out.println(e.getuuid() + "\t\t" + e.getEmployeeName() + "\t\t" + e.getEmployeeAge() + "\t\t" + e.getEmployeeGender()
                        + "\t\t\t" + e.getEmployeeDepartment() + "\t\t" + e.getEmployeeJob());
        }
    }


    public static void changeAttributeOrRemove(Employee employee, String department){
        System.out.println("/////////////////////////////////////////////////////////////");
        System.out.println("Employee from department " + employee.getEmployeeDepartment() + " was changed.");
        employee.setEmployeeDepartment(department);
        System.out.println("ID\t\t\t\t\t\t\t\t\t\t\tName\t\tAge\t\tGender\t\tDepartment\t\tJob");


        System.out.println( employee3.getuuid() + "\t\t" + employee3.getEmployeeName() + "\t\t" + employee3.getEmployeeAge() + "\t\t" + employee3.getEmployeeGender()
                + "\t\t\t" + employee3.getEmployeeDepartment() + "\t\t" + employee3.getEmployeeJob());
    }



    public static void newestEmployeeAdded() {

        UUID uuid;

        Employee latestEmployee = new Employee();
        latestEmployee.addEmployee(uuid = UUID.randomUUID(), "MARIN MARIN", 50, "M", "ADMIN",
                "ADMIN");
        System.out.println("/////////////////////////////////////////////////////////////");
        System.out.println("Newest employee added is: ");
        System.out.println("ID\t\t\t\t\t\t\t\t\t\t\tName\t\tAge\t\tGender\t\tDepartment\t\tJob");
        System.out.println( latestEmployee.getuuid() + "\t\t" + latestEmployee.getEmployeeName() + "\t\t" + latestEmployee.getEmployeeAge() + "\t\t" + latestEmployee.getEmployeeGender()
                + "\t\t\t" + latestEmployee.getEmployeeDepartment() + "\t\t" + latestEmployee.getEmployeeJob());
    }

    public static void main(String[] args) {

        createEmployeesList();
        addToList();
        displayEmployee();
        searchEmployeeByName("POP");
        searchEmployeeByAge(30);
        searchEmployeeByGender("F");
        searchEmployeeByDepartment("IT");
        changeAttributeOrRemove(employee3, "IT");
        newestEmployeeAdded();









    }
}
