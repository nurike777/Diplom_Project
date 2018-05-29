/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.controllers;

import java.util.List;
import fitnes.DAL.CoachDal;
import fitnes.model.Coach;
/**
 *
 * @author nurzh
 */
public class CoachController {
    protected CoachDal coachDal;
    public CoachController() 
    {
        coachDal = new CoachDal();
    }
    
    public List<Coach> getAllCoach()
    {
        return coachDal.selectAll();
    }
    
    public Coach getCoach(int id)
    {
        return coachDal.selectById(id);
    }
     
    public int insertCoach(Coach coach)
    {
        return coachDal.insert(coach);
    }
      
    public int updateCoach(Coach coach)
    {
        return coachDal.update(coach);
    }
    
    public int deleteCoachById(int id)
    {
        return coachDal.delete(id);
    }
}
