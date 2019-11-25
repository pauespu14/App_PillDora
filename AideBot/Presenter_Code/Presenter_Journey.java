public class Presenter_Journey extends Presenter {

    

    public Presenter_Journey (String user_id, String function, List<String> parameters, Client client){
        super(user_id, function, parameters, client);
        if(function != "calendar"){
            // ERROR
        }
        
    }
    /* Tots els presenters hereden el query creator i per tant per a enviar peticions 
    d'informació no hi haurà cap mena de problema. La diferència serà que cada presenter 
    tindrà métodes diferents de com enviar la informació a les diferents View


    Recordeu que heu de cridar a Client.java per a rebre el json 
    */


    
    public ArrayList<String> present_journey (List<String> parameters){
        // Preparar la query
        String query = super.query_creator(parameters);
        // Enviar la informació
        
        // Client llegeix ...
        String json_rebut = null;
        
        //processar el json rebut
        ArrayList<String> llista = super.processInformation(json_rebut);

        // Ara toca enviar només la infromació important en una llista de llistes
    }
}