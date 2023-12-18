
package Heranca_Morador;

public class MoradorDono extends Morador {
    
    int valorCondominio;
    
    public MoradorDono(String n,String s,String a,String t, int an, int vc){
      super(n,s,a,t,an);
      valorCondominio = vc;
    }
    
    public int getCondominio(){
        return valorCondominio; 
    }
    
}
