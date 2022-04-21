/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTABANCO.POO;

/**
 *
 * @author LRodrigues
 */
public class aula05 {
    
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
       
        p1.abrirConta("CC");
        p1.depositar(600);
        
        ContaBanco p2 =new ContaBanco();
        p2.setNumConta(2008);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(200);
                
                 p1.estadoAtual();
                  p2.estadoAtual();
    }
    
}
