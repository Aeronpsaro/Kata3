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
        int seed = (int)(Math.random()*100);
        for (int i = 0; i<seed; i++) {
            switch((int)(Math.random()*4)) {
                case 0 :
                    histogram.increment("gmail.com");
                    break;
                case 1 :
                    histogram.increment("ulpgc.es");
                    break;
                case 2 :
                    histogram.increment("ull.es");
                    break;
                case 3 :
                    histogram.increment("hotmail.com");
                    break;
            }
        }
        new HistogramDisplay(histogram).execute();
    }
    
}
