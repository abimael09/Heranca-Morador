
package Heranca_Morador;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Heranca_Morador {

    public static void main(String[] args) {
        // Projeto de treino POO em desenvovimento e revisão...
        ArrayList<MoradorDono> vetMd = new ArrayList<MoradorDono>();
        ArrayList<MoradorInq> vetInq = new ArrayList<MoradorInq>();
        
        MoradorDono Md1 = new MoradorDono("Pedro", "Silva", "101","8888",2000,400);
        vetMd.add(Md1);
        MoradorDono Md2 = new MoradorDono("Lety", "Santos", "103","7777",2008,600);
        vetMd.add(Md2);
        MoradorDono Md3 = new MoradorDono("Ferenanda", "Ribeiro", "201","9999",2013,350);
        vetMd.add(Md3);
        
        MoradorInq Mi1 = new MoradorInq("Ana", "Santos", "202","3399",2010,1000);
        vetInq.add(Mi1);
        MoradorInq Mi2 = new MoradorInq("Carlos", "Ferreira", "205","9911",2001,900);
        vetInq.add(Mi2);
        MoradorInq Mi3 = new MoradorInq("Ana", "Santos", "202","9999",2016,1000);
        vetInq.add(Mi3);
        
        int qm = vetMd.size();
        int qi = vetInq.size();
        
        String opcao1 = JOptionPane.showInputDialog("Dono ou Inquilino? ou exit");
        
        while(opcao1.equalsIgnoreCase("exit")==false){
            for (int i = 0; i < qm; i++) {
                if(opcao1.equalsIgnoreCase("dono")){
                    System.out.println("Nome: " + vetMd.get(i).getNomeCompleto());
                    System.out.println("Valor condominio: " + vetMd.get(i).getCondominio());
                }

                opcao1 = JOptionPane.showInputDialog("Dono ou Inquilino? ou exit");
            }
        }
        
        while(opcao1.equalsIgnoreCase("exit")==false){
            for (int i = 0; i < qi; i++) {
                if(opcao1.equalsIgnoreCase("inquilino")){
                    System.out.println("Nome: " + vetInq.get(i).getNomeCompleto());
                    System.out.println("Valor Aluguel: " + vetInq.get(i).getAluguel()); 
                }else{
                    System.out.println("Opção Inválida");
                }
            }
        }
    }
    
}
