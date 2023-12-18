
package Heranca_Morador;

public class MoradorInq extends Morador {
    
    int valorAluguel;
    
    public MoradorInq(String n,String s,String a,String t, int an, int va){
      super(n,s,a,t,an);
      valorAluguel = va;
    }
    
    public int getAluguel(){
        return valorAluguel; 
    }
    
}
