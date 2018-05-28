/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import fitnes.model.Price;
import org.codehaus.jackson.map.ObjectMapper;
/**
 *
 * @author nurzh
 */
public class JsonPriceMapper {
    public static String toJSON(Price price)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(price);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonPriceMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJSON(List<Price> price)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(price);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonPriceMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static Price fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Price price = mapper.readValue(json, Price.class);
            return price;
        } catch (IOException ex) {
            Logger.getLogger(JsonPriceMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
