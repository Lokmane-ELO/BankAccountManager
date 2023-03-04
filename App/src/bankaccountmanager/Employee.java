/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccountmanager;

/**
 *
 * @author lokma
 */
public class Employee {
    private String IdE;
    private String password;
    public Employee(String IdE , String password){
        this.IdE = IdE;
        this.password = password;
    }

    /**
     * @return the IdE
     */
    public String getIdE() {
        return IdE;
    }

    /**
     * @param IdE the IdE to set
     */
    public void setIdE(String IdE) {
        this.IdE = IdE;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
}
