/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.controllers;

import java.util.List;
import fitnes.DAL.RequestDal;
import fitnes.model.Request;
/**
 *
 * @author nurzh
 */
public class RequestController {
    protected RequestDal requestDal;
    public RequestController() 
    {
        requestDal = new RequestDal();
    }
    
    public List<Request> getAllRequest()
    {
        return requestDal.selectAll();
    }
    
    public Request getRequest(int id)
    {
        return requestDal.selectById(id);
    }
     
    public int insertRequest(Request request)
    {
        return requestDal.insert(request);
    }
      
    public int updateRequest(Request request)
    {
        return requestDal.update(request);
    }
    
    public int deleteRequestById(int id)
    {
        return requestDal.delete(id);
    }
}
