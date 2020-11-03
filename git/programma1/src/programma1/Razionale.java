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
public class Razionale {
    private int num;
    private int den;
    
    public Razionale(){
        num=0;
        den=1;
    }
    public Razionale(int num){
        this.num=num;
        den=1;
    }
    public Razionale(int num,int den)throws ArithmeticException{
            if(den==0){
                throw new ArithmeticException("denominatore non valido");
            }
            this.num=num;
            this.den=den;
    }
    public int getnum(){
        return num;
    }
    public int getden(){
        return den;
    }
    public void setden(int den,int num)throws ArithmeticException{
        if(den==0){
            throw new ArithmeticException("denominatore non valido");
        }
        this.den=den;
        this.num=num;
    }
    public void riduci(){
        MCD frazione = new MCD();
        int divisore= frazione.MCD(num,den);
        int nuovonum=num/divisore;
        int nuovoden=den/divisore;
        num=nuovonum;
        den=nuovoden;
    }
    public Razionale somma(Razionale x){
        mcm frazione=new mcm();
        int multiplo=frazione.mcm(den,x.getden());
        int nuovoden=multiplo;
        int nuovonum=multiplo/den*num+multiplo/x.getden()*x.getnum();
        Razionale risSomma=new Razionale(nuovonum,nuovoden);
        return risSomma;
    }
    public Razionale differenza(Razionale x){
        mcm frazione=new mcm();
        int multiplo=frazione.mcm(den,x.getden());
        int nuovoden=multiplo;
        int nuovonum=multiplo/den*num-multiplo/x.getden()*x.getnum();
        Razionale risDiff=new Razionale(nuovonum,nuovoden);
        return risDiff;
    }
    public Razionale prodotto(Razionale x){
        mcm frazione=new mcm();
        int nuovonum=frazione.mcm(num,x.getnum())*num;
        int nuovoden=frazione.mcm(den,x.getden())*den;
        Razionale risProd=new Razionale(nuovonum,nuovoden);
        return risProd;
    }
    public Razionale  quoziente(Razionale x){
         mcm frazione=new mcm();
        int nuovonum=frazione.mcm(num,x.getnum())/num;
        int nuovoden=frazione.mcm(den,x.getden())/den;
        Razionale risQuoz=new Razionale(nuovonum,nuovoden);
        return risQuoz;
    }
    public Razionale  reciproco(Razionale x){
        mcm frazione=new mcm();
        int nuovonum=frazione.mcm(den,x.getden());
        int nuovoden=frazione.mcm(num,x.getnum());
        Razionale Reciproco=new Razionale(nuovonum,nuovoden);
        return Reciproco;
    }
    public boolean isZero(){
        boolean zero=false;
        if(num==0){
            zero=true;
        }
        return zero;
    }
    public boolean  isPositive(){
        boolean positive=false;
        if(num>0){
            positive=true;
        }
        return positive;
    }
    public int  confronto(Razionale x){
        riduci();
        x.riduci();
        if (num==x.getnum()){
            return 0;
        }
        if (num>x.getnum()){
            return 1;
        }
            return -1;
    }
    public String toString(){
        return num+"/"+den;
    }
}
