/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes.controllers;

import java.util.List;
import fitnes.DAL.ClientDal;
import fitnes.model.Client;
/**
 *
 * @author nurzh
 */
public class ClientController {
    protected ClientDal clientDal;
    public ClientController() 
    {
        clientDal = new ClientDal();
    }
    
    public List<Client> getAllClient()
    {
        return clientDal.selectAll();
    }
    
    public Client getClient(int id)
    {
        return clientDal.selectById(id);
    }
     
    public int insertClient(Client client)
    {
        return clientDal.insert(client);
    }
      
    public int updateClient(Client client)
    {
        return clientDal.update(client);
    }
    
    public int deleteClientById(int id)
    {
        return clientDal.delete(id);
    }
}
