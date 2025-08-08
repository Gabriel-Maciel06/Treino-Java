import java.util.Scanner;

public class testeforeach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vetor = new int[4];
        vetor[0] = 78;
        vetor[1] = 100;
        vetor[2] = 30;
        vetor[3]= 50;
        int somatotal = 0;
        for (int soma: vetor){
            somatotal += soma;
        }
        System.out.println("soma é = "+ somatotal);
        }

    }

