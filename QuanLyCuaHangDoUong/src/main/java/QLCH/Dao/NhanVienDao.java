/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCH.Dao;

import QLCH.Entity.NhanVien;
import QLCH.Utils.JdbcHelperQLCH;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVienDao extends QLCHSysDAO<NhanVien, String>{
    final String SELECT_BY_ID_SQL = "select * from NHANVIEN where MaNV = ?";
    final String INSERT_SQL = "INSERT INTO NHANVIEN VALUES(?, ?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "update NHANVIEN set TenNV = ?, SDT = ?, MatKhau = ?, ChucVu = ?, Email = ? where MaNV = ?";
    final String DELETE_SQL = "delete from NHANVIEN where MaNV = ?";
    final String SELECT_ALL_SQL = "select * from NHANVIEN";
    @Override
    public void insert(NhanVien entity) {
        JdbcHelperQLCH.update(INSERT_SQL, entity.getMaNV(), entity.getTenNV(), entity.getSoDT(), entity.getMatKhau(), entity.isChucvu(), entity.getEmail());
    }

    @Override
    public void update(NhanVien entity) {
        JdbcHelperQLCH.update(UPDATE_SQL, entity.getTenNV(), entity.getSoDT(), entity.getMatKhau(), entity.isChucvu(), entity.getEmail(), entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        JdbcHelperQLCH.update(DELETE_SQL, id);
    }

    @Override
    public List<NhanVien> selectAll() {
        return selectbySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien SelectbyID(String id) {
        List<NhanVien> list = selectbySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty())
        {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NhanVien> selectbySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelperQLCH.query(sql, args);
            while(rs.next())
            {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setTenNV(rs.getString("TenNV"));
                entity.setSoDT(rs.getString("SDT"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setChucvu(rs.getBoolean("ChucVu"));
                entity.setEmail(rs.getString("Email"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    
}
