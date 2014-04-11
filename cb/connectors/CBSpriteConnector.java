package connectors;

import interfaces.CBIModel;

import java.util.HashMap;

/**
 * --------------------------------------------------------
 * Created by Carlos Bedoy on 11/04/14.
 * CBGameEnine
 * Mobile Developer
 * Aguascalientes Mexico
 * Email:       carlos.bedoy@gmail.com
 * Facebook:    https://www.facebook.com/carlos.bedoy
 * ---------CODE && MUSIC ----------------------------------
 */
public class CBSpriteConnector {

    private HashMap<String, CBIModel> spriteDictionary;

    public CBSpriteConnector(){
        this.spriteDictionary = new HashMap<String, CBIModel>();
    }

    public void addSprite(String key, CBIModel value){
        this.spriteDictionary.put(key, value);
    }

    public void removeSprite(CBIModel value){
        this.spriteDictionary.remove(value);
    }

}
