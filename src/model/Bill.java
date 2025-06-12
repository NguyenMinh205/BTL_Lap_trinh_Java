package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Bill implements Serializable {
    private static final long serialVersionUID = 1L;

    private String maHD;
    private String ten;
    private String sdt;       // Sửa từ int sang String
    private String email;
    private LocalDate ngayDat;
    private double tongTien;
    private HashMap<String, Integer> items;

    public Bill() {
        this.items = new HashMap<>();
    }

    public Bill(String maHD, String ten, String sdt, String email, LocalDate ngayDat, double tongTien) {
        this.maHD = maHD;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
        this.ngayDat = ngayDat;
        this.tongTien = tongTien;
        this.items = new HashMap<>();
    }
    
    public Map<String, Integer> getItems() {
        if (items == null) {
            items = new HashMap<>();
        }
        return items;
    }

    public void addItem(String tenMon, int soLuong) {
        items.merge(tenMon, soLuong, Integer::sum);
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(LocalDate ngayDat) {
        this.ngayDat = ngayDat;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Mã hóa đơn   : " + maHD + "\n" +
               "Tên khách    : " + ten + "\n" +
               "SĐT          : " + sdt + "\n" +
               "Email        : " + email + "\n" +
               "Ngày đặt     : " + ngayDat.format(formatter) + "\n" +
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
