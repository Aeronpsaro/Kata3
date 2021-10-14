/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3_42;

/**
 *
 * @author Entrar
 */
public class Kata3_42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        new HistogramDisplay(histogram).execute();
    }
    
}
