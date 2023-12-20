    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCH.Dao;

import QLCH.Entity.ChiTietHoaDon;
import QLCH.Entity.HoaDon;
import QLCH.Utils.JdbcHelperQLCH;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NoName
 */
public class ChiTietHoaDonDao extends QLCHSysDAO<ChiTietHoaDon, String>{
    String INSERT_SQL = "INSERT INTO CTHOADON VALUES(?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE CTHOADON SET MaSP = ?, SoLuong = ?, TrangThai = ?, TongTien = ?, GIA = ? WHERE MaHD = ?";
    String DELETE_SQL = "DELETE FROM CTHOADON WHERE MaHD = ?";
    String SELECT_ALL_SQL = "SELECT * FROM CTHOADON";
    String SELECT_BY_ID_SQL = "SELECT *FROM CTHOADON WHERE MaHD = ?";
    @Override
    public void insert(ChiTietHoaDon entity) {
        JdbcHelperQLCH.update(INSERT_SQL, entity.getMaHD(), entity.getMaSP(), entity.getSoLuong(), entity.getTrangThai(), entity.getTongTien(), entity.getGia());
    }

    @Override
    public void update(ChiTietHoaDon entity) {
        JdbcHelperQLCH.update(UPDATE_SQL,  entity.getMaSP(), entity.getSoLuong(), entity.getTrangThai(), entity.getTongTien(), entity.getGia() , entity.getMaHD());
    }

    @Override
    public void delete(String id) {
        JdbcHelperQLCH.update(DELETE_SQL, id);
    }

    @Override
    public List<ChiTietHoaDon> selectAll() {
        return this.selectbySql(SELECT_ALL_SQL);
    }

    @Override
    public ChiTietHoaDon SelectbyID(String id) {
        List<ChiTietHoaDon> list = this.selectbySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<ChiTietHoaDon> selectbySql(String sql, Object... args) {
        List<ChiTietHoaDon> list = new ArrayList<ChiTietHoaDon>();
        try{
            ResultSet rs = JdbcHelperQLCH.query(sql, args);
            while(rs.next()){
                ChiTietHoaDon entity = new ChiTietHoaDon();
                entity.setMaHD(rs.getString("MaHD"));
                entity.setMaSP(rs.getString("MaSP"));
                entity.setSoLuong(rs.getInt("SoLuong"));
                entity.setTrangThai(rs.getString("TrangThai"));
                entity.setTongTien(rs.getFloat("TongTien"));
                entity.setGia(rs.getFloat("GIA"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    public List<ChiTietHoaDon> selectByChiTietDonHang(int maKH){
        String sql = "SELECT *FROM CTHOADON WHERE MaHD = ?";
        return this.selectbySql(sql, maKH);
    }
    
    public List<ChiTietHoaDon> selectByIDChiTietHoaDon(int maHD){
        String sql = "{{CALL dbo.CTHoaDonTheoMaHoaDon (?)}}";
        return this.selectbySql(sql, maHD);
    }
    
    //Them chitiethoadon  
    public void ThemCTHoaDon(ChiTietHoaDon cthd){
        String sql = "INSERT INTO CTHOADON VALUES (?, ?, ?, ?, ?, ?);";
        JdbcHelperQLCH.update(sql, cthd.getMaHD(), cthd.getMaSP(), cthd.getSoLuong(),cthd.getGia(), cthd.getTrangThai(), cthd.getTongTien());
    }
    
    public List<String> getDataDoanhThuSPTN(int maHD) {        
        //List<ChiTietHoaDon> list = new ArrayList<ChiTietHoaDon>();
        List<String> list = new ArrayList<>();
        try{  
            String sql = "{{CALL dbo.CTHoaDonTheoMaHoaDon (?)}}";
            ResultSet rs = JdbcHelperQLCH.query(sql, maHD);
            while(rs.next())
            {
                String tenSP = rs.getString("tenSP");
                float gia = rs.getFloat("Gia");
                float tongTien = rs.getInt("tongTien");
                String trangThai = rs.getString("TrangThai");              
            }
            return list;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
