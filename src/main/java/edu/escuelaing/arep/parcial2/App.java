package edu.escuelaing.arep.parcial2;

import spark.Request;
import spark.Response;
import com.google.gson.Gson;

import java.util.HashMap;

import static spark.Spark.*;
public class App 
{
    public static void main( String[] args )
    {
        secure("keystores/ecikeystore.p12", "123456", null, null);
        port(getPort());
        get("/hello", (req, res) -> "Hello World");
        Operations ope = new Operations();
        get("/atan", (req, res) -> atan(req, res));
        get("/acos", (req, res) -> acos(req, res));
    }

    public static String atan(Request req, Response res){
        res.type("application/json");
        Operations ope = new Operations();
        HashMap<String,String> cache=ope.atan(req.queryParams("value"));
        Gson gson=new Gson();
        String JSON= gson.toJson(cache);
        return JSON;
    }

    public static String acos(Request req, Response res){
        res.type("application/json");
        Operations ope = new Operations();
        HashMap<String,String> cache=ope.acos(req.queryParams("value"));
        Gson gson=new Gson();
        String JSON= gson.toJson(cache);
        return JSON;
    }

    public static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 25000; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
