package utils;

import interfaces.CBIObservable;

import java.util.ArrayList;

/**
 * --------------------------------------------------------
 * Created by Carlos Bedoy on 11/04/14.
 * CBGameEngine
 * Mobile Developer
 * Aguascalientes Mexico
 * Email:       carlos.bedoy@gmail.com
 * Facebook:    https://www.facebook.com/carlos.bedoy
 * ---------CODE && MUSIC ----------------------------------
 */
public class CBObserverManager {

    private ArrayList<CBIObservable> observableList;

    public CBObserverManager(){
        this.observableList = new ArrayList<CBIObservable>();
    }

    public void addObserver(CBIObservable observable){
        this.observableList.add(observable);
    }

    public void removeObserver(CBIObservable observable){
        this.observableList.remove(observable);
    }

    public void notifyChanges(){
        for(CBIObservable observable : this.observableList){
            observable.reload();
        }
    }

}
