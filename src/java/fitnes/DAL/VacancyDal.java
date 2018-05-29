/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.DAL;

import java.util.List;
import fitnes.model.Vacancy;
import org.apache.ibatis.session.SqlSession;
/**
 *
 * @author nurzh
 */
public class VacancyDal extends BaseDal {
    public VacancyDal() {
        super();
    }
    
    public List<Vacancy> selectAll()
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         List<Vacancy> list = session.selectList("vacancy.selectAll");
         session.close();
         return list;
    }
    
    public Vacancy selectById(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         Vacancy vacancy= session.selectOne("vacancy.selectById",id);
         session.close();
         return vacancy;
    }
    
    public int update(Vacancy vacancy)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.update("vacancy.update",vacancy);
         session.commit();
         session.close();
         return count;
    }
    
    public int insert(Vacancy vacancy)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.insert("vacancy.insert",vacancy);
         session.commit();
         session.close();
         return count;
    }
     
    public int delete(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.delete("vacancy.deleteById",id);
         session.commit();
         session.close();
         return count;
    }
}
