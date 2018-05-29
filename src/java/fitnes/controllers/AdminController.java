/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.controllers;

import java.util.List;
import fitnes.DAL.AdminDal;
import fitnes.model.Admin;
/**
 *
 * @author nurzh
 */
public class AdminController {
    protected AdminDal adminDal;
    public AdminController() 
    {
        adminDal = new AdminDal();
    }
    
    public List<Admin> getAllAdmin()
    {
        return adminDal.selectAll();
    }
    
    public Admin getAdmin(int id)
    {
        return adminDal.selectById(id);
    }
     
    public int insertAdmin(Admin admin)
    {
        return adminDal.insert(admin);
    }
      
    public int updateAdmin(Admin admin)
    {
        return adminDal.update(admin);
    }
    
    public int deleteAdminById(int id)
    {
        return adminDal.delete(id);
    }
}
