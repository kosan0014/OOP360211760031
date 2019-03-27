package lab9_10;

import java.sql.Connection;
import java.util.List;

public class empDAOImpl implements Employeedao {

    private static String driverName = "org.sqlite.JDBC";
    private static String url = "jdbc:sqlite:C:/Users/LabCom_4/company.sqlite";
    private static Connection conn = null;

    //constant operetors

    //constructor

    private static empDAOImpl instant = new empDAOImpl();
    public static empDAOImpl getInstant() {
        return instant;
    }
    private empDAOImpl() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Load Driver Successfull");

    }

    @Override
    public List<Employee> getAllEmp() {
        return null;
    }

    @Override
    public void addEmp(Employee newEmp) {

    }

    @Override
    public void updateEmp(Employee emp) {

    }

    @Override
    public void deleteEmp(int id) {

    }

    @Override
    public Employee findEmp(int id) {
        return null;
    }
}
