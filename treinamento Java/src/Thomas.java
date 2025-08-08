import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Thomas {
    public static void main(String[] args) {
       ArrayList<Integer> numeros = new ArrayList<Integer>(Arrays.asList(45,88,13,250,2,99));
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(String.format("%d ", numeros.get(i)));
        }
        Collections.sort(numeros);
        System.out.println();
        for (Integer i:numeros){
            System.out.println(String.format("%d ", i));
        }
    }}