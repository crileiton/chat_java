/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_java;

import java.io.DataInputStream;
import java.io.IOException;
import javax.swing.JTextArea;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author crileiton
 */
public class ReceiveMessage extends Thread {

    String msg = " ";
    DataInputStream dis = null;
    JTextArea txt_area = null;

    public ReceiveMessage(DataInputStream d, JTextArea a) {
        this.dis = d;
        this.txt_area = a;
    }

    public void run() {
        while (true) {
            try {
                msg = dis.readUTF();
                txt_area.append("\n" + this.getName() + ":" + msg);
            } catch (IOException ex) {
                Logger.getLogger(ReceiveMessage.class.getName()).log(Level.SEVERE, null,
                        ex);
            }
        }
    }

}
