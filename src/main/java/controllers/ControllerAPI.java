package controllers;
/* La dependencia de JSON es la siguiente:
https://mvnrepository.com/artifact/org.json/json/20220320 
Enlace directo para obtenerlo...*/

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import models.SimpsonCharacter;

public class ControllerAPI {

    ArrayList<SimpsonCharacter> characters;

    public ControllerAPI() {
        characters = new ArrayList<>();
    }

    public void consumeAPI() {
        try {
            URL url = new URL("https://thesimpsonsquoteapi.glitch.me/quotes?count=50");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                String information = "";
                Scanner sc = new Scanner(url.openStream());

                while (sc.hasNext()) {
                    information += sc.nextLine();
                }

                sc.close();
                JSONArray jsonArray = new JSONArray(information);
                for (int i = 0; i < jsonArray.length(); i++) 
                {
                    JSONObject obj = jsonArray.getJSONObject(i);
                    characters.add(new SimpsonCharacter(obj.getString("quote"), 
                    obj.getString("character"),
                    obj.getString("image"), 
                    obj.getString("characterDirection")));
                }
            }
            else{
                System.out.println("ERROR! - Check URL");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<SimpsonCharacter> getCharacters() {
        return characters;
    }

}
