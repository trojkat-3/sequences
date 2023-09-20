/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sequences.exceptions;

/**
 *
 * @author xenon
 */
public class CantDecomposeException extends Exception {
    public CantDecomposeException(int n, String name){
        super("I'am not able to decompose "+n+" using "+name+" sequence.");
    }
}
