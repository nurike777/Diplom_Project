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
import fitnes.model.Position;
import org.codehaus.jackson.map.ObjectMapper;
/**
 *
 * @author nurzh
 */
public class JsonPositionMapper {
    public static String toJSON(Position position)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(position);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonPositionMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJSON(List<Position> position)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(position);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonPositionMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static Position fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Position position = mapper.readValue(json, Position.class);
            return position;
        } catch (IOException ex) {
            Logger.getLogger(JsonPositionMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
