public class Employee {
    // Constructor

    //<identification>
    //1.1 same name as class name
    // 1.2 No return type

    //<purpose>
    //1.1 it creates/initialise Object in Memory(RAM)
    //1.2 you can use constructor Block to initialise some default values.

    int employeeId;
    int salary;
    String dept;

    Employee(int empid, int sal, String d){
        employeeId=empid;
        salary=sal;
        dept=d;
    }

    public static void main(String[] args) {
        Employee harsha = new Employee(101,3000,"Testing");
        Employee varsha = new Employee(102,5000,"Engineering");

        System.out.println(harsha.employeeId+" Salary "+ harsha.salary+" Dept "+harsha.dept);
        System.out.println(varsha.employeeId+" Salary "+ varsha.salary+" Dept "+varsha.dept);

    }
}
