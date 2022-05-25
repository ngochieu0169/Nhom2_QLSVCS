/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Dao.UsersDao;
import Model.Users;
import java.util.List;

/**
 *
 * @author DOAN NGOC HIEU
 */
public class UsersService {
        private UsersDao uSersDao;
    
    public UsersService(){
        uSersDao = new UsersDao();
    }
    
    public List<Users> getAllUsers(){
        return uSersDao.getAllUsersDao();
    }
    
    public void addUsers(Users use){
        uSersDao.addUsersDao(use);
    }
    
    public void deleteUsers(String tkAdim){
        uSersDao.deleteUsersDao(tkAdim);
    }
    
    public Users getUsersById(String tk){
        return uSersDao.getUsersDaoById(tk);
    }
     
    public void updateUsers(Users use){
        uSersDao.updateUsersDao(use);
    }
    
    
}
