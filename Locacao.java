
package mapalocacaoquadras;

import java.util.Scanner;

public class Locacao {
    private Locatario locatario = new Locatario();
    private Quadra quadra = new Quadra();
    private int tempoMinuto;
    private char necessitaEquipamento;

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public int getTempoMinuto() {
        return tempoMinuto;
    }

    public void setTempoMinuto(int tempoMinuto) {
        this.tempoMinuto = tempoMinuto;
    }

    public char getNecessitaEquipamento() {
        return necessitaEquipamento;
    }

    public void setNecessitaEquipamento(char necessitaEquipamento) {
        this.necessitaEquipamento = necessitaEquipamento;
    } 
    
    public double calcularLocacao(){
        String resp = "";
        double valorMinuto = this.quadra.getValorMinuto();
        double valorLocacao = valorMinuto * this.tempoMinuto;
                
        if(this.tempoMinuto > 120){
            valorLocacao = valorLocacao * 0.9;
        }
        resp = Character.toString(necessitaEquipamento);
        while(!resp.matches("[SN]")){
            if (resp.equalsIgnoreCase("S")){
            valorLocacao += 50;
                System.out.println("Foi adicionado valor extra de R$50 referente a equipamento solicitado.");
                break;
            }else if (resp.equalsIgnoreCase("N")){
                System.out.println("Não foi adicionado valor extra de equipamentos.");
                break;
            }else{ 
                System.out.println("Erro. Digite apenas S ou N");
                break;
            }
        }
        return valorLocacao;        
    }
    
    public void mostrarResumoLocacao(){
        System.out.println();
        System.out.println("############CONFIRA OS DADOS INFORMADOS###########");
        System.out.println();
        System.out.println("--------LOCATÁRIO--------");
        System.out.println("Nome: " + locatario.getNome());
        System.out.println("CPF: " + locatario.getCpf());
        System.out.println("Telefone: " + locatario.getTelefone());
        System.out.println("Ano de nascimento: " + locatario.getAnoNascimento());
        System.out.println("-------QUADRA-------");
        System.out.println("Nome da quadra: " + quadra.getNome());
        System.out.println("Tipo: " + quadra.getTipoDaQuadra());
        System.out.println("Valor do minuto: " + quadra.getValorMinuto());
        System.out.println("-------LOCAÇÃO--------");
        System.out.println("Tempo em minutos: " + this.getTempoMinuto());
        System.out.println("Necessita de equipamentos? " + this.getNecessitaEquipamento());
        System.out.println("Valor calculado: " + calcularLocacao());
    }
    
    public void cadastrarLocacao(){
        Scanner sc = new Scanner(System.in);
        locatario.cadastrarLocatario(); 
        locatario.verificarMaiorIdade();
        quadra.cadastrarQuadra();                
        System.out.print("Informe o tempo em minutos: ");
        this.setTempoMinuto(sc.nextInt());
        System.out.print("Necessita de equipamentos? (S - Sim, N - Não) ");
        this.necessitaEquipamento = sc.next().charAt(0);   
        this.mostrarResumoLocacao();
    }
}
        
    
    

