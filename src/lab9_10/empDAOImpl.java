package lab9_10;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class empDAOImpl implements Employeedao {

    private static String driverName = "org.sqlite.JDBC";
    private static String url = "jdbc:sqlite:C:/Users/LabCom_4/company.sqlite";
    private static Connection conn = null;


    //constant operation
    private static final String GET_ALL_EMP = "select * from Employee";
    private static final String ADD_new_Emp = "insert into employee" + "(id,name,position,salary) values (?,?,?,?)";
    private static final String UPDATE_Emp = "update employee set name=?,position=?,salary=? where id=?";
    private static final String DELETE_EMP = "delete from employee where id = ?";
    private static final String FIND_BY_ID = "select * " + "from employee where id = ?";
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
        List<Employee>emp= new ArrayList<Employee>();
        try {
            conn=DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(GET_ALL_EMP);
            //step4 : viewing data
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String position = rs.getString(3);
                double salary = rs.getDouble(4);
                emp.add(new Employee(id, name, position, salary));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return emp;
    }

    @Override
    public void addEmp(Employee newEmp) {
        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement stmt = conn.prepareStatement(ADD_new_Emp);

            stmt.setInt(1,newEmp.getId());
            stmt.setString(2,newEmp.getName());
            stmt.setString(3,newEmp.getPosition());
            stmt.setDouble(4,newEmp.getSalary());

            boolean ex = stmt.execute();
            if (ex == false) System.out.println("Add new employee already");
            else System.out.println("Could not add data");

            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }


    }

    @Override
    public void updateEmp(Employee emp) {
        try{
            conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement(UPDATE_Emp);

            ps.setString(1,emp.getName());
            ps.setString(2,emp.getPosition());
            ps.setDouble(3,emp.getSalary());
            ps.setInt(4,emp.getId());

            int resultSet = ps.executeUpdate();
            if (resultSet !=0)
                System.out.println("Employee with id "+emp.getId()+"was updated following details:\n"+emp.toString());
            else
                System.out.println("Employee data was not updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void deleteEmp(int id) {
        try{
            conn = DriverManager.getConnection(url);
            PreparedStatement stmt = conn.prepareStatement(DELETE_EMP);
            stmt.setInt(1,id);
            int resultSet = stmt.executeUpdate();
            if (resultSet !=0){
                System.out.println("Employee deled with id = "+id);
                conn.close();
            }
            else {
                System.out.println("No employee was dete wiyh id="+id);
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Employee findEmp(int id) {
        Employee employee = null;
        try{
            conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement(FIND_BY_ID);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()){
                int idd = rs.getInt(1);
                String name = rs.getString(2);
                String position = rs.getString(3);
                double salary = rs.getDouble(4);

                employee = new Employee(idd,name,position,salary);
                }else {System.out.println("Employee with id ="+id+"not found.");}
                    rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }
}
