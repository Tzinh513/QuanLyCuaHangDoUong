/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCH.Entity;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String maNV;
    private String tenNV;
    private String soDT;
    private String matKhau;
    private boolean chucvu;
    private String email;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String soDT, String matKhau, boolean chucvu, String email) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.soDT = soDT;
        this.matKhau = matKhau;
        this.chucvu = chucvu;
        this.email = email;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public boolean isChucvu() {
        return chucvu;
    }

    public void setChucvu(boolean chucvu) {
        this.chucvu = chucvu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
