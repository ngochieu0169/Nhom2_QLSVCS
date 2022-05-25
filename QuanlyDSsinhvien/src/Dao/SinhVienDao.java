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
import javax.swing.JOptionPane;

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
                sinhVien.setKhoa(rs.getString("Khoa"));
                sinhVien.setGioiTinh(rs.getString("gioiTinh"));             
                sinhVien.setSDT(rs.getString("SDT"));
                sinhVien.seteMail(rs.getString("eMail"));
                sinhVien.setNgaySinh(rs.getString("ngaySinh"));
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
                sinhVien.setKhoa(rs.getString("Khoa"));
                sinhVien.setGioiTinh(rs.getString("gioiTinh"));             
                sinhVien.setSDT(rs.getString("SDT"));
                sinhVien.seteMail(rs.getString("eMail"));
                sinhVien.setNgaySinh(rs.getString("ngaySinh"));
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
    
    public List<SinhVien> getfindSVById(String maSV) {
        List<SinhVien> sinhVien_l = new ArrayList<SinhVien>();
        Connection connection = DBConnection.getConnection();
        String sql = "select * from SinhVien where maSV like '%"+maSV+"%'";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
           
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                SinhVien sinhVien = new SinhVien();
                
                sinhVien.setMaSV(rs.getString(1));
                sinhVien.setTenSV(rs.getString(2));
                sinhVien.setLopSH(rs.getString(3));
                sinhVien.setKhoa(rs.getString(4));
                sinhVien.setGioiTinh(rs.getString(5));             
                sinhVien.setSDT(rs.getString(6));
                sinhVien.seteMail(rs.getString(7));
                sinhVien.setNgaySinh(rs.getString(8));
                sinhVien.setDoiTuong(rs.getString(9));
                sinhVien.setNamHoc(rs.getString(10));            
                sinhVien.setGhiChu(rs.getString(11));
                
                sinhVien_l.add(sinhVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sinhVien_l;
    }

    public void addSV(SinhVien sinhVien) {
        Connection connection = DBConnection.getConnection();
        String sql = " INSERT INTO SinhVien( maSV, tenSV, lopSH, Khoa, gioiTinh, SDT, eMail, ngaySinh, doiTuong, namHoc, ghiChu)"
                + " VALUES(?,?,?,?,?,?,?,?,?,?,?) ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, sinhVien.getMaSV());
            preparedStatement.setString(2, sinhVien.getTenSV());
            preparedStatement.setString(3, sinhVien.getLopSH());            
            preparedStatement.setString(4, sinhVien.getKhoa());
            preparedStatement.setString(5, sinhVien.getGioiTinh());
            preparedStatement.setString(6, sinhVien.getSDT());
            preparedStatement.setString(7, sinhVien.geteMail());
            preparedStatement.setString(8, sinhVien.getNgaySinh()); 
            preparedStatement.setString(9, sinhVien.getDoiTuong());
            preparedStatement.setString(10, sinhVien.getNamHoc());
            preparedStatement.setString(11, sinhVien.getGhiChu());
                      
            int rs = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateSinhVien(SinhVien sinhVien){
        int rs = 0;
        Connection connection = DBConnection.getConnection();
        String sql = "UPDATE SinhVien SET tenSV = ? , lopSH = ? , gioiTinh = ?, Khoa = ?, SDT = ?, eMail = ?, ngaySinh = ?,doiTuong = ?, namHoc= ?, ghiChu=? "
                + "  where maSV = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            
             
            st.setString(1, sinhVien.getTenSV());
            st.setString(2, sinhVien.getLopSH());            
            st.setString(3, sinhVien.getKhoa());
            st.setString(4, sinhVien.getGioiTinh());
            st.setString(5, sinhVien.getSDT());
            st.setString(6, sinhVien.geteMail());
            st.setString(7, sinhVien.getNgaySinh()); 
            st.setString(8, sinhVien.getDoiTuong());
            st.setString(9, sinhVien.getNamHoc());
            st.setString(10, sinhVien.getGhiChu());
            st.setString(11, sinhVien.getMaSV());
            
             rs = st.executeUpdate();
             if(rs>0)
                 JOptionPane.showMessageDialog(null, "Sửa thành công ");
             else{
                 JOptionPane.showMessageDialog(null, "Sai Mã sinh viên");
             }
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

