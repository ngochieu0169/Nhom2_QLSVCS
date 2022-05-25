/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Dao.Ad_minDao;
import Model.Ad_min;
import java.util.List;

/**
 *
 * @author DOAN NGOC HIEU
 */
public class Ad_minService {
       private Ad_minDao ad_MinDao;
    
    public Ad_minService(){
        ad_MinDao = new Ad_minDao();
    }
    
    public List<Ad_min> getAllAd_min(){
        return ad_MinDao.getAllAd_min();
    }
    
    public void addAd_min(Ad_min ad){
        ad_MinDao.addAd_min(ad);
    }
    
    public void deleteAd_min(String tkAdim){
        ad_MinDao.deleteAd_min(tkAdim);
    }
    
    public Ad_min getAd_minById(String tkAdmin){
        return ad_MinDao.getAd_minById(tkAdmin);
    }
     
    public void updateAd_min(Ad_min ad){
        ad_MinDao.updateAd_min(ad);
    }
    
}
