package grezhz.ita.fundprog.s1_45.exam;

import java.util.Scanner;

public class Range {
    private int lowerBound;
    private int upperBound;
    private int sumWithinRange;
    private int outsideRangeCount;
    private boolean equalsToBounds;
    
    public void readBoundsFromConsole() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Introduzca el limite inferior: ");
            lowerBound = in.nextInt();
            System.out.print("Introduzca el límite superior: ");
            upperBound = in.nextInt();
            if (lowerBound > upperBound) {
                System.out.println("El límite inferior requiere ser menor o igual al superior. Introduzca los límites nuevamente.");
                continue;
            }
            break;
        }
    }
    
    public void readNumbersFromConsole() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Introduzca un número: ");
            int number = in.nextInt();
            
            if (number == 0) {
                break;
            }
            
            if ((number >= lowerBound) && (number <= upperBound)) {
                sumWithinRange += number;
            }
            else {
                outsideRangeCount++;
            }
            
            if (number == lowerBound || number == upperBound) {
                equalsToBounds = true;
            }
        }
    }
    
    public void printInformationToConsole() {
        System.out.println("Suma de los números dentro del rango: " + sumWithinRange);
        System.out.println("Números fuera del intervalo: " + outsideRangeCount);
        System.out.println("¿Algún número fue igual a los límites del intervalo? " + (equalsToBounds ? "Sí" : "No"));
    }
}
