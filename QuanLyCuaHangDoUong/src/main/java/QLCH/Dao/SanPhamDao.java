/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCH.Dao;

import QLCH.Entity.SanPham;
import QLCH.Utils.JdbcHelperQLCH;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NoName
 */
public class SanPhamDao extends QLCHSysDAO<SanPham, String>{
    String INSERT_SQL = "INSERT INTO SANPHAM VALUES(?, ?, ?, ?, ?, ?, ?);";
    String UPDATE_SQL = "UPDATE SANPHAM SET TenSP = ?, Gia = ?, TrangThai = ?, Anh = ?, MaLoai = ?, SoLuongSanPham = SoLuongSanPham+? WHERE MaSP = ?";
    String DELETE_SQL = "DELETE FROM SANPHAM WHERE MaSP = ?";
    String SELECT_ALL_SQL = "SELECT * FROM SANPHAM";
    String SELECT_BY_ID_SQL = "SELECT *FROM SANPHAM WHERE MaSP = ?";
    @Override
    public void insert(SanPham entity) {
        JdbcHelperQLCH.update(INSERT_SQL, entity.getMaSP(), entity.getTenSP(), entity.getGia(), entity.getTrangThai(), entity.getAnh(), entity.getMaLoai(), entity.getSoLuong());
    }

    @Override
    public void update(SanPham entity) {
        JdbcHelperQLCH.update(UPDATE_SQL, entity.getTenSP(), entity.getGia(), entity.getTrangThai(), entity.getAnh(), entity.getMaLoai(), entity.getSoLuong(),entity.getMaSP());

    }

    @Override
    public void delete(String id) {
        JdbcHelperQLCH.update(DELETE_SQL, id);
    }

    @Override
    public List<SanPham> selectAll() {
        return this.selectbySql(SELECT_ALL_SQL);
    }

    @Override
    public SanPham SelectbyID(String id) {
        List<SanPham> list = this.selectbySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<SanPham> selectbySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<SanPham>();
        try{
            ResultSet rs = JdbcHelperQLCH.query(sql, args);
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getString("MaSP"));
                sp.setTenSP(rs.getString("TenSP"));
                sp.setGia(rs.getFloat("Gia"));
                sp.setTrangThai(rs.getString("TrangThai"));
                sp.setAnh(rs.getString("Anh"));
                sp.setMaLoai(rs.getString("MaLoai"));
                sp.setSoLuong(rs.getInt("SoLuongSanPham"));
                list.add(sp);
            }
            rs.getStatement().getConnection().close();
            return list;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    public List<SanPham> selectBySanPham(String masp){
        String sql = "SELECT *FROM SanPham WHERE MaLoai = ?";
        return this.selectbySql(sql, masp);
    }
    
    public static ResultSet Getone(String idSP){
        String sql = "SELECT *FROM SANPHAM WHERE MaSP = ?";
        return JdbcHelperQLCH.query(sql, idSP);
    }
    
    public SanPham GetSanPham(String ID){
        SanPham sp = new SanPham();
        ResultSet rs = Getone(ID);
        try {
            if(rs.next()){
                sp.setMaSP(rs.getString("MaSP"));
                sp.setTenSP(rs.getString("TenSP"));
                sp.setGia(rs.getFloat("Gia"));
                sp.setTrangThai(rs.getString("TrangThai"));
                sp.setAnh(rs.getString("Anh"));
                sp.setMaLoai(rs.getString("MaLoai"));
                sp.setSoLuong(rs.getInt("SoLuongSanPham"));
                return sp;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<SanPham> selectNotInCouse(String maLoai, String keyword){
        String sql = "SELECT *FROM SANPHAM WHERE TenSP LIKE ? AND MaLoai IN (SELECT MaLoaiSP FROM LOAISANPHAM WHERE MaLoaiSP = ?)";
        return this.selectbySql(sql, "%" + keyword + "%", maLoai);
    }
    
}
