/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.ozone.lms.resource;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Sahan Thinusha
 */
public class Validation {

    public static void validateInt(final JTextField txt) {
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();  // ignore event
                }
            }
        });
    }

    public static void validateChar(final JTextField txt) {
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < 65) || (c > 90)) && ((c < 97) || (c > 122)) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_SPACE)) {
                    e.consume();  // ignore event
                }
            }
        });
    }

    public static void validatelength(final JTextField txt, final int size) {
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                String text = txt.getText();
                int length = text.length();
                if (length == size) {
                    e.consume();
                }
            }
        });

    }
}
