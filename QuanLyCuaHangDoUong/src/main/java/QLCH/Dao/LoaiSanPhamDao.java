/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCH.Dao;

import QLCH.Entity.LoaiSanPham;
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
public class LoaiSanPhamDao extends QLCHSysDAO<LoaiSanPham, String>{

    String INSERT_SQL = "INSERT INTO LOAISANPHAM VALUES(?,?,?)";
    String UPDATE_SQL = "UPDATE LOAISANPHAM SET TenLoai = ?, MaNV = ? WHERE MaLoaiSP = ?";
    String DELETE_SQL = "DELETE FROM LOAISANPHAM WHERE MaLoaiSP = ?";
    String SELECT_ALL_SQL = "SELECT * FROM LOAISANPHAM";
    String SELECT_BY_ID_SQL = "SELECT *FROM LOAISANPHAM WHERE MaLoaiSP = ?";
    @Override
    public void insert(LoaiSanPham entity) {
        JdbcHelperQLCH.update(INSERT_SQL, entity.getMaLoaiSP(), entity.getTenLoai(), entity.getMaNV());
    }

    @Override
    public void update(LoaiSanPham entity) {
        JdbcHelperQLCH.update(UPDATE_SQL, entity.getTenLoai(), entity.getMaNV(), entity.getMaLoaiSP());

    }

    @Override
    public void delete(String id) {
        JdbcHelperQLCH.update(DELETE_SQL, id);
    }

    @Override
    public List<LoaiSanPham> selectAll() {
        return this.selectbySql(SELECT_ALL_SQL);
    }

    @Override
    public LoaiSanPham SelectbyID(String id) {
        List<LoaiSanPham> list = this.selectbySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<LoaiSanPham> selectbySql(String sql, Object... args) {
        List<LoaiSanPham> list = new ArrayList<LoaiSanPham>();
        try{
            ResultSet rs = JdbcHelperQLCH.query(sql, args);
            while(rs.next()){
                LoaiSanPham lsp = new LoaiSanPham();
                lsp.setMaLoaiSP(rs.getString("MaLoaiSP"));
                lsp.setTenLoai(rs.getString("TenLoai"));
                lsp.setMaNV(rs.getString("MaNV"));
                list.add(lsp);
            }
            rs.getStatement().getConnection().close();
            return list;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
}
