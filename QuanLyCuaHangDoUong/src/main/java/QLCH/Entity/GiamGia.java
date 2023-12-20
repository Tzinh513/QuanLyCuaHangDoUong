/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCH.Entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class GiamGia {
    private String maGG;
    private String tenGG;
    private float dieuKien;
    private int giaTri;
    private Date ngayBD;
    private Date ngayKT;
    private String maNV;

    public GiamGia() {
    }

    public GiamGia(String maGG, String tenGG, float dieuKien, int giaTri, Date ngayBD, Date ngayKT, String maNV) {
        this.maGG = maGG;
        this.tenGG = tenGG;
        this.dieuKien = dieuKien;
        this.giaTri = giaTri;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.maNV = maNV;
    }
    @Override
    public String toString(){
        return this.tenGG;
    }
    public String getMaGG() {
        return maGG;
    }

    public void setMaGG(String maGG) {
        this.maGG = maGG;
    }

    public String getTenGG() {
        return tenGG;
    }

    public void setTenGG(String tenGG) {
        this.tenGG = tenGG;
    }

    public float getDieuKien() {
        return dieuKien;
    }

    public void setDieuKien(float dieuKien) {
        this.dieuKien = dieuKien;
    }

    public int getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    
}
