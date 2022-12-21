import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];
        listaIngredientes = ingredientes.split(";");
        System.out.println(listaIngredientes[0]);
        System.out.println(listaIngredientes[1]);
        System.out.println(listaIngredientes[2]);
        System.out.println(listaIngredientes[3]);
        
        

    }
}