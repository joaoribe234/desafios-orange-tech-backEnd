import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();
        int qtdDoces = doce * 2;

        System.out.println("O cliente obteve " + qtdDoces + " doces");
    }
}
