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
public class mcm {
    int a,b,mult_a,mult_b;
    int mcm;
    
    public mcm(){
    a=1;
    b=2;
    }
    
   public int mcm(int a, int b){
    mult_a = a;
    mult_b = b;
    while (mult_a != mult_b) {
    while (mult_a < mult_b)  mult_a += a;
    while (mult_b < mult_a)  mult_b += b;
    }
    return mult_a;
    }
}
