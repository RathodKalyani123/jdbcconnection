package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class My_DataBase {
	

	public static void main(String[] args) throws ClassNotFoundException  {
		   try {
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   System.out.println("Driver loded");
			   
		Connection	 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDb", "root", "kalyani");//Establishing connection
		System.out.println("Connected With the database successfully");
	    final String dbname="testDb";
	    final String url="jdbc:mysql://localhost:3306/testDb";
		
	    StringBuilder builder=new StringBuilder();
	    System.out.println(url);
	    final String usename="root";
	    final String password="kalyani";
	    Connection connection2=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDb", "root", "kalyani");
	    System.out.println("DB connection is done");
	    Statement statement= connection.createStatement();
	    String query="select * from Persons";
	    ResultSet resultSet=statement.executeQuery(query);
	    while(resultSet.next()) {
	    	System.out.println("********************************");
	    	System.out.println("PersonID "+resultSet.getInt(1));
	    	System.out.println("LastName "+resultSet.getString("rathod"));
	    	System.out.println("FirstName  "+resultSet.getString("kalyani"));
	    	System.out.println("Address  "+resultSet.getString("pusad"));
	    	System.out.println("City  "+resultSet.getString("pune"));
	    }
	    
	       private Persons getPersons()
	       {
		   Persons persons=new Persons();
		   Scanner scanner=new Scanner(System.in);
		   System.out.println("enter id");
		   int PersonsID=scanner.nextInt();
		   
		   System.out.println("enter fname");
		   String FirstName=scanner.next();
		   
		   System.out.println("enter lname");
		   String LasttName=scanner.next();
		   
		   System.out.println("enter address");
		   String Address =scanner.next();
		   
		   System.out.println("enter city");
		   String City=scanner.next();
	    	
	         }
				
				
				
			} catch (SQLException e) {
				System.out.println(e);
				
				System.out.println("Error while connecting to the database");
			
					}
	}
}
		


