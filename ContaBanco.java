/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTABANCO.POO;

/**
 *
 * @author LRodrigues
 */
public class ContaBanco{
    
    //numConta, tipo, dono, dono, status, abrirConta(), fecharConta(), depositar(), sacar(), pagarMensal()
    //cc - cp
    
    public double numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

     public ContaBanco() {
        this.saldo = 0;
        this.status = false;
     }
    public void estadoAtual(){
        System.out.println("Conta:" + this.getNumConta());
        System.out.println("Tipo:" + this.tipo);
        System.out.println("Dono:" + this.getDono());
        System.out.println("Saldo:"+ this.getSaldo());     
    }

  
    
    
       
    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(double numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo){
    setTipo(tipo);
    this.setStatus(true);
    if (tipo == "CC"){
        this.setSaldo(50);
    }
    else 
        if(tipo == "CP"){
            this.setSaldo(150); 
        }
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("A conta possui dinheiro");
        }
        else
            if(this.getSaldo()<0){
                System.out.println("Error, conta em débito");    
                    }
            else
                this.setStatus(false);
                System.out.println("Conta fechada!");
    }
     
        public void depositar(double valor){
        if (this.getStatus() == true){
           setSaldo(getSaldo()+valor);
            //recebe o dinheiro na conta mais o valor a ser depositado
        }
        else
                System.out.println("Conta fechada");

    }
    public void sacar(double valor){
        if(status == true){
             if(saldo> valor){
                setSaldo(getSaldo()-valor);
             }else
                System.out.println("Saldo Insuficiente");
                }
            else
             System.out.println("Impossivel sacar");
        }
    
    
    public void pagarMensal( double valor){
      
        if(tipo == "CC")
            valor =12;
        else 
            if(tipo == "CP")
                valor = 20;
        
        if (status ==true){
            if(saldo>valor)
                saldo = saldo-valor;
           
                System.out.println("Pago!");
            
        }else{
                System.out.println("Impossível pagar");
        }
        
}
}