/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.DAL;

import java.util.List;
import fitnes.model.Client;
import org.apache.ibatis.session.SqlSession;
/**
 *
 * @author nurzh
 */
public class ClientDal extends BaseDal {
    public ClientDal() {
        super();
    }
    
    public List<Client> selectAll()
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         List<Client> list = session.selectList("client.selectAll");
         session.close();
         return list;
    }
    
    public Client selectById(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         Client client= session.selectOne("client.selectById",id);
         session.close();
         return client;
    }
    
    public int update(Client client)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.update("client.update",client);
         session.commit();
         session.close();
         return count;
    }
    
    public int insert(Client client)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.insert("client.insert",client);
         session.commit();
         session.close();
         return count;
    }
     
    public int delete(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.delete("client.deleteById",id);
         session.commit();
         session.close();
         return count;
    }
}
