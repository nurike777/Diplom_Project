/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.controllers;

import java.util.List;
import fitnes.DAL.TimetableDal;
import fitnes.model.Timetable;
/**
 *
 * @author nurzh
 */
public class TimetableController {
    protected TimetableDal timetableDal;
    public TimetableController() 
    {
        timetableDal = new TimetableDal();
    }
    
    public List<Timetable> getAllTimetable()
    {
        return timetableDal.selectAll();
    }
    
    public Timetable getTimetable(int id)
    {
        return timetableDal.selectById(id);
    }
     
    public int insertTimetable(Timetable timetable)
    {
        return timetableDal.insert(timetable);
    }
      
    public int updateTimetable(Timetable timetable)
    {
        return timetableDal.update(timetable);
    }
    
    public int deleteTimetableById(int id)
    {
        return timetableDal.delete(id);
    }
}
