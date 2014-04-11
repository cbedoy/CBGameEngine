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
public class CBMediaConnector {
    private HashMap<String, CBIModel> mediaDictionary;

    public CBMediaConnector(){
        this.mediaDictionary = new HashMap<String, CBIModel>();
    }

    public void addSprite(String key, CBIModel value){
        this.mediaDictionary.put(key, value);
    }

    public void removeSprite(CBIModel value){
        this.mediaDictionary.remove(value);
    }
}
