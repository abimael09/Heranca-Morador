
package Heranca_Morador;

import javax.swing.*;

public class Morador {
    
    String nome;
    String sobrenome;
    String apar;
    String tel;
    int anoC;
    
    public Morador(String n,String s,String a,String t, int an){
        nome = n;
        sobrenome = s;
        apar = a;
        tel = t;
        anoC = an;
    }
    
    public String  getNomeCompleto(){
        
        return nome +  " " + sobrenome;
    }
    
    public void informeTelefone(){
        System.out.println("Telefone: " + tel);
    }
    
    public void calculePermanencia(){
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe ano atual"));
        System.out.println("Permanencia: " + (anoAtual - anoC));
    }
    
}
