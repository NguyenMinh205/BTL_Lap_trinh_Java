package model;

import java.io.Serializable;

public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    private String maSP;    // Đã chuyển từ int → String
    private String tenSP;
    private double gia;
    private String loai;

    public Product() {
    }

    public Product(String maSP, String tenSP, double gia, String loai) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.loai = loai;
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

    @Override
    public String toString() {
        return "Product [maSP=" + maSP + ", tenSP=" + tenSP + ", gia=" + gia + ", loai=" + loai + "]";
    }
}
