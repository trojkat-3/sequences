/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sequences.exceptions;

/**
 *
 * @author xenon
 */
public class OutOfBoundsException extends Exception {
    public OutOfBoundsException(String msg, int n){
        super("Argument [n=" + n+"] exceeds the allowed range. "+ msg);
    }
}
