import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        final double PRECO_LATA = 80.0;
        final int METROS_POR_LATA = 54;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o tamanho da área a ser pintada? (Em m²) ");
        double area = teclado.nextDouble();
        
        int latasNecessarias = (int) Math.ceil(area / METROS_POR_LATA);
        double precoTotal = latasNecessarias * PRECO_LATA;
        
        System.out.println("Quantidade de latas de tinta que devem ser compradas: " + latasNecessarias);
        System.out.println("O preço total é: R$" + precoTotal);
        
        teclado.close();
    }
}
