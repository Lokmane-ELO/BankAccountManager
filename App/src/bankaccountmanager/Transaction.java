/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccountmanager;

import java.util.Date;

/**
 *
 * @author lokma
 */
public class Transaction {
    private String EmployeeId;
    private Date date;
    private String type;
    private String reason;
    private String amount;
    private String RIB;
    private String destination;
    public Transaction(Date date , String type , String reason , String amount){
        this.date = date;
        this.type = type;
        this.reason = reason;
        this.amount = amount;
    }
    public Transaction(String EmployeeId,String RIB, Date date , String type  , String amount,String destination){
        this.RIB = RIB;
        this.EmployeeId = EmployeeId;
        this.date = date;
        this.type = type;
        
        this.amount = amount;
        this.destination = destination;
    }
    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return the amount
     */
    public String getMontant() {
        return getAmount();
    }

    /**
     * @param amount the amount to set
     */
    public void setMontant(String amount) {
        this.setAmount(amount);
    }

    /**
     * @return the EmployeeId
     */
    public String getEmployeeId() {
        return EmployeeId;
    }

    /**
     * @param EmployeeId the EmployeeId to set
     */
    public void setEmployeeId(String EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * @return the RIB
     */
    public String getRIB() {
        return RIB;
    }

    /**
     * @param RIB the RIB to set
     */
    public void setRIB(String RIB) {
        this.RIB = RIB;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
}
