import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Connection connect = null; 
		 Statement s = null;

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			// String connectionString = "jdbc:mysql://localhost:3306/my_database?user=root&password=Pass&useUnicode=true&characterEncoding=UTF-8";
			 connect = DriverManager.getConnection("jdbc:mysql://35.224.66.61/kiattisak?user=admin&password=1234&useUnicode=true&characterEncoding=UTF-8");
			 s = connect.createStatement();
			 if (connect != null) {
				 System.out.println("เชื่อมต่อฐานข้อมูลสำเร็จ");
 
				 Scanner inputDATA = new Scanner(System.in);
 
				 System.out.print("CustomerID : ");
				 String CustomerID = inputDATA.next();
				 
				 System.out.print("CompanyName : ");
				 String CompanyName = inputDATA.next();
				 
				 System.out.print("ContactName : ");
				 String ContactName = inputDATA.next();
				 
				 System.out.print("ContactTitle : ");
				 String ContactTitle = inputDATA.next();
				 
				 System.out.print("Address : ");
				 String Address = inputDATA.next();
				 
				   System.out.print("City : ");
				 String City = inputDATA.next();
				 
				  System.out.print("Region : ");
				 String Region = inputDATA.next();
				 
				  System.out.print("PostalCode : ");
				 String PostalCode = inputDATA.next();
				 
				  System.out.print("Country : ");
				 String Country = inputDATA.next();
				 
				  System.out.print("Phone : ");
				 String Phone = inputDATA.next();
				 
				  System.out.print("Fax : ");
				 String Fax = inputDATA.next();
 
				 String sql = "INSERT INTO customers VALUES ('" + CustomerID + "','" + CompanyName + "','" + ContactName + "','" + ContactTitle + "','" + Address + "','" + City + "','" + Region + "','" + PostalCode + "','" + Country + "','" + Phone + "','" + Fax + "')";
 
				 s.execute(sql);
				 System.out.println("บันทึกข้อมูลเรียบร้อยแล้ว");
			 		} else {
				 System.out.println("ไม่สามารถเชื่อมต่อฐานข้อมูลได้");	
						}
				 catch (Exception e)
				 {e.printStackTrace();}}
}
