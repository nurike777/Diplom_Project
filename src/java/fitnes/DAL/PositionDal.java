/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.DAL;

import java.util.List;
import fitnes.model.Position;
import org.apache.ibatis.session.SqlSession;
/**
 *
 * @author nurzh
 */
public class PositionDal extends BaseDal {
    public PositionDal() {
        super();
    }
    
    public List<Position> selectAll()
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         List<Position> list = session.selectList("position.selectAll");
         session.close();
         return list;
    }
    
    public Position selectById(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         Position position= session.selectOne("position.selectById",id);
         session.close();
         return position;
    }
    
    public int update(Position position)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.update("position.update",position);
         session.commit();
         session.close();
         return count;
    }
    
    public int insert(Position position)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.insert("position.insert",position);
         session.commit();
         session.close();
         return count;
    }
     
    public int delete(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.delete("position.deleteById",id);
         session.commit();
         session.close();
         return count;
    }
}
