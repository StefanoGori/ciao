/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programma1;

/**
 *
 * @author 4BIA
 */
public class Programma1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Razionale uno=new Razionale(1,5);
        Razionale due=new Razionale(2,7);
        Razionale tre=new Razionale(3,5);
        Razionale quattro=new Razionale();
        Razionale cinque=new Razionale(4,20);
        quattro=uno.somma(due);
        System.out.println("la somma e:"+uno.somma(tre));
        System.out.println("la differenza e: "+uno.differenza(tre));
        System.out.println("il prodotto e: "+uno.prodotto(tre));
        System.out.println("il quoziente e: "+uno.quoziente(tre));
        System.out.println("il reciproco e: "+uno.reciproco(tre));
        System.out.println("il numeratore e' zero: "+uno.isZero());
        System.out.println("il numeratore è maggiore di zero: "+uno.isPositive());
        System.out.println("-1 se la frazione è minore, 0 se sono uguali, 1 se la frazione è maggiore: "+uno.confronto(tre));
        System.out.println("stringa: "+uno.toString());
    }
    
}
