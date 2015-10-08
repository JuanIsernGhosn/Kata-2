/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kata2Mia;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = {2,2,2,3,2,5,6,7,6};
        Histograma histograma = new Histograma (vector);
        histograma.generateHistogram();
        System.out.print(histograma.toString());
    }
}
