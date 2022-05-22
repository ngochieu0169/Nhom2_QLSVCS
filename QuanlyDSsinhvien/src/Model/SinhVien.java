/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DOAN NGOC HIEU
 */
public class SinhVien {
    private String maSV;
    private String tenSV;
    private String lopSH;
    private String gioiTinh;
     private String Khoa;
    private String SDT;
    private String eMail;
    private String doiTuong;
    private String namHoc;
    private String ghiChu;

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getLopSH() {
        return lopSH;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getKhoa() {
        return Khoa;
    }

    public String getSDT() {
        return SDT;
    }

    public String geteMail() {
        return eMail;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public String getNamHoc() {
        return namHoc;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void setLopSH(String lopSH) {
        this.lopSH = lopSH;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, String lopSH, String gioiTinh, String Khoa, String SDT, String eMial, String doiTuong, String namHoc, String ghiChu) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lopSH = lopSH;
        this.gioiTinh = gioiTinh;
        this.Khoa = Khoa;
        this.SDT = SDT;
        this.eMail = eMial;
        this.doiTuong = doiTuong;
        this.namHoc = namHoc;
        this.ghiChu = ghiChu;
    }
    
   
}
