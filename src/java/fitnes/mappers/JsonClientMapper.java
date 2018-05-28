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
import fitnes.model.Client;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author nurzh
 */
public class JsonClientMapper {
    public static String toJSON(Client client)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(client);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonClientMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJSON(List<Client> client)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(client);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonClientMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static Client fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Client client = mapper.readValue(json, Client.class);
            return client;
        } catch (IOException ex) {
            Logger.getLogger(JsonClientMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
