/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCH.Dao;

import QLCH.Utils.JdbcHelperQLCH;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author Admin
 */
public class ThongKeDao {
    float tongdoanhthu;
    float phanTram;
    private List<Object[]>getListOfArray(String sql, String[] cols, Object...args){
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JdbcHelperQLCH.query(sql, args);
            while(rs.next())
            {
                Object[] vals = new Object[cols.length];
                for(int i = 0; i<cols.length; i++)
                {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Object[]> getDoanhThuSPTT(Integer thang, Integer nam) {
        String sql = "{CALL dbo.DSSanPhamTheoThang (?,?)}";
        String[] cols = {"TenSP", "tongSL", "tongTien", "Thang", "Nam"};
        return this.getListOfArray(sql, cols, thang, nam);
    }
    
    public List<Object[]> getDoanhThuSPTN(Integer nam) {
        String sql = "{CALL dbo.DSSanPhamTheoNam (?)}";
        String[] cols = {"TenSP", "tongSL", "tongTien", "Thang", "Nam"};
        return this.getListOfArray(sql, cols, nam);
    }
    
    public CategoryDataset getDataDoanhThuSPTT(int thang, int nam) {        
        try{
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
            String sql = "{CALL dbo.DSSanPhamTheoThang (?,?)}";
            ResultSet rs = JdbcHelperQLCH.query(sql, thang, nam);
            while(rs.next())
            {
                String tenSP = rs.getString("tenSP");
                float tongTien = rs.getInt("tongTien");
                int thangN = rs.getInt("Thang");
                dataset.addValue(tongTien, ""+tenSP, "Thang: "+thangN);
            }
            return dataset;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    public CategoryDataset getDataDoanhThuSPTN(int nam) {        
        try{
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
            String sql = "{CALL dbo.DSSanPhamTheoNam (?)}";
            ResultSet rs = JdbcHelperQLCH.query(sql, nam);
            while(rs.next())
            {
                String tenSP = rs.getString("tenSP");
                float tongTien = rs.getInt("tongTien");
                int thangN = rs.getInt("Thang");
                dataset.addValue(tongTien, ""+tenSP, "Thang: "+thangN);
            }
            return dataset;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    public PieDataset getDataDoanhThuPhanTram(int thang, int nam) {        
        try{
            DefaultPieDataset dataset = new DefaultPieDataset();  
            String sql = "{CALL dbo.DSSanPhamTheoThang (?,?)}}";
            ResultSet rs = JdbcHelperQLCH.query(sql, thang, nam);
            while(rs.next())
            {
                String tenSP = rs.getString("tenSP");
                float tongTien = rs.getInt("tongTien");
                int thangN = rs.getInt("Thang");
                
                System.out.println("----------");
                //phanTram = (tongTien % tongdoanhthu) * 100;
                                            
                System.out.println("Phan Tram: "+phanTram);
                dataset.setValue(tenSP, tongTien);
            }
            //tongdoanhthu = tongdoanhthu + tongTien;
            System.out.println("TongTien: "+tongdoanhthu);  
            return dataset;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    public PieDataset getDataDoanhThuPhanTramTN(int nam) {        
        try{
            DefaultPieDataset dataset = new DefaultPieDataset();  
            String sql = "{CALL dbo.DSSanPhamTheoNam (?)}}";
            ResultSet rs = JdbcHelperQLCH.query(sql, nam);
            while(rs.next())
            {
                String tenSP = rs.getString("tenSP");
                float tongTien = rs.getInt("tongTien");
                int thangN = rs.getInt("Thang");
                dataset.setValue(tenSP, tongTien);
            }
            System.out.println("TongTien: "+tongdoanhthu);  
            return dataset;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
