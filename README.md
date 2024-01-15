# Connect_Database

### Introduction
This Java program (`ConnectDatabase_30423004`) demonstrates connecting to a MySQL database, executing a query, and processing the results. The code uses JDBC (Java Database Connectivity) to establish a connection with a MySQL database and fetch data from it.

### Prerequisites
Before running the program, ensure the following:

- Java Development Kit (JDK) is installed.
- MySQL server is running.
- MySQL JDBC Driver is available.

### Getting Started
1. Clone the repository:
   ```sh
   git clone https://github.com/house40105/Connect_Database.git
   ```
2. Compile the Java program:
    ```sh
    javac ConnectDatabase_30423004.java
    ```
3. Run the program:
   ```sh
   java ConnectDatabase_30423004
   ```

### Configuration
Ensure to modify the following constants in the code according to your MySQL database configuration:
```java
static final String DRIVER = "com.mysql.jdbc.Driver";
static final String DATABASE_URL = "jdbc:mysql://your-host/your-database";
```

### Code Overview
1. Database Connection:  
   - The `main` method initializes a connection to the MySQL database using JDBC.
   - The `DRIVER` constant specifies the JDBC driver class.
   - The `DATABASE_URL` constant contains the URL to connect to the MySQL database.
2. Query Execution:  
   A SQL query is executed to fetch data from the database. Adjust the query according to your needs.
   ```java
   resultSet = statement.executeQuery("SELECT FirstName, LastName, ISBN FROM Authors inner join AuthorISBN on Authors.AuthorID=AuthorISBN.AuthorID order by LastName, FirstName");
   ```
3. Result Processing:  
   The program retrieves and prints the metadata (column names) and processes the query results.
4. Exception Handling:  
   Exceptions related to SQL and class loading are caught and printed to the console.
5. Resource Closure:  
   The `finally` block ensures that the `resultSet`, `statement`, and `connection` objects are closed, preventing resource leaks.

### Customization
Feel free to customize the code based on your specific requirements. You may modify the SQL query, handle results differently, or enhance exception handling as needed.

### Troubleshooting
If you encounter issues, check the following:
- Verify MySQL server is running.
- Ensure correct JDBC driver is in the classpath.
- Confirm the accuracy of the database connection parameters.

### Conclusion
This program serves as a basic template for connecting to a MySQL database using Java. It can be extended and customized for more advanced database operations. If you have any questions or encounter issues, please refer to the documentation or seek assistance from experienced developers.
