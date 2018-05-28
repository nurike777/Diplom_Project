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
import fitnes.model.Request;
import org.codehaus.jackson.map.ObjectMapper;
/**
 *
 * @author nurzh
 */
public class JsonRequestMapper {
    public static String toJSON(Request request)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(request);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonRequestMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJSON(List<Request> request)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(request);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonRequestMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static Request fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Request request = mapper.readValue(json, Request.class);
            return request;
        } catch (IOException ex) {
            Logger.getLogger(JsonRequestMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
