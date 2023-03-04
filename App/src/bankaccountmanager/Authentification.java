/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccountmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lokma
 */
public class Authentification {
     private Connection conn;

    public Authentification(){
        String url = "jdbc:mysql://localhost:3306/bank";
        String username = "root";
	String password = "Sql  00";
         try {
	    conn = DriverManager.getConnection(url , username , password);
	    	
	}catch(SQLException e) {
	    System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
    public boolean authentificate(Employee emp){
        boolean isEmployee = false;
        try{
            String sql = "SELECT * FROM employee_auth WHERE idEmployee = '" + emp.getIdE() + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Extract data from result set
            if (rs.next()) {
                // Retrieve by column name
                String dbIdEmployee = rs.getString("idEmployee");
                String dbPassword = rs.getString("password");
                
                if(emp.getIdE().equals(dbIdEmployee)&& emp.getPassword().equals(dbPassword)){
                    isEmployee = true;
                }
            }
            return isEmployee;
        }catch(SQLException e){
            System.out.println("An Erorr occured during AUthentification:"+e.getMessage());
        }
        return isEmployee;
    }
    
    public String getEmployeeName(String IdE){
        String Name = "";
        try{
            String sql = "SELECT * from employes WHERE idEmploye = '" + IdE+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
           
                if(rs.next()){
                  String first_name = rs.getString("first_name");
		  String last_name = rs.getString("last_name");
                  
                  Name = first_name + " "+ last_name;
                  System.out.println(Name);
                }
                return Name;
        }catch(SQLException e){
            System.out.println("An EROR occured durin getting Name Employee "+ e.getMessage());
        }
        return Name;
    }
    
}
