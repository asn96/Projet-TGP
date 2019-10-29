/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestockDB;

/**
 *
 * @author Soda Ndiaye
 */
public class testAmad {
    public static void main(String[] args) {
        
        //System.out.println(calculPuissance(2, 3));
        
         }
    public double calculPuissance(int x, int y) {
            double resulte = 1;
            for (int i = 1; i <= y; i++) {
                resulte *=x;
            }
            return resulte;
        }

}
