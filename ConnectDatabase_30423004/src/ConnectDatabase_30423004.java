import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException; 

public class ConnectDatabase_30423004 {

	static final String DRIVER = "com.mysql.jdbc.Driver";
	static final String DATABASE_URL = "jdbc:mysql://120.126.44.213/books";

	public static void main(String[] args) {
		
		Connection connection = null; // manages connection
		Statement statement = null; // query statement
		ResultSet resultSet = null; // manages results
		
		// connect to database books and query database
	  try 
	  {
		 // load the driver class
		 Class.forName( DRIVER );

		 // establish connection to database							  
		 connection = DriverManager.getConnection( DATABASE_URL, "jhtp7", "jhtp7" );

		 // create Statement for querying database
		 statement = connection.createStatement();
		 
		 // query database										
		 resultSet = statement.executeQuery("SELECT FirstName, LastName, ISBN FROM Authors inner join AuthorISBN on Authors.AuthorID=AuthorISBN.AuthorID order by LastName, FirstName" );
		 
		 // process query results
		 ResultSetMetaData metaData = resultSet.getMetaData();
		 int numberOfColumns = metaData.getColumnCount();	 
		 System.out.println( "Table of Books Database:\n" );
		 
		 for ( int i = 1; i <= numberOfColumns; i++ )
			 System.out.printf( "%-8s\t", metaData.getColumnName( i ) );
		 System.out.println();
		 
		 while ( resultSet.next() ) 
		 {
			/*for ( int i = 1; i <= numberOfColumns; i++ )
			   System.out.printf( "%-8s\t", resultSet.getObject( i ) );
			System.out.println();*/
		 } // end while
	  }  // end try
	  catch ( SQLException sqlException )								
	  {																  
		 sqlException.printStackTrace();
	  } // end catch													 
	  catch ( ClassNotFoundException classNotFound )					 
	  {																  
		 classNotFound.printStackTrace();			
	  } // end catch													 
	  finally // ensure resultSet, statement and connection are closed
	  {															 
		 try														
		 {														  
			resultSet.close();									  
			statement.close();									  
			connection.close();	
			
			for(int i=0;i<10;i++)
			{
				System.out.printf("%d\n", i);
			}
			
			
			
		 } // end try											   
		 catch ( Exception exception )							  
		 {														  
			exception.printStackTrace();
		 } // end catch											 
	  } // end finally
	}
	
	
}


