/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.controllers;

import java.util.List;
import fitnes.DAL.VacancyDal;
import fitnes.model.Vacancy;
/**
 *
 * @author nurzh
 */
public class VacancyController {
    protected VacancyDal vacancyDal;
    public VacancyController() 
    {
        vacancyDal = new VacancyDal();
    }
    
    public List<Vacancy> getAllVacancy()
    {
        return vacancyDal.selectAll();
    }
    
    public Vacancy getVacancy(int id)
    {
        return vacancyDal.selectById(id);
    }
     
    public int insertVacancy(Vacancy vacancy)
    {
        return vacancyDal.insert(vacancy);
    }
      
    public int updateVacancy(Vacancy vacancy)
    {
        return vacancyDal.update(vacancy);
    }
    
    public int deleteVacancyById(int id)
    {
        return vacancyDal.delete(id);
    }
}
