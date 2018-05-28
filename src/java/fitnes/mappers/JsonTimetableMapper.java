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
import fitnes.model.Timetable;
import org.codehaus.jackson.map.ObjectMapper;
/**
 *
 * @author nurzh
 */
public class JsonTimetableMapper {
    public static String toJSON(Timetable timetable)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(timetable);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonTimetableMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJSON(List<Timetable> timetable)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(timetable);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonTimetableMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static Timetable fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Timetable timetable = mapper.readValue(json, Timetable.class);
            return timetable;
        } catch (IOException ex) {
            Logger.getLogger(JsonTimetableMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
