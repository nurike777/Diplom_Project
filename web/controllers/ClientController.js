class ClientController
{
    constructor()
    {
        this.clientService = new ClientService();
    }
    
    // DATAController
    getAllClient()
    {
        return this.clientService.getAllClient();
    }
    
    //ViewController
    
    getClientById(id)
    {
        return this.clientService.getClientById(id);
    }
    
    //ViewController
   
    deleteClientById(id)
    {
        return this.clientService.deleteClientById(id);
    }
    deleteClientByIdView(id){
        this.deleteClientById(id);
    }

    insertClient(json)
    {
       return this.clientService.insertClient(json);    
    }
}