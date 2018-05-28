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
import fitnes.model.Coach;
import org.codehaus.jackson.map.ObjectMapper;
/**
 *
 * @author nurzh
 */
public class JsonCoachMapper {
    public static String toJSON(Coach coach)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(coach);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonCoachMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJSON(List<Coach> coach)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(coach);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonCoachMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static Coach fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Coach coach = mapper.readValue(json, Coach.class);
            return coach;
        } catch (IOException ex) {
            Logger.getLogger(JsonCoachMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
