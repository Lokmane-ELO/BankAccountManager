/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccountmanager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author lokma
 */
public class Bank {
    private Connection conn;
	 private String dateS = "2022-03-03";

	  public Bank() {
		 String url = "jdbc:mysql://localhost:3306/bank";
		 String username = "root";
		 String password = "Sql  00";
		 try {
	    	 conn = DriverManager.getConnection(url , username , password);
	    	
		 }catch(SQLException e) {
	    	System.out.println("An error occurred: " + e.getMessage());
		 }
	  }

          
	  public double getAccountBalance(String accountNumber) {
		  Double balance = 0.0;
		  if(clientExist(accountNumber)) {
			  try  {
			      String sql = "SELECT balance FROM account WHERE account_number ='" + accountNumber +"'";
			      Statement stmt = conn.createStatement();
			      ResultSet rs = stmt.executeQuery(sql);

			      if (rs.next()) {
			    	  balance = rs.getDouble("balance");
			        System.out.println("Balance: " + balance);
			      } else {
			        System.out.println("No account found with account_number"+accountNumber);
			      }
			  } catch (SQLException e) {
			      System.out.println("An error occurred in getAccountbalance: " + e.getMessage());
			    }
		  }else {
			  System.out.println("The account don't exist");
		  }
		 
		  return balance;
	  }

	  public void deposit(String accountNumber, double amount,String employeeId) {
		  if(clientExist(accountNumber)) {
			  try  {
			    	
				  String sql = "UPDATE account SET balance = balance + ? WHERE account_number = ?";
			      PreparedStatement stmt = conn.prepareStatement(sql);
			      stmt.setDouble(1, amount);
			      stmt.setString(2, accountNumber);
			      int rows = stmt.executeUpdate();
			      if (rows > 0) {
			        System.out.println("Amount deposited successfully!");
			      } else {
			        System.out.println("No account found with account number: "+ accountNumber);
			      }
			    	    
			    } catch (SQLException e) {
			      System.out.println("An error occurred: " + e.getMessage());
			    }
			  
			  try {
				  String sql = "INSERT INTO transaction (account_number, destination , amount, date,reason ) VALUES (?, ?,?,?,?)";
				  PreparedStatement stmt = conn.prepareStatement(sql);
			        stmt.setString(1,accountNumber);
			        stmt.setString(2, "" );
			        stmt.setDouble(3, amount);
			        stmt.setDate(4, java.sql.Date.valueOf(dateS));
			        stmt.setString(5, "deposit");
			        int rows = stmt.executeUpdate();
			        if (rows > 0) {
				        System.out.println("deposit transaction added successfully!");
				      } else {
				        System.out.println("deposit transaction didn't being added");
				      }
				  
			  }catch(SQLException e) {
				  System.out.println("An error occurred in deposit function: " + e.getMessage());
			  }
                          
                           try {
				  String sql = "INSERT INTO operation (idEmploye, account_number , date, type,amount) VALUES (?, ?,?,?,?)";
				  PreparedStatement stmt = conn.prepareStatement(sql);
			        stmt.setString(1,employeeId);
			        stmt.setString(2, accountNumber );
			        stmt.setDate(3, java.sql.Date.valueOf(dateS));
			        stmt.setString(4,"Deposit");
                                stmt.setDouble(5,amount);
			        
			        int rows = stmt.executeUpdate();
			        if (rows > 0) {
				        System.out.println("deposit operation added successfully!");
				      } else {
				        System.out.println("deposit operation didn't being added");
				      }
				  
			  }catch(SQLException e) {
				  System.out.println("An error occurred in deposit function: " + e.getMessage());
			  }
                          
                          
		  }else {
			  System.out.println("The account don't exist");
		  }
		 
	  }

