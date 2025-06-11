package model;

import java.io.Serializable;

public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    private String maSP;    // Đã chuyển từ int → String
    private String tenSP;
    private double gia;
    private String loai;
    private int soLuong;
    

    public Product() {
    }

    public Product(String maSP, String tenSP, double gia, String loai, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.loai = loai;
        this.soLuong = soLuong;
    }

    public Product(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    

    @Override
    public String toString() {
        return "Mã sản phẩm : " + this.maSP + "\nTên sản phẩm : " + this.tenSP + "\nGiá : " + this.gia + "\nLoại : " + this.loai + "\nSố lượng còn lại : " + this.soLuong;
    }
}
