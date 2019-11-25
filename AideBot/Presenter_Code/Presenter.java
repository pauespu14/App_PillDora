import java.util.ArrayList;
import java.util.List;

public class Presenter {

    String user_id;
    String function;
    List<String> parameters;
    Client client;

    public Presenter(String user_id, String function, List<String> parameters, Client client){
        this.user_id = user_id;
        this.function = function;
        this.parameters = new ArrayList<String>();
        this.client = client;

    }

    public String query_creator(String user_id, String function,List<String> parameters){
        String json_parsed = "";

        return json_parsed;
    }

    public List<String> processInformation(String json_rebut){
        return null;
    }



}