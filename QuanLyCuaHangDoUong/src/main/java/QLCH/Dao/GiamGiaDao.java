/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCH.Dao;

import QLCH.Entity.GiamGia;
import QLCH.Entity.NhanVien;
import QLCH.Utils.JdbcHelperQLCH;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class GiamGiaDao extends QLCHSysDAO<GiamGia, String>{
    final String SELECT_ALL_SQL = "select * from GIAMGIA";
    final String SELECT_BY_ID_SQL = "select * from GIAMGIA where MaGG = ?";
    final String INSERT_SQL = "INSERT INTO GIAMGIA VALUES(?, ?,?, ?,?, ?, ?);";
    final String UPDATE_SQL = "update GIAMGIA set TenGG = ?, DieuKien = ?, Giatri = ?, NgayBD = ?, NgayKT = ?, MaNV = ? where MaGG = ?";
    final String DELETE_SQL = "delete from GIAMGIA where MaGG = ?";
    @Override
    public void insert(GiamGia entity) {
        JdbcHelperQLCH.update(INSERT_SQL, entity.getMaGG(), entity.getTenGG(), entity.getDieuKien(), entity.getGiaTri(), entity.getNgayBD(), entity.getNgayKT(), entity.getMaNV());
    }

    @Override
    public void update(GiamGia entity) {
        JdbcHelperQLCH.update(UPDATE_SQL, entity.getTenGG(), entity.getDieuKien(), entity.getGiaTri(), entity.getNgayBD(), entity.getNgayKT(), entity.getMaNV(), entity.getMaGG());
    }

    @Override
    public void delete(String id) {
        JdbcHelperQLCH.update(DELETE_SQL, id);
    }

    @Override
    public List<GiamGia> selectAll() {
        return selectbySql(SELECT_ALL_SQL);
    }

    @Override
    public GiamGia SelectbyID(String id) {
        List<GiamGia> list = selectbySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty())
        {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<GiamGia> selectbySql(String sql, Object... args) {
        List<GiamGia> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelperQLCH.query(sql, args);
            while(rs.next())
            {
                GiamGia entity = new GiamGia();
                entity.setMaGG(rs.getString("MaGG"));
                entity.setTenGG(rs.getString("TenGG"));
                entity.setDieuKien(rs.getFloat("DieuKien"));
                entity.setGiaTri(rs.getInt("GiaTri"));
                entity.setNgayBD(rs.getDate("NgayBD"));
                entity.setNgayKT(rs.getDate("NgayKT"));
                entity.setMaNV(rs.getString("MaNV"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public List<GiamGia> selectMaGG(String maCD) {
        return selectbySql(SELECT_BY_ID_SQL, maCD);
    }
    
}
