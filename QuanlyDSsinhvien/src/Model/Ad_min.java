/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DOAN NGOC HIEU
 */
public class Ad_min {
    private String tkAdmin;
    private String mkAdmin;
    private String hoten;
    private String ngaySinh;
    private String cmnd;
    private String email;
    private String sdt;
    private String diachi;
     private String tenchucvu;           
    private String tinhtrang;
    private String ngaydangki;

    public void setTkAdmin(String tkAdmin) {
        this.tkAdmin = tkAdmin;
    }

    public void setMkAdmin(String mkAdmin) {
        this.mkAdmin = mkAdmin;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void seteMail(String eMail) {
        this.email = eMail;
    }

    public void setSDT(String SDT) {
        this.sdt = SDT;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public void setNgaydangki(String ngaydangki) {
        this.ngaydangki = ngaydangki;
    }

    public String getTkAdmin() {
        return tkAdmin;
    }

    public String getMkAdmin() {
        return mkAdmin;
    }

    public String getHoten() {
        return hoten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public String geteMail() {
        return email;
    }

    public String getSDT() {
        return sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getTenchucvu() {
        return tenchucvu;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public String getNgaydangki() {
        return ngaydangki;
    }
    
    public Ad_min() {
    }

    public Ad_min(String tkAdmin, String mkAdmin, String hoten, String ngaySinh, String cmnd, String email, String diachi, String tenchucvu, String tinhtrang, String ngaydangki) {
        this.tkAdmin = tkAdmin;
        this.mkAdmin = mkAdmin;
        this.hoten = hoten;
        this.ngaySinh = ngaySinh;
        this.cmnd = cmnd;
        this.email = email;
        this.diachi = diachi;
        this.tenchucvu = tenchucvu;
        this.tinhtrang = tinhtrang;
        this.ngaydangki = ngaydangki;
    }
      
}
