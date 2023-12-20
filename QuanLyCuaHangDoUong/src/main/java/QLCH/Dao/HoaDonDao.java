/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCH.Dao;

import QLCH.Entity.HoaDon;
import QLCH.Utils.JdbcHelperQLCH;
import QLCH.Utils.XDateQLCH;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author NoName
 */
public class HoaDonDao extends QLCHSysDAO<HoaDon, String>{
    String INSERT_SQL = "INSERT INTO HOADON VALUES(?,?,?,?)";
    String UPDATE_SQL = "UPDATE HOADON SET NgayBan = ?, MaKH = ?, MaNV = ? WHERE MaHD = ?";
    String DELETE_SQL = "DELETE FROM HOADON WHERE MaHD = ?";
    String SELECT_ALL_SQL = "SELECT * FROM HOADON";
    String SELECT_BY_ID_SQL = "SELECT *FROM HOADON WHERE MaHD = ?";
    String SELECT_BY_KEY_IN_COURSE_SQL = "select * from HOADON where MaHD like ?"; 
    
    @Override
    public void insert(HoaDon entity) {
        JdbcHelperQLCH.update(INSERT_SQL, entity.getMaHD(), entity.getNgayBan(), entity.getMaKH(), entity.getMaNV());
    }

    @Override
    public void update(HoaDon entity) {
        JdbcHelperQLCH.update(UPDATE_SQL, entity.getNgayBan(), entity.getMaKH(), entity.getMaKH(), entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        JdbcHelperQLCH.update(DELETE_SQL, id);
                
    }

    @Override
    public List<HoaDon> selectAll() {
        return this.selectbySql(SELECT_ALL_SQL);
    }

    @Override
    public HoaDon SelectbyID(String id) {
        List<HoaDon> list = this.selectbySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    
    public List<HoaDon> selectByKeywordMaHD(String keyWord){
        return selectbySql(SELECT_BY_KEY_IN_COURSE_SQL, "%" + keyWord + "%");
    }

    @Override
    protected List<HoaDon> selectbySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<HoaDon>();
        try{
            ResultSet rs = JdbcHelperQLCH.query(sql, args);
            while(rs.next()){
                HoaDon entity = new HoaDon();
                entity.setMaHD(rs.getString("MaHD"));
                entity.setNgayBan(rs.getDate("NgayBan"));
                entity.setMaKH(rs.getString("MaKH"));
                entity.setMaNV(rs.getString("MaNV"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    public List<HoaDon> selectByDonHang(int maKH){
        String sql = "SELECT *FROM HOADON WHERE MaHD = ?";
        return this.selectbySql(sql, maKH);
    }
    
    // taosohoadontudong
    
    public static ResultSet CountSoHoaDon(String SoHoaDon){
        String sql = "select count(*) from HOADON WHERE MaHD LIKE ?";
        return JdbcHelperQLCH.query(sql, "%" + SoHoaDon + "%");
    }
    
    public static ResultSet getBySoHoaDon(String SoHoaDon){
        String sql = "select *from HOADON WHERE MaHD = ?";
        return JdbcHelperQLCH.query(sql, SoHoaDon);
    }
    
    
    //HAM TAO SO HOA DON
    public String TaoMaHoaDon(){
        String soHoaDon = "";
        try {
            DateFormat df = new SimpleDateFormat("MMdd");
            Date d = new Date();
            
            soHoaDon = "HD"+df.format(d);
            
            System.out.println("soHoaDon: "+ soHoaDon);
            
            ResultSet rs = CountSoHoaDon(soHoaDon);
            int rowCount = 0;
            
            if(rs.next()){
                rowCount = rs.getInt(1);
            }
            boolean dup = false;
            do {                
                if(rowCount > 98){
                    soHoaDon = soHoaDon + (rowCount+1);
                }else if(rowCount >8){
                    soHoaDon = soHoaDon + "0"+ (rowCount+1);
                }else{
                    soHoaDon = soHoaDon +"00" +(rowCount+1);
                }
                
                System.out.println("soHoaDon: " +soHoaDon);
                
                ResultSet rs2 = getBySoHoaDon(soHoaDon);
                if(rs2.next()){
                    dup = true;
                    rowCount++;
                    soHoaDon = df.format(d);
                }else{
                    dup = false;
                }
            } while (dup);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return soHoaDon;
    }
    // ham them hoa don
    public void ThemHD(HoaDon hd){
        String sql = "Set dateformat DMY INSERT INTO [dbo].[HOADON]([MaHD],[NgayBan],[MaKH],[MaNV]) VALUES (?,?,?,?)";
        JdbcHelperQLCH.update(sql, 
                hd.getMaHD(), hd.getNgayBan(), hd.getMaKH(), hd.getMaNV());
        
    }
    
    
    public HoaDon layHoaDonTheoSoHoaDon(String SoHoaDon){
        ResultSet rs = getBySoHoaDon(SoHoaDon);
        try{
        if(rs.next()){
            HoaDon hd = new HoaDon();
            hd.setMaHD(rs.getString("MaHD"));
            hd.setNgayBan(rs.getDate("NgayBan"));
            hd.setMaKH(rs.getString("MaKH"));
            hd.setMaNV(rs.getString("MaNV"));
            return hd;
        }            
            }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Integer> selectYears() {
        String sql = "select distinct YEAR(HOADON.NgayBan) Nam from HOADON order by Nam desc";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelperQLCH.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public List<Integer> selectMonths() {
        String sql = "select distinct month(HOADON.NgayBan) Thang from HOADON order by Thang asc";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelperQLCH.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
