class ClientService
{
    getAllClient()
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/Diplom/GetAllClient',false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
            var clientList = JSON.parse(request.responseText );
            return clientList;
         }
         return null;
    }
    
    
     insertClient(json)
    {
        var request = new XMLHttpRequest();
        request.open('GET', '/Diplom/InsertClient?json='+json, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var json= JSON.parse(request.responseText );
             return json;
         }
         return null;
    }
    
    
    getClientById(id)
    {
        var request = new XMLHttpRequest();
        request.open('GET', '/Diplom/GetClientById?id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var client= JSON.parse(request.responseText );
             return client;
         }
         return null;
    }
    
}