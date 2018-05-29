/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.DAL;

import java.util.List;
import fitnes.model.Admin;
import org.apache.ibatis.session.SqlSession;
/**
 *
 * @author nurzh
 */
public class AdminDal extends BaseDal {
    public AdminDal() {
        super();
    }
    
    public List<Admin> selectAll()
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         List<Admin> list = session.selectList("admin.selectAll");
         session.close();
         return list;
    }
    
    public Admin selectById(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         Admin admin= session.selectOne("admin.selectById",id);
         session.close();
         return admin;
    }
    
    public int update(Admin admin)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.update("admin.update",admin);
         session.commit();
         session.close();
         return count;
    }
    
    public int insert(Admin admin)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.insert("admin.insert",admin);
         session.commit();
         session.close();
         return count;
    }
     
    public int delete(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.delete("admin.deleteById",id);
         session.commit();
         session.close();
         return count;
    }
}
