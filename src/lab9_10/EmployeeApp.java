package lab9_10;

import java.util.List;

public class EmployeeApp {
    public static void main(String[] args) {
        empDAOImpl dao = empDAOImpl.getInstant();

        //Get_ALL_emp
        showData(dao);
        //ADD_NEW_EMP(Create)
        // dao.addEmp(new Employee(104,"kosan janpebun","gameing",150000));
        //Find Employee
        System.out.println("Find Employee with ID;");
        Employee emp = dao.findEmp(350);
        System.out.println(emp.toString());

        //Update Employee
        emp.setSalary(3000);
        dao.updateEmp(emp);//update data in database
        showData(dao);
        //Dele Employee
        dao.deleteEmp(350);
        showData(dao);



    }
    private static void showData(empDAOImpl dao){

        List<Employee> myemp = dao.getAllEmp();
        System.out.println("Employee Data in Databass");

        for (Employee emp : myemp) {
            System.out.println(emp.toString());
        }
    }
}