	  public void withdraw(String accountNumber, double amount , String employeeId) {
		if(clientExist(accountNumber)) {
			if(amount<getAccountBalance(accountNumber)) {
				try  {
		    		 String sql = "UPDATE account SET balance = balance - ? WHERE account_number = ?";
				      PreparedStatement stmt = conn.prepareStatement(sql);
				      stmt.setDouble(1, amount);
				      stmt.setString(2, accountNumber);
				      int rows = stmt.executeUpdate();
				      if (rows > 0) {
				        System.out.println("Amount withdrawed successfully!");
				      } else {
				        System.out.println("No account found with account number: "+ accountNumber);
				      }    
			    } catch (SQLException e) {
			      System.out.println("An error occurred: " + e.getMessage());
			    }
			  try {
				  String sql = "INSERT INTO transaction (account_number, destination , amount, date,reason ) VALUES (?, ?,?,?,?)";
				  PreparedStatement stmt = conn.prepareStatement(sql);
			        stmt.setString(1,accountNumber);
			        stmt.setString(2, "" );
			        stmt.setDouble(3, -amount);
			        stmt.setDate(4,java.sql.Date.valueOf(dateS));
			        stmt.setString(5, "withdraw");
			        int rows = stmt.executeUpdate();
			        if (rows > 0) {
				        System.out.println("withdraw transaction added successfully!");
				      } else {
				        System.out.println("withdrawtransaction didn't being added");
				      }
			}  
			  catch(SQLException e) {
				  System.out.println("An error occurred in withraw function: " + e.getMessage());
			  }
                          try {
				  String sql = "INSERT INTO operation (idEmploye, account_number , date, type,amount) VALUES (?, ?,?,?,?)";
				  PreparedStatement stmt = conn.prepareStatement(sql);
			        stmt.setString(1,employeeId);
			        stmt.setString(2, accountNumber );
			        stmt.setDate(3, java.sql.Date.valueOf(dateS));
			        stmt.setString(4,"Withdraw");
                                stmt.setDouble(5,amount);
			        
			        int rows = stmt.executeUpdate();
			        if (rows > 0) {
				        System.out.println("withdrw operation added successfully!");
				      } else {
				        System.out.println("withdraw operation didn't being added");
				      }
				  
			  }catch(SQLException e) {
				  System.out.println("An error occurred in deposit function: " + e.getMessage());
			  }
				  }else {
					  System.out.println("The account don't exist!!");
				  }
		  
	  }
	  }

	  public void transfer(String fromAccount, String toAccount, double amount,String reason,String employeeId) {
		  if(clientExist(fromAccount) && clientExist(toAccount)) {
			 try  {
				  String sql = "UPDATE account SET balance = balance - ? WHERE account_number = ?";
			      PreparedStatement pstmt = conn.prepareStatement(sql);
			      pstmt.setDouble(1, amount);
			      pstmt.setString(2, fromAccount);
			      int rows = pstmt.executeUpdate();
			      if (rows > 0) {
			        System.out.println("fromAccount balance updated successfully!");
			      } else {
			        System.out.println("No account found with account number: " + fromAccount);
			      }
		
			      sql = "UPDATE account SET balance = balance + ? WHERE account_number = ?";
			      pstmt = conn.prepareStatement(sql);
			      pstmt.setDouble(1, amount);
			      pstmt.setString(2, toAccount);
			      rows = pstmt.executeUpdate();
			      if (rows > 0) {
				        System.out.println("toAccount balance updated successfully!");
				      } else {
				        System.out.println("No account found with account number: " + toAccount);
				      }
			    sql = "INSERT INTO transaction (account_number, destination, amount, date, reason) VALUES (?, ?, ?, ?, ?)";
			      pstmt = conn.prepareStatement(sql);
			      pstmt.setString(1, fromAccount);
			      pstmt.setString(2, toAccount);
			      pstmt.setDouble(3, amount);
			      pstmt.setDate(4, java.sql.Date.valueOf(dateS));
			      pstmt.setString(5, reason);
			      rows = pstmt.executeUpdate();
			      if (rows > 0) {
			        System.out.println("Transaction inserted successfully!");
			      } else {
			        System.out.println("Error inserting transaction");
			      }
			    } catch (SQLException e) {
			      System.out.println("An error occurred: " + e.getMessage());
			    }
                         try {
				  String sql = "INSERT INTO operation (idEmploye, account_number , date, type,toAccount,amount) VALUES (?, ?,?,?,?,?)";
				  PreparedStatement stmt = conn.prepareStatement(sql);
			        stmt.setString(1,employeeId);
			        stmt.setString(2, fromAccount );
			        stmt.setDate(3, java.sql.Date.valueOf(dateS));
			        stmt.setString(4,"VIR  ");
                                stmt.setString(5,toAccount);
                                stmt.setDouble(6,amount);
			        
			        int rows = stmt.executeUpdate();
			        if (rows > 0) {
				        System.out.println("transfer operation added successfully!");
				      } else {
				        System.out.println("transfer operation didn't being added");
				      }
				  
			  }catch(SQLException e) {
				  System.out.println("An error occurred in deposit function: " + e.getMessage());
			  }
		  }else {
			  System.out.println("The account don't exist");
		  }
		 
	  }
	  
