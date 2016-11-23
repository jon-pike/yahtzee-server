package sparkexample;

import static spark.Spark.get;
import com.google.gson.Gson;
import java.util.HashMap;

public class Service {

    public static void main(String[] args) {
    	DiceRoller roller = new YahtzeeDiceRoller();
        get("/", "application/json", (req, res) -> {
            HashMap<String,Object> result = new HashMap<String,Object>();
            result.put( "message", roller.roll() );
            return new Gson().toJson(result);
        });
    }

}
