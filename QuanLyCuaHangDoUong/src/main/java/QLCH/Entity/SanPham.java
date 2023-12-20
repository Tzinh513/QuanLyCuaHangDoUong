/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCH.Entity;

/**
 *
 * @author NoName
 */
public class SanPham {
    private String MaSP, TenSP, TrangThai, Anh, MaLoai;
    private Float Gia;
    private int soLuong;

    public SanPham() {
    }

    public SanPham(String MaSP, String TenSP, String TrangThai, String Anh, String MaLoai, Float Gia, int soLuong) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.TrangThai = TrangThai;
        this.Anh = Anh;
        this.MaLoai = MaLoai;
        this.Gia = Gia;
        this.soLuong = soLuong;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    public Float getGia() {
        return Gia;
    }

    public void setGia(Float Gia) {
        this.Gia = Gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