          public Client searchClient(String accountNumber){
              Client client = null;
             try{
                 String sql = "SELECT client.first_name, client.last_name ,"
                         + "client.phone_number , client.id ,client.adresse FROM client "+
                         "JOIN account ON client.id = account.id"
                         +" WHERE account.account_number = ?";
                  
                 PreparedStatement stmt = conn.prepareStatement(sql);
                 stmt.setString(1, accountNumber);
		ResultSet rs = stmt.executeQuery();
                if(rs.next()){
                  String first_name = rs.getString("first_name");
		  String last_name = rs.getString("last_name");
		 
                   String phoneNumber = rs.getString("phone_number");
                   String id = rs.getString("id");
                   String adresse = rs.getString("adresse");
                   client = new Client(id,first_name,last_name,adresse,phoneNumber);
                    return client;
                }else{
                    System.out.println("EROR finding the client :"+ accountNumber);
                }
                         
             }catch(SQLException e) {
		      System.out.println("An error occurred in searching te client: " + e.getMessage());

		  }
            return client;
          };

	  public void addClient(Client client ,String employeeId) {
		  try  {
		    	
		    	String sql = "INSERT INTO client  (id,first_name ,last_name, phone_number,adresse) VALUES (?, ?,?,?,?)";
		        PreparedStatement stmt = conn.prepareStatement(sql);
		        stmt.setString(1,client.getId());
		        stmt.setString(2, client.getFirstName() );
		        stmt.setString(3, client.getLastName());
		        stmt.setString(4,client.getPhoneNumber());
                        stmt.setString(5,client.getAdress());
                        
		        int rows = stmt.executeUpdate();
		        if (rows > 0) {
			        System.out.println("Client added successfully!");
			      } else {
			        System.out.println("Client didn't being added");
			      }
		        
		        sql = "INSERT INTO account (account_number,balance,id) VALUES (?,?,?)";
		         stmt = conn.prepareStatement(sql);
		         stmt.setString(1, "FR"+client.getId());
		         stmt.setDouble(2, 0.0);
                         stmt.setString(3, client.getId());
		         
		         rows = stmt.executeUpdate();
		         if (rows > 0) {
				        System.out.println("account added successfully!");
				      } else {
				        System.out.println("account didn't being added");
				      }
		        
		    	    
		    } catch (SQLException e) {
		      System.out.println("An error occurred: " + e.getMessage());
		    }
                  try {
				  String sql = "INSERT INTO operation (idEmploye, account_number , date, type) VALUES (?, ?,?,?)";
				  PreparedStatement stmt = conn.prepareStatement(sql);
			        stmt.setString(1,employeeId);
			        stmt.setString(2,  "FR"+client.getId());
			        stmt.setDate(3, java.sql.Date.valueOf(dateS));
			        stmt.setString(4,"Ajout du Client");
                               
			        
			        int rows = stmt.executeUpdate();
			        if (rows > 0) {
				        System.out.println("addClient operation added successfully!");
				      } else {
				        System.out.println("addClient operation didn't being added");
				      }
				  
			  }catch(SQLException e) {
				  System.out.println("An error occurred in addClient function: " + e.getMessage());
			  }
	  }

	  public void updateClient(Client client) {
              try{
                  String sql = "UPDATE client set phone_number=?,adresse=? WHERE id=?";
                  PreparedStatement stmt = conn.prepareStatement(sql);
                 
                  stmt.setString(1,client.getPhoneNumber());
                   stmt.setString(2, client.getAdress());
                  stmt.setString(3,client.getId());
                  stmt.executeUpdate();
              }catch(SQLException e){
                  System.out.println("An error occurred in update function: " + e.getMessage());

              }
	  }

	  public void deleteClient(String id , String employeeId) {
	
               try {
			 String sql = "DELETE FROM account WHERE id = ?";
		      PreparedStatement stmt =  conn.prepareStatement(sql);
		      stmt.setString(1, id);
		      stmt.executeUpdate();
		  }catch(SQLException e) {
		      System.out.println("An error occurred: " + e.getMessage());
		    }
		  
		  try  {
		      String sql = "DELETE FROM client WHERE id = ?";
		      PreparedStatement stmt =  conn.prepareStatement(sql);
		      
		      stmt.setString(1, id);
		      stmt.executeUpdate();
		      
		      
		    } catch (SQLException e) {
		      System.out.println("An error occurred: " + e.getMessage());
		    }
                try {
				  String sql = "INSERT INTO operation (idEmploye, account_number , date, type) VALUES (?, ?,?,?)";
				  PreparedStatement stmt = conn.prepareStatement(sql);
			        stmt.setString(1,employeeId);
			        stmt.setString(2,  "FR"+id);
			        stmt.setDate(3, java.sql.Date.valueOf(dateS));
			        stmt.setString(4,"Suppresion Client");
                               
			        
			        int rows = stmt.executeUpdate();
			        if (rows > 0) {
				        System.out.println("addClient operation added successfully!");
				      } else {
				        System.out.println("addClient operation didn't being added");
				      }
				  
			  }catch(SQLException e) {
				  System.out.println("An error occurred in addClient function: " + e.getMessage());
			  }
		
                  
                  
		
	  }
	  
