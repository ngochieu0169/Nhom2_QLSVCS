/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Dao.SinhVienDao;
import Model.SinhVien;
import java.util.List;

/**
 *
 * @author DOAN NGOC HIEU
 */
public class SinhVienService {
        private SinhVienDao sinhVienDao;
    
    public SinhVienService(){
        sinhVienDao = new SinhVienDao();
    }
    
    public List<SinhVien> getAllSinhVien(){
        return sinhVienDao.getAllSinhVien();
    }
    
    public void addSinhVien(SinhVien sv){
        sinhVienDao.addSV(sv);
    }
    
    public void deleteSinhVien(String maSV){
        sinhVienDao.deleteSinhVien(maSV);
    }
    
    public SinhVien getSVById(String maSV){
        return sinhVienDao.getSVById(maSV);
    }
     
    public void updateSinhVien(SinhVien sv){
        sinhVienDao.updateSinhVien(sv);
    }
    
      public List<SinhVien> getfindSVById(String maSV){
        return sinhVienDao.getfindSVById(maSV);        
      }
    
}
