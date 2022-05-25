/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Ad_min;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DOAN NGOC HIEU
 */
public class Ad_minDao {
      public List<Ad_min> getAllAd_min() {
        List<Ad_min> ad_Min_l = new ArrayList<Ad_min>();

        Connection connection = DBConnection.getConnection();
        String sql = "select * from Ad_min";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Ad_min ad_Min = new Ad_min();
                ad_Min.setTkAdmin(rs.getString("tkAdim"));
                ad_Min.setMkAdmin(rs.getString("mkAdim"));
                ad_Min.setHoten(rs.getString("Họ Tên"));
                ad_Min.setNgaySinh(rs.getString("ngaySinh"));
                ad_Min.setCmnd(rs.getString("Cmnd"));
                ad_Min.seteMail(rs.getString("eMail"));
                ad_Min.setSDT(rs.getString("SDT"));
                ad_Min.setDiachi(rs.getString("Đia Chỉ"));
                ad_Min.setTenchucvu(rs.getString("Tên Chức Vụ"));
                ad_Min.setTinhtrang(rs.getString("Tình Trạng"));
                ad_Min.setNgaydangki(rs.getString("ghiChu"));
                
                ad_Min_l.add(ad_Min);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ad_Min_l;
    }
    
    public Ad_min getAd_minById(String maSV) {
        
        Connection connection = DBConnection.getConnection();
        String sql = "select * from SinhVien where maSV = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maSV);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                 Ad_min ad_Min = new Ad_min();
                ad_Min.setTkAdmin(rs.getString("tkAdim"));
                ad_Min.setMkAdmin(rs.getString("mkAdim"));
                ad_Min.setHoten(rs.getString("Họ Tên"));
                ad_Min.setNgaySinh(rs.getString("ngaySinh"));
                ad_Min.setCmnd(rs.getString("Cmnd"));
                ad_Min.seteMail(rs.getString("eMail"));
                ad_Min.setSDT(rs.getString("SDT"));
                ad_Min.setDiachi(rs.getString("Đia Chỉ"));
                ad_Min.setTenchucvu(rs.getString("Tên Chức Vụ"));
                ad_Min.setTinhtrang(rs.getString("Tình Trạng"));
                ad_Min.setNgaydangki(rs.getString("ghiChu"));
                
                return ad_Min;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addAd_min(Ad_min ad_Min) {
        Connection connection = DBConnection.getConnection();
        String sql = " INSERT INTO Ad_min( tkAdmin, mkAdmin, hoten, ngaysinh, cmnd, email, sdt, diachi, tenchucvu, tinhtrang, ngaydangki)"
                + " VALUES(?,?,?,?,?,?,?,?,?,?,?) ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ad_Min.getTkAdmin());
            preparedStatement.setString(2, ad_Min.getMkAdmin());   
            preparedStatement.setString(3, ad_Min.getHoten());
            preparedStatement.setString(4, ad_Min.getNgaySinh());
            preparedStatement.setString(5, ad_Min.getCmnd());
            preparedStatement.setString(6, ad_Min.geteMail());
            preparedStatement.setString(7, ad_Min.getSDT());
            preparedStatement.setString(8, ad_Min.getDiachi());
            preparedStatement.setString(9, ad_Min.getTenchucvu());
            preparedStatement.setString(10, ad_Min.getTinhtrang());
            preparedStatement.setString(11, ad_Min.getNgaydangki());
            int rs = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateAd_min(Ad_min ad_Min){
        Connection connection = DBConnection.getConnection();
        String sql = "Update Ad_min set mkAdim = ? , hoten = ? , ngaysinh = ?, cmnd = ?, email = ?, sdt = ?, diachi = ?, tenchuvu = ?, tinhtrang = ?, ngaydangki = ?"
                + " where tkAdmin = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ad_Min.getTkAdmin());
            preparedStatement.setString(2, ad_Min.getMkAdmin());   
            preparedStatement.setString(3, ad_Min.getHoten());
            preparedStatement.setString(4, ad_Min.getNgaySinh());
            preparedStatement.setString(5, ad_Min.getCmnd());
            preparedStatement.setString(6, ad_Min.geteMail());
            preparedStatement.setString(7, ad_Min.getSDT());
            preparedStatement.setString(8, ad_Min.getDiachi());
            preparedStatement.setString(9, ad_Min.getTenchucvu());
            preparedStatement.setString(10, ad_Min.getTinhtrang());
            preparedStatement.setString(11, ad_Min.getNgaydangki());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteAd_min(String tkAdim){
       Connection connection = DBConnection.getConnection();
       String sql = "delete from Ad_min where tkAdmin = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tkAdim);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
