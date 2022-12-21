import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        
        if(tamanhoDaFila % 2 == 0){
          tamanhoDaFila = tamanhoDaFila / 2;
          
        }
        else{
          tamanhoDaFila = tamanhoDaFila / 2 + 1;
        }
        
        
        System.out.println(tamanhoDaFila + " pessoas no camarote");

    }
}