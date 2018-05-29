/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.controllers;

import java.util.List;
import fitnes.DAL.PositionDal;
import fitnes.model.Position;
/**
 *
 * @author nurzh
 */
public class PositionController {
    protected PositionDal positionDal;
    public PositionController() 
    {
        positionDal = new PositionDal();
    }
    
    public List<Position> getAllPosition()
    {
        return positionDal.selectAll();
    }
    
    public Position getPosition(int id)
    {
        return positionDal.selectById(id);
    }
     
    public int insertPosition(Position position)
    {
        return positionDal.insert(position);
    }
      
    public int updatePosition(Position position)
    {
        return positionDal.update(position);
    }
    
    public int deletePositionById(int id)
    {
        return positionDal.delete(id);
    }
}
