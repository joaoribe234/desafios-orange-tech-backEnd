import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        
        int qtdDinheiro = entrada * mesada;
        
        System.out.println(qtdDinheiro);

    }
}