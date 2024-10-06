/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fp8_parimpar;

/**
 *
 * @author Miguel Ortiz
 */
public class FP8_ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase_Numero objNum = new Clase_Numero();
        objNum.CapturaNumero();
        while (objNum.numero != 0)
        {
            objNum.CapturaNumero();
        }
    }
    
}
