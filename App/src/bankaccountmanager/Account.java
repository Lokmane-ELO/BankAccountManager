/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccountmanager;

/**
 *
 * @author lokma
 */
public class Account {
     private String accountNumber;
  private double balance;
 // private String accountType;
  private Client owner;
  
  public Account(String accountNumber, double balance,  Client owner) {
	    this.accountNumber = accountNumber;
	    this.balance = balance;
	   //this.accountType = accountType;
	    this.owner = owner;
	  }
  public String getAccountNumber() {
	    return accountNumber;
	  }

  public void setAccountNumber(String accountNumber) {
	    this.accountNumber = accountNumber;
	}

	  public double getBalance() {
	    return balance;
	  }

	  public void setBalance(double balance) {
	    this.balance = balance;
	  }
/*
	  public String getAccountType() {
	    return accountType;
	  }

	  public void setAccountType(String accountType) {
	    this.accountType = accountType;
	  }
*/
	  public Client getOwner() {
	    return owner;
	  }

	  public void setOwner(Client owner) {
	    this.owner = owner;
	  }
}
