/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarmi;

/**
 *
 * @author tiago
 */
import java.rmi.Naming;

public class CalculadoraCliente {

    public static void main(String[] argv) {
        try {
            CalculadoraInterface hello = (CalculadoraInterface) Naming.lookup("//localhost/Calculadora");
            System.out.println(hello.add(1,2));
        } catch (Exception e) {
            System.out.println("HelloClient exception: " + e);
        }
    }
}
