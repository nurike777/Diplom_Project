/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.DAL;

import java.util.List;
import fitnes.model.Price;
import org.apache.ibatis.session.SqlSession;
/**
 *
 * @author nurzh
 */
public class PriceDal extends BaseDal {
    public PriceDal() {
        super();
    }
    
    public List<Price> selectAll()
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         List<Price> list = session.selectList("price.selectAll");
         session.close();
         return list;
    }
    
    public Price selectById(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         Price price= session.selectOne("price.selectById",id);
         session.close();
         return price;
    }
    
    public int update(Price price)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.update("price.update",price);
         session.commit();
         session.close();
         return count;
    }
    
    public int insert(Price price)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.insert("price.insert",price);
         session.commit();
         session.close();
         return count;
    }
     
    public int delete(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.delete("price.deleteById",id);
         session.commit();
         session.close();
         return count;
    }
}
