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
public class MCD {
    
    public int a;
    public int b;
    
    public int MCD(int a,int b){
        this.a=a;
        this.b=b;
        if(a==b){
            return a;
        }
        else{
            if(a>b){
                return MCD(a-b,b);
            }
            else{
                return MCD(b,a);
            }
        }
    }
}
