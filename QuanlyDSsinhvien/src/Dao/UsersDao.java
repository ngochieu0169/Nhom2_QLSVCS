/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author DOAN NGOC HIEU
 */
public class UsersDao {
    public List<Users> getAllUsers() {
        List<Users> uSers_1 = new ArrayList<Users>();

        Connection connection = DBConnection.getConnection();
        String sql = "select * from users";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Users uSers = new Users();
                uSers.setTk(rs.getString("tk"));
                uSers.setMk(rs.getString("mk"));
                uSers.setHoten(rs.getString("hoten"));
                uSers.setNgaySinh(rs.getString("ngaysinh"));
                uSers.setCmnd(rs.getString("Cmnd"));
                uSers.seteMail(rs.getString("email"));
                uSers.setSDT(rs.getString("sdt"));
                uSers.setDiachi(rs.getString("diachi"));
                uSers.setTenchucvu(rs.getString("tenchucvu"));
                uSers.setTinhtrang(rs.getString("tinhtrang"));
                uSers.setNgaydangki(rs.getString("ngaydangki"));
                
                uSers_1.add(uSers);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return uSers_1;
    }
    
    public Users getUsersDaoById(String tk) {
        
        Connection connection = DBConnection.getConnection();
        String sql = "select * from users where tk = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tk);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Users uSers = new Users();
                uSers.setTk(rs.getString("tk"));
                uSers.setMk(rs.getString("mk"));
                uSers.setHoten(rs.getString("hoten"));
                uSers.setNgaySinh(rs.getString("ngaysinh"));
                uSers.setCmnd(rs.getString("cmnd"));
                uSers.seteMail(rs.getString("email"));
                uSers.setSDT(rs.getString("sdt"));
                uSers.setDiachi(rs.getString("diachi"));
                uSers.setTenchucvu(rs.getString("tenchucvu"));
                uSers.setTinhtrang(rs.getString("tinhtrang"));
                uSers.setNgaydangki(rs.getString("ngaydangki"));
                return uSers;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addUsersDao(Users uSers) {
        Connection connection = DBConnection.getConnection();
        String sql = " INSERT INTO users( tk, mk, hoten, ngaysinh, cmnd, email, sdt, diachi, tenchucvu, tinhtrang, ngaydangki)"
                + " VALUES(?,?,?,?,?,?,?,?,?,?,?) ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, uSers.getTk());
            preparedStatement.setString(2, uSers.getMk());   
            preparedStatement.setString(3, uSers.getHoten());
            preparedStatement.setString(4, uSers.getNgaySinh());
            preparedStatement.setString(5, uSers.getCmnd());
            preparedStatement.setString(6, uSers.geteMail());
            preparedStatement.setString(7, uSers.getSDT());
            preparedStatement.setString(8, uSers.getDiachi());
            preparedStatement.setString(9, uSers.getTenchucvu());
            preparedStatement.setString(10, uSers.getTinhtrang());
            preparedStatement.setString(11, uSers.getNgaydangki());
            int rs = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateUsersDao(Users uSers){
        Connection connection = DBConnection.getConnection();
        String sql = "Update users set mk = ? , hoten = ? , ngaysinh = ?, cmnd = ?, sdt = ?, diachi = ?, email = ?, tenchucvu = ?, tinhtrang = ?, ngaydangki = ?"
                + " where tk = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, uSers.getMk());   
            preparedStatement.setString(2, uSers.getHoten());
            preparedStatement.setString(3, uSers.getNgaySinh());
            preparedStatement.setString(4, uSers.getCmnd());
            
            preparedStatement.setString(5, uSers.getSDT());
            preparedStatement.setString(6, uSers.getDiachi());
            preparedStatement.setString(7, uSers.geteMail());
            preparedStatement.setString(8, uSers.getTenchucvu());
            preparedStatement.setString(9, uSers.getTinhtrang());
            preparedStatement.setString(10, uSers.getNgaydangki());            
            preparedStatement.setString(11, uSers.getTk());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
              if(rs>0)
                 JOptionPane.showMessageDialog(null, "Sửa thành công ");
             else{
                 JOptionPane.showMessageDialog(null, "Sai Mã sinh viên");
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteUsersDao(String tk){
       Connection connection = DBConnection.getConnection();
       String sql = "delete from users where tk = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tk);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