	  public ArrayList<Client> getClientsInfo() {
		  ArrayList<Client> clients = new ArrayList<Client>();
		  try {
			   
			  String sql = "SELECT client.id ,client.first_name, client.last_name, account.account_number " + 
			             "FROM client "
                                  +"JOIN account ON client.id = account.id";
			  PreparedStatement stmt = conn.prepareStatement(sql);
			  ResultSet rs = stmt.executeQuery();
			 
			 
			  
		      while (rs.next()) {
                        String id = rs.getString("id");
		        String first_name = rs.getString("first_name");
		        String last_name = rs.getString("last_name");
		        String account_number = rs.getString("account_number");
		        clients.add(new Client(id,first_name , last_name ,account_number));
		      }
		      
		      
		      
		      
			  
			  
		  }catch(SQLException e) {
		      System.out.println("An error occurred: " + e.getMessage());

		  }
		  return clients;
	  }
          
          public ArrayList<Transaction> getTransaction(String AccountNumber){
              ArrayList<Transaction> transaction = new ArrayList<Transaction>();
               try {
			   
			  String sql = "SELECT *" + 
			             "FROM transaction "
                                  +"WHERE transaction.account_number = ?";
			  PreparedStatement stmt = conn.prepareStatement(sql);
                          stmt.setString(1, AccountNumber);
			  ResultSet rs = stmt.executeQuery();
			 
			 
			  
		      while (rs.next()) {
                        //String account_number = rs.getString("account_number");
		        String destination = rs.getString("destination");
		        String amount = rs.getString("amount");
		        Date date = rs.getDate("date");
                        String reason = rs.getString("reason");
                       if(reason.equals("deposit")){
                            transaction.add(new Transaction(date,destination,reason,"+"+amount));
                       }else if(reason.equals("withdraw") ){
                            transaction.add(new Transaction(date,destination,reason,amount));
                       }else if(!destination.isEmpty()){
                           transaction.add(new Transaction(date,destination,reason,"-"+amount));

                      }
                        
		      }
	
		  }catch(SQLException e) {
		      System.out.println("An error occurred: " + e.getMessage());

		  }
               //sheking for transaction when the account receives money
                try {
			   
			  String sql = "SELECT *" + 
			             "FROM transaction "
                                  +"WHERE transaction.destination = ?";
			  PreparedStatement stmt = conn.prepareStatement(sql);
                          stmt.setString(1, AccountNumber);
			  ResultSet rs = stmt.executeQuery();
			 
			 
			  
		      while (rs.next()) {
                        //String account_number = rs.getString("account_number");
		        String destination = rs.getString("destination");
		        String amount = rs.getString("amount");
		        Date date = rs.getDate("date");
                        String reason = rs.getString("reason");
                       
                           transaction.add(new Transaction(date,destination,reason,"+"+amount));
                      
		      }
		
		  
		  }catch(SQLException e) {
		      System.out.println("An error occurred: " + e.getMessage());

		  }
		  return transaction;
          }

	  public boolean clientExist(String accountNumber) {
		  boolean exist = false;
		  try {
			  String sql = "SELECT * FROM account WHERE account_number ='" + accountNumber + "'";
			  Statement stmt = conn.createStatement();
			  ResultSet rs = stmt.executeQuery(sql);
			  if(rs.next()) {
				  exist = true;
			  }else {
				  exist = false;
			  };
		  }catch(SQLException e) {
			  System.out.println("An error occurred in clientExist function: " + e.getMessage());
		  }
		  return exist;
	  }
          
          public ArrayList<Transaction> getTransactionInfo(String EmployeeId){
              ArrayList<Transaction> History = new ArrayList<Transaction>();
              try {
			   
			  String sql = "SELECT *" + 
			             "FROM operation "
                                  +"WHERE operation.IdEmploye = ?";
			  PreparedStatement stmt = conn.prepareStatement(sql);
                          stmt.setString(1, EmployeeId);
			  ResultSet rs = stmt.executeQuery();
			 
			  
		      while (rs.next()) {
                        String IdEmployee = rs.getString("IdEmploye");
                        String account_number = rs.getString("account_number");
		        String destination = rs.getString("toAccount");
		        String amount = rs.getString("amount");
		        Date date = rs.getDate("date");
                        String type = rs.getString("type");
                        
                        History.add(new Transaction(IdEmployee,account_number,date,type,amount,destination));
                      }
		 
                      return History;
			  
		  }catch(SQLException e) {
		      System.out.println("An error occurred: " + e.getMessage());

		  }
              return History;
          }
}
