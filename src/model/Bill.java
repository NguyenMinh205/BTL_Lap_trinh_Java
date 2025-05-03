package model;

import java.io.Serializable;
import java.util.Objects;

public class Bill implements Serializable {
    private static final long serialVersionUID = 1L;

    private String maHD;
    private String ten;
    private String sdt;       // Sửa từ int sang String
    private String email;
    private String ngayDat;
    private double tongTien;

    public Bill() {
    }

    public Bill(String maHD, String ten, String sdt, String email, String ngayDat, double tongTien) {
        this.maHD = maHD;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
        this.ngayDat = ngayDat;
        this.tongTien = tongTien;
    }

    // Getters
    public String getMaHD() {
        return maHD;
    }

    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return sdt;
    }

    public String getEmail() {
        return email;
    }

    public String getNgayDat() {
        return ngayDat;
    }

    public double getTongTien() {
        return tongTien;
    }

    // Setters
    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNgayDat(String ngayDat) {
        this.ngayDat = ngayDat;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "Mã hóa đơn   : " + maHD + "\n" +
               "Tên khách    : " + ten + "\n" +
               "SĐT          : " + sdt + "\n" +
               "Email        : " + email + "\n" +
               "Ngày đặt     : " + ngayDat + "\n" +
               "Tổng tiền    : " + tongTien + " VND\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(maHD, ten, sdt, email, ngayDat, tongTien);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Bill)) return false;
        Bill other = (Bill) obj;
        return Objects.equals(maHD, other.maHD) &&
               Objects.equals(ten, other.ten) &&
               Objects.equals(sdt, other.sdt) &&
               Objects.equals(email, other.email) &&
               Objects.equals(ngayDat, other.ngayDat) &&
               Double.compare(tongTien, other.tongTien) == 0;
    }
}
