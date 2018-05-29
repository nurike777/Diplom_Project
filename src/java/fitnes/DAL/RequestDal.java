/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.DAL;

import java.util.List;
import fitnes.model.Request;
import org.apache.ibatis.session.SqlSession;
/**
 *
 * @author nurzh
 */
public class RequestDal extends BaseDal {
    public RequestDal() {
        super();
    }
    
    public List<Request> selectAll()
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         List<Request> list = session.selectList("request.selectAll");
         session.close();
         return list;
    }
    
    public Request selectById(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         Request request= session.selectOne("request.selectById",id);
         session.close();
         return request;
    }
    
    public int update(Request request)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.update("request.update",request);
         session.commit();
         session.close();
         return count;
    }
    
    public int insert(Request request)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.insert("request.insert",request);
         session.commit();
         session.close();
         return count;
    }
     
    public int delete(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.delete("request.deleteById",id);
         session.commit();
         session.close();
         return count;
    }
}
