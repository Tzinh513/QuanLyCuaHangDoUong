/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCH.Dao;

import QLCH.Entity.KhachHang;
import QLCH.Entity.NhanVien;
import QLCH.Utils.JdbcHelperQLCH;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhachHangDao extends QLCHSysDAO<KhachHang, String>{
    final String SELECT_ALL_SQL = "select * from KHACHHANG";
    final String INSERT_SQL = "INSERT INTO KHACHHANG VALUES(?, ?, ?, ?);";
    final String UPDATE_SQL = "update KHACHHANG set TenKH = ?, SDT = ?, Diem = ? where MaKH = ?";
    final String DELETE_SQL = "delete from KHACHHANG where MaKH = ?";
    final String SELECT_BY_ID_SQL = "select * from KHACHHANG where MaKH = ?";
    final String SELECT_BY_KEYWORD_SQL = "select * from KHACHHANG where TenKH like ?";
    @Override
    public void insert(KhachHang entity) {
        JdbcHelperQLCH.update(INSERT_SQL, entity.getMaKH(), entity.getTenKH(), entity.getSdt(), entity.getDiem());
    }

    @Override
    public void update(KhachHang entity) {
        JdbcHelperQLCH.update(UPDATE_SQL, entity.getTenKH(), entity.getSdt(), entity.getDiem(), entity.getMaKH());
    }

    @Override
    public void delete(String id) {
        JdbcHelperQLCH.update(DELETE_SQL, id);
    }

    @Override
    public List<KhachHang> selectAll() {
        return selectbySql(SELECT_ALL_SQL);
    }

    @Override
    public KhachHang SelectbyID(String id) {
        List<KhachHang> list = selectbySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty())
        {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<KhachHang> selectbySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelperQLCH.query(sql, args);
            while(rs.next())
            {
                KhachHang entity = new KhachHang();
                entity.setMaKH(rs.getString("MaKH"));
                entity.setTenKH(rs.getString("TenKH"));
                entity.setSdt(rs.getString("SDT"));
                entity.setDiem(rs.getFloat("Diem"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    
    public List<KhachHang> selectByKeyword(String keyWord){
        return selectbySql(SELECT_BY_KEYWORD_SQL, "%" + keyWord + "%");
    }
}
