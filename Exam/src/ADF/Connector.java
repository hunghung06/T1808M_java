
    package ADF;

import java.sql.Connection;
import java.sql.*;
    public class Connector {
        public Connection conn;
        public Connector(){
            try{
                Class.forName("com.mysql.jdbc.Driver");

                String URL = "jdbc:mysql://localhost:3306/t1808m";
                conn = DriverManager.getConnection(URL, "t1808m","123456h");

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        public  ResultSet getQuery(String sql) throws Exception{
            Statement statement = conn .createStatement();
            return  statement.executeQuery(sql);
        }
        public Integer updateQuery(String sql) throws Exception{
            Statement statement = conn.createStatement();
            return  statement.executeUpdate(sql);
        }
    }

