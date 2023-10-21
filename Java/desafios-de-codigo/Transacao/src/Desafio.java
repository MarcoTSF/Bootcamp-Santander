import java.util.Scanner;

public class Desafio {
    
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String entrada = scanner.nextLine();
    String[] partes = entrada.split(",");

    // Lê os valores necessários para criar uma instância de Transacao
    String data = partes[0];
    String hora = partes[1];
    String descricao = partes[2];
    double valor = Double.parseDouble(partes[3]);

    // Cria uma instância de Transacao com os valores lidos
    Transacao transacao = new Transacao(data, hora, descricao, valor);

    // Imprime os dados da transação de forma amigável
    transacao.imprimir();
  }
}

class Transacao {
  private String data;
  private String hora;
  private String descricao;
  private double valor;

  public Transacao(String data, String hora, String descricao, double valor) {
    this.data = data;
    this.hora = hora;
    this.descricao = descricao;
    this.valor = valor;
  }
  
  public void imprimir() {
    System.out.println(this.descricao);
    System.out.println(this.data);
    System.out.println(this.hora);
    System.out.printf("%.2f", this.valor);
  }
}