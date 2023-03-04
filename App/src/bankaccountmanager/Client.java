/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccountmanager;

/**
 *
 * @author lokma
 */
public class Client {
    private String id;
	private String first_name;
	private String last_name;
	private String address;
	private String phoneNumber;
	private String account_number;
	 public Client(String id , String first_name,String last_name,String account_number  ) {
		this.id = id;
		this.first_name = first_name;
                this.last_name = last_name;
		this.account_number = account_number;
                
                
	}
	public Client(String id , String first_name,String last_name,String address , String phoneNumber  ) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.phoneNumber = phoneNumber;
          
	}
	
    
        public Client(String first_name , String last_name , String account_number) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.account_number = account_number;
	}
	
       
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setFirstName (String first_name) {
		this.first_name = first_name;
	}
	
	public String getFirstName() {
		return this.first_name;
	}
	
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
	
	public String getLastName() {
		return this.last_name;
	}
	
	public void setAdress(String address) {
		this.address = address;
	}
	
	public String getAdress() {
		return this.address;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setAccountNumber(String phoneNumber) {
		this.account_number = account_number;
	}
	
	public String getAccountNumber() {
		return this.account_number;
	}
}
