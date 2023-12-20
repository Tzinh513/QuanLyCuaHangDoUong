/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCH.Entity;

/**
 *
 * @author Admin
 */
public class KhachHang {
    private String maKH;
    private String TenKH;
    private String sdt;
    private float diem;

    public KhachHang() {
    }

    public KhachHang(String maKH, String TenKH, String sdt, float diem) {
        this.maKH = maKH;
        this.TenKH = TenKH;
        this.sdt = sdt;
        this.diem = diem;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    
    @Override
    public String toString(){
        return this.TenKH;
    }
    
    @Override
    public boolean equals(Object obj){
        KhachHang lsp = (KhachHang) obj;
        if(lsp != null){
            return lsp.getMaKH().equals(this.getMaKH());
        }
        return true;
    }
    
}
