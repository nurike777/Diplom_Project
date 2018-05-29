/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.DAL;

import java.util.List;
import fitnes.model.Coach;
import org.apache.ibatis.session.SqlSession;
/**
 *
 * @author nurzh
 */
public class CoachDal extends BaseDal {
    public CoachDal() {
        super();
    }
    
    public List<Coach> selectAll()
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         List<Coach> list = session.selectList("coach.selectAll");
         session.close();
         return list;
    }
    
    public Coach selectById(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         Coach coach= session.selectOne("coach.selectById",id);
         session.close();
         return coach;
    }
    
    public int update(Coach coach)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.update("coach.update",coach);
         session.commit();
         session.close();
         return count;
    }
    
    public int insert(Coach coach)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.insert("coach.insert",coach);
         session.commit();
         session.close();
         return count;
    }
     
    public int delete(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.delete("coach.deleteById",id);
         session.commit();
         session.close();
         return count;
    }
}
