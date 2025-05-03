package model;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String maNV;
    private String ten;
    private String email;
    private String sdt;
    private String diaChi;
    private String matKhau;
    private String chucVu;
    private String gioiTinh;
    private String caLam;

    // Constructor không đối số
    public User() {
    }

    public User(String maNV, String ten, String email, String sdt, String matKhau, String diaChi, String chucVu, String gioiTinh, String caLam) {
        this.maNV = maNV;
        this.ten = ten;
        this.email = email;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.matKhau = matKhau;
        this.chucVu = chucVu;
        this.gioiTinh = gioiTinh;
        this.caLam = caLam;
    }

    // Getter và Setter
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCaLam() {
        return caLam;
    }

    public void setCaLam(String caLam) {
        this.caLam = caLam;
    }

    @Override
    public String toString() {
        return "Mã nhân viên: " + maNV + "\n" +
           "Tên nhân viên: " + ten + "\n" +
           "Email: " + email + "\n" +
           "Số điện thoại: " + sdt + "\n" +
           "Địa chỉ: " + diaChi + "\n" +
           "Mật khẩu: " + matKhau + "\n" +
           "Chức vụ: " + chucVu + "\n" +
           "Giới tính: " + gioiTinh + "\n" +
           "Ca làm: " + caLam + "\n";
    }
}
