
package mapalocacaoquadras;

import java.util.Scanner;

public class Quadra {
    private String nome;
    private String tipoDaQuadra;
    private int valorMinuto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDaQuadra() {
        return tipoDaQuadra;
    }

    public void setTipoDaQuadra(String tipoDaQuadra) {
        this.tipoDaQuadra = tipoDaQuadra;
    }

    public int getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(int valorMinuto) {
        this.valorMinuto = valorMinuto;
    }
    
    public void cadastrarQuadra(){
               
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-----CADASTRO DA QUADRA-----");
        System.out.print("Digite o nome da quadra: ");
        this.setNome(sc.nextLine());
        System.out.print("Digite o tipo da quadra: ");
        this.setTipoDaQuadra(sc.nextLine());
        System.out.print("Informe o valor do minuto: ");
        this.setValorMinuto(sc.nextInt());
        sc.nextLine();
        
        
    }
       
}
