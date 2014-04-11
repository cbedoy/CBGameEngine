package views;

import javax.swing.*;

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
public class CBView extends JFrame implements Runnable{

    private final int   CBHeight   =500;
    private final int   CBWight    =900;
    private final int   posX       =50;
    private final int   posY       =50;
    private Thread      thread;

    public CBView(){

        setTitle("CBGameEngine V 0.1");
        setVisible(true);
        setResizable(false);
        setBounds(posX, posY, CBWight, CBHeight);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thread = new Thread(this);
    }

    @Override
    public void run() {
        while(true){

        }
    }
}
