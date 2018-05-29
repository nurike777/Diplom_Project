/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.DAL;

import java.util.List;
import fitnes.model.Timetable;
import org.apache.ibatis.session.SqlSession;
/**
 *
 * @author nurzh
 */
public class TimetableDal extends BaseDal {
    public TimetableDal() {
        super();
    }
    
    public List<Timetable> selectAll()
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         List<Timetable> list = session.selectList("timetable.selectAll");
         session.close();
         return list;
    }
    
    public Timetable selectById(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         Timetable timetable= session.selectOne("timetable.selectById",id);
         session.close();
         return timetable;
    }
    
    public int update(Timetable timetable)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.update("timetable.update",timetable);
         session.commit();
         session.close();
         return count;
    }
    
    public int insert(Timetable timetable)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.insert("timetable.insert",timetable);
         session.commit();
         session.close();
         return count;
    }
     
    public int delete(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.delete("timetable.deleteById",id);
         session.commit();
         session.close();
         return count;
    }
}
