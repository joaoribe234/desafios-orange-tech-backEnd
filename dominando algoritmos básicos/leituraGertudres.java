import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        
        int qtdDias = paginas / paginasLidas;
        
        System.out.println(qtdDias + " dias");

    }
}