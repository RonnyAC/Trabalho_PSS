/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Ronny
 */
public class NumerosDecimais extends PlainDocument {

    private final Integer maxLength;

    public NumerosDecimais(Integer maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        String texto = getText(0, getLength());
        if (texto.length() < this.maxLength) {
            remove(0, getLength());
            StringBuilder strBuf = new StringBuilder(texto.replaceAll(",", "") + str);
            if (strBuf.length() < 3) {
                strBuf.insert(0, ",");
            } else {
                strBuf.insert(strBuf.length() - 2, ",");
            }
            super.insertString(0, strBuf.toString(), a);
        }
    }
}
