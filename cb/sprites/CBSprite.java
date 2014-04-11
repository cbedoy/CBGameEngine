package sprites;

import interfaces.CBIModel;
import interfaces.CBIObservable;
import interfaces.CBISprite;

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
public abstract class CBSprite implements CBISprite, CBIModel, CBIObservable {

    private int posX;
    private int posY;
    private int width;
    private int heigth;
    private int speed;

    public CBSprite(int posX, int posY, int width, int heigth, int speed){

        this.posX       =posX;
        this.posY       =posY;
        this.width      =width;
        this.heigth     =heigth;
        this.speed      =speed;

    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
