
package fp_9_uii_ejercicios_t1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Clase_Medidas {
    private double MedidaPies;
    private double MedidaMetros;
    
    public void Captura_Medidas()
    {
        Scanner objLeerMedida = new Scanner(System.in);
        System.out.print("Captura la medida en pies: ");
        this.MedidaPies = objLeerMedida.nextDouble();
        System.out.print("Captura la medida en metros: ");
        this.MedidaMetros = objLeerMedida.nextDouble();
    }
    
    public void Conversiones_Medidas()
    {
        double Conversion  = 0;
        double Conv_Pies = 0;
        double Conv_Metros = 0;
                
        String Patron = "#,###.#######";
        DecimalFormat objFormato = new DecimalFormat(Patron);
        
        //Conversion = ((this.MedidaPies / 5280) + (this.MedidaMetros / 1609));
        
        System.out.println("********** Cálculo a Millas **********");
        Conv_Pies = this.MedidaPies / 5280;
        Conv_Metros = this.MedidaMetros / 1609;
        Conversion = Conv_Pies + Conv_Metros;
        System.out.println ("Pies a Millas: " + objFormato.format(Conv_Pies) + "\n" + 
                            "Metros a Millas: " + objFormato.format(Conv_Metros) + "\n" +
                            "Total de Millas es igual a " + objFormato.format(Conversion));
        
        System.out.println("********** Cálculo a Pulgadas **********");
        Conv_Pies = this.MedidaPies * 12;
        Conv_Metros = this.MedidaMetros * 39.37;
        Conversion = Conv_Pies + Conv_Metros;
        System.out.println ("Pies a Pulgadas: " + objFormato.format(Conv_Pies) + "\n" + 
                            "Metros a Pulgadas: " + objFormato.format(Conv_Metros) + "\n" +
                            "Total de Pulgadas es igual a " + objFormato.format(Conversion));
        
        System.out.println("********** Cálculo a Yardas **********");
        Conv_Pies = this.MedidaPies / 3;
        Conv_Metros = this.MedidaMetros * 1.094;
        Conversion = Conv_Pies + Conv_Metros;
        System.out.println ("Pies a Yardas: " + objFormato.format(Conv_Pies) + "\n" + 
                            "Metros a Yardas: " + objFormato.format(Conv_Metros) + "\n" +
                            "Total de Yardas es igual a " + objFormato.format(Conversion));
        
        System.out.println("********** Cálculo a Metros **********");
        Conv_Pies = this.MedidaPies / 3.281;
        Conv_Metros = this.MedidaMetros;
        Conversion = Conv_Pies + Conv_Metros;
        System.out.println ("Pies a Metros: " + objFormato.format(Conv_Pies) + "\n" + 
                            "Metros: " + objFormato.format(Conv_Metros) + "\n" +
                            "Total de Metros es igual a " + objFormato.format(Conversion));
        
    }
}
