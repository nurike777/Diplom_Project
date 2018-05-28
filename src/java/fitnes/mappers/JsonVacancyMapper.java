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
import fitnes.model.Vacancy;
import org.codehaus.jackson.map.ObjectMapper;
/**
 *
 * @author nurzh
 */
public class JsonVacancyMapper {
    public static String toJSON(Vacancy vacancy)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(vacancy);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonVacancyMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJSON(List<Vacancy> vacancy)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(vacancy);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonVacancyMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static Vacancy fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Vacancy vacancy = mapper.readValue(json, Vacancy.class);
            return vacancy;
        } catch (IOException ex) {
            Logger.getLogger(JsonVacancyMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
