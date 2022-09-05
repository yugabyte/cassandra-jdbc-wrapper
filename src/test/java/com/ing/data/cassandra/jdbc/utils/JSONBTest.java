package com.ing.data.cassandra.jdbc.utils;

import java.sql.*;

public class JSONBTest {
    private static final String urlWithoutAuth = "jdbc:cassandra://127.0.0.1/system?localdatacenter=datacenter1";
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
//        Class.forName("com.wisecoders.dbschema.cassandra.JdbcDriver");
        /*
        create keyspace test;
        create table test.jsontable (id int primary key, col1 text, col2 varchar, details jsonb);
        insert into test.jsontable (id, col1, col2, details) values (1, 'abc', 'xyz', '{ "name": "Macbeth", "author": { "first_name": "William", "last_name": "Shakespeare" }, "year": 1623, "editors": ["John", "Elizabeth", "Jeff"] }');
         */
        Class.forName("com.ing.data.cassandra.jdbc.CassandraDriver");
        Connection con = DriverManager.getConnection( urlWithoutAuth, "yugabyte", "yugabyte");
        Statement stmt = con.createStatement();
        stmt.execute("SELECT id, col1, col2, details FROM test.jsontable");
        ResultSet rs = stmt.getResultSet();
        while(rs.next()){
            System.out.println("getInt(1): " + rs.getInt(1));
//            System.out.println(rs.getObject(2));
//            System.out.println(rs.getObject(3));
            System.out.println("getObject(4): " + rs.getObject(4));
            System.out.println("getObject('details'): " + rs.getObject("details"));
            ResultSetMetaData rmd = rs.getMetaData();
            System.out.println("colName: " + rmd.getColumnName(1));
            System.out.println("colType: " + rmd.getColumnType(1));
            System.out.println("colTypeName: " + rmd.getColumnTypeName(1));
            System.out.println("getLong(1): " + rs.getLong(1));
//
//            System.out.println(rmd.getColumnName(2));
//            System.out.println(rmd.getColumnType(2));
//            System.out.println(rmd.getColumnTypeName(2));
//
//            System.out.println(rmd.getColumnName(3));
//            System.out.println(rmd.getColumnType(3));
//            System.out.println(rmd.getColumnTypeName(3));

            System.out.println("colName: " + rmd.getColumnName(4));
            System.out.println("colType: " + rmd.getColumnType(4));
            System.out.println("colTypeName: " + rmd.getColumnTypeName(4));
        }
        System.out.println("executed query");
        con.close();
    }
}
