/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCH.Entity;

/**
 *
 * @author NoName
 */
public class LoaiSanPham {
    private String MaLoaiSP, TenLoai, MaNV;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String MaLoaiSP, String TenLoai, String MaNV) {
        this.MaLoaiSP = MaLoaiSP;
        this.TenLoai = TenLoai;
        this.MaNV = MaNV;
    }
    
    public String getMaLoaiSP() {
        return MaLoaiSP;
    }

    public void setMaLoaiSP(String MaLoaiSP) {
        this.MaLoaiSP = MaLoaiSP;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    
    @Override
    public String toString(){
        return this.TenLoai;
    }
    
    @Override
    public boolean equals(Object obj){
        LoaiSanPham lsp = (LoaiSanPham) obj;
        if(lsp != null){
            return lsp.getMaLoaiSP().equals(this.getMaLoaiSP());
        }
        return true;
    }
}
