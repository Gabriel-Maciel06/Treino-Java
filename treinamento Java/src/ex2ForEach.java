import java.util.Scanner;

public class ex2ForEach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contadorpares = 0;
        System.out.println("vc quer cadastrar um num?");
        String cadastro = scan.nextLine();
        for (String loop = "sim"; loop.equals(cadastro);){
            System.out.println("digite numeros");
            int num = scan.nextInt();
            int [] vetor = {num};
            System.out.println("se quiser cadastrar mais numeros digite 1\n se não quiser digite outro numero");
            int mcadastro = scan.nextInt();
            if (mcadastro == 1){
                cadastro.equals("sim");}
            else { for (int numeros :vetor){
                if (numeros % 2 == 0){
                    contadorpares++;}
                }
            break;}
        }
        System.out.printf("os numeros pares são : %d", contadorpares);
    }
}












