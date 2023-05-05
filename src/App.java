import java.util.Scanner;
 
public class App{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 
        System.out.println("Digite o tamanho da área a ser pintada em metros quadrados:");
        double tamanhoArea = teclado.nextDouble();
 
        double litrosDeTinta = tamanhoArea / 3;
        int latasDeTinta = (int) Math.ceil(litrosDeTinta / 18); 
        double precoTotal = latasDeTinta * 80;
 
        System.out.println("Serão necessárias " + latasDeTinta + " latas de tinta, ao preço total de R$ " + precoTotal);
 
    }
}
