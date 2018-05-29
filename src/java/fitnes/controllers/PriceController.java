/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.controllers;

import java.util.List;
import fitnes.DAL.PriceDal;
import fitnes.model.Price;
/**
 *
 * @author nurzh
 */
public class PriceController {
    protected PriceDal priceDal;
    public PriceController() 
    {
        priceDal = new PriceDal();
    }
    
    public List<Price> getAllPrice()
    {
        return priceDal.selectAll();
    }
    
    public Price getPrice(int id)
    {
        return priceDal.selectById(id);
    }
     
    public int insertPrice(Price price)
    {
        return priceDal.insert(price);
    }
      
    public int updatePrice(Price price)
    {
        return priceDal.update(price);
    }
    
    public int deletePriceById(int id)
    {
        return priceDal.delete(id);
    }
}
