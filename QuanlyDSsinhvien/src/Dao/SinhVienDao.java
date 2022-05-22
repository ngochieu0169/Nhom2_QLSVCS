/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.SinhVien;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tuanta
 */
public class SinhVienDao {

    public List<SinhVien> getAllSinhVien() {
        List<SinhVien> sinhVien_l = new ArrayList<SinhVien>();

        Connection connection = DBConnection.getConnection();
        String sql = "select * from SinhVien";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                SinhVien sinhVien = new SinhVien();
                sinhVien.setMaSV(rs.getString("maSV"));
                sinhVien.setTenSV(rs.getString("tenSV"));
                sinhVien.setLopSH(rs.getString("lopSH"));
                sinhVien.setGioiTinh(rs.getString("gioiTinh"));
                sinhVien.setKhoa(rs.getString("Khoa"));
                sinhVien.setSDT(rs.getString("SDT"));
                sinhVien.seteMail(rs.getString("eMail"));
                sinhVien.setDoiTuong(rs.getString("doiTuong"));
                sinhVien.setNamHoc(rs.getString("namHoc"));
                sinhVien.setGhiChu(rs.getString("ghiChu"));
                
                sinhVien_l.add(sinhVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sinhVien_l;
    }
    
    public SinhVien getSVById(String maSV) {
        
        Connection connection = DBConnection.getConnection();
        String sql = "select * from SinhVien where maSV = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maSV);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                SinhVien sinhVien = new SinhVien();
                sinhVien.setMaSV(rs.getString("maSV"));
                sinhVien.setTenSV(rs.getString("tenSV"));
                sinhVien.setLopSH(rs.getString("lopSH"));
                sinhVien.setGioiTinh(rs.getString("gioiTinh"));
                sinhVien.setKhoa(rs.getString("Khoa"));
                sinhVien.setSDT(rs.getString("SDT"));
                sinhVien.seteMail(rs.getString("eMail"));
                sinhVien.setDoiTuong(rs.getString("doiTuong"));
                sinhVien.setNamHoc(rs.getString("namHoc"));
                sinhVien.setGhiChu(rs.getString("ghiChu"));
                
                return sinhVien;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addSV(SinhVien sinhVien) {
        Connection connection = DBConnection.getConnection();
        String sql = " INSERT INTO thongtinsinhvien( maSV, tenSV, lopSH, gioiTinh, Khoa, SDT, eMail, doiTuong, namHoc, ghiChu)"
                + " VALUE(?,?,?,?,?,?,?,?,?,?) ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, sinhVien.getMaSV());
            preparedStatement.setString(2, sinhVien.getTenSV());
            preparedStatement.setString(3, sinhVien.getLopSH());
            preparedStatement.setString(4, sinhVien.getGioiTinh());
            preparedStatement.setString(5, sinhVien.getKhoa());
            preparedStatement.setString(6, sinhVien.getSDT());
            preparedStatement.setString(7, sinhVien.geteMail());
            preparedStatement.setString(8, sinhVien.getDoiTuong());
            preparedStatement.setString(9, sinhVien.getNamHoc());
            preparedStatement.setString(10, sinhVien.getGhiChu());
            int rs = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateSinhVien(SinhVien sinhVien){
        Connection connection = DBConnection.getConnection();
        String sql = "Update SinhVien set tenSV = ? , lopSH = ? , gioiTinh = ?, Khoa = ?, SDT = ?, eMail = ?, doiTuong = ?, namHoc = ?, ghiCh = ?"
                + " where maSV = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, sinhVien.getMaSV());
            preparedStatement.setString(2, sinhVien.getTenSV());
            preparedStatement.setString(3, sinhVien.getLopSH());
            preparedStatement.setString(4, sinhVien.getGioiTinh());
            preparedStatement.setString(5, sinhVien.getKhoa());
            preparedStatement.setString(6, sinhVien.getSDT());
            preparedStatement.setString(7, sinhVien.geteMail());
            preparedStatement.setString(8, sinhVien.getDoiTuong());
            preparedStatement.setString(9, sinhVien.getNamHoc());
            preparedStatement.setString(10, sinhVien.getGhiChu());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteSinhVien(String maSV){
       Connection connection = DBConnection.getConnection();
       String sql = "delete from SinhVien where maSV = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maSV);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

