/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCH.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class JdbcHelperQLCH {
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dburl = "jdbc:sqlserver://localhost;database=QLCuaHangDoUong";
    private static String user = "sa";
    private static String password = "songlong";
    static{
        try {
        	java.security.Security.setProperty("jdk.tls.disabledAlgorithms","SSLv3, RC4, DES, MD5withRSA, DH keySize < 1024,EC keySize < 224, 3DES_EDE_CBC, anon, NULL");
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static PreparedStatement getStmt(String sql, Object...args) throws SQLException{
        Connection conn = DriverManager.getConnection(dburl, user, password);
        PreparedStatement pstmt = null;
        if(sql.trim().startsWith("{"))   	
        {
            pstmt = conn.prepareCall(sql);
        }
        else
        {
            pstmt = conn.prepareStatement(sql);
        }
        for(int i = 0; i<args.length; i++)
        {
            pstmt.setObject(i+1, args[i]);
        }
        return pstmt;
    }
    public static void update(String sql,Object...args){
        try {
            PreparedStatement prsmt = getStmt(sql, args);
            try {
                prsmt.executeUpdate();
            } finally{
                prsmt.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static ResultSet query(String sql, Object...args){
        try {
            PreparedStatement prmst = getStmt(sql, args);
            return prmst.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static Object value(String sql, Object...args){
        try {
            ResultSet rs = query(sql, args);
            if(rs.next())
            {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
