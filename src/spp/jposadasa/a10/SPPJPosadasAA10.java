
package spp.jposadasa.a10;
import java.util.*;

public class SPPJPosadasAA10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x;
        x = solicitaTamaño();
        System.out.println("Matriz 1");
        int [][] matrizA = matriz(x);
        System.out.println("Matriz 2");
        int [][] matrizB = matriz(x);
        
        sumatriz(matrizA, matrizB);
        resmatriz(matrizA, matrizB);
        porABmatriz(matrizA, matrizB);
        porBAmatriz(matrizA, matrizB);
    }

    public static int solicitaTamaño (){
        Scanner kb = new Scanner(System.in);
        boolean flag;
        int tamaño = 0;
        do {
            try{
                System.out.println("Introduce el tamaño del arreglo");
                tamaño = kb.nextInt();
                flag = false;
            }catch (Exception e){
                System.out.println("El dato no es entero");
                kb.next();
                flag = true;
                
            }
        } while (flag);
    return tamaño;
                }
    
    public static int solicita(){
        Scanner kb = new Scanner(System.in);
        boolean flag;
        int entero = 0;
        do {
            try{
                System.out.println("Introduce un numero entero");
                entero = kb.nextInt();
                flag = false;
            }catch (Exception e){
                System.out.println("El dato no es entero");
                kb.next();
                flag = true;
            }
        } while (flag);
    return entero;
                }
    
    public static int [][] matriz (int x){
       int [][] matriz = new int [x][x];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = solicita();
        }}
        return matriz;
    }
    
    
    
    public static int [][] sumatriz (int [][] matrizA, int [][] matrizB){
        int [][] matrizC = new int [matrizA.length][matrizA.length];
        System.out.println("La suma es: ");
        for (int i = 0; i < matrizA.length; i++){
            for (int j = 0; j < matrizA[i].length; j++){
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.println(matrizC[i][j]);
        }System.out.println("");
        }
        return matrizC;
    }
    
    public static int [][] resmatriz (int [][] matrizA, int [][] matrizB){
        int [][] matrizC = new int [matrizA.length][matrizA.length];
        System.out.println("La resta es: ");
        for (int i = 0; i < matrizA.length; i++){
            for (int j = 0; j < matrizA[i].length; j++){
                matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
                System.out.println(matrizC[i][j]);
        }System.out.println("");
        }
        return matrizC;
    }
    
    public static int [][] porABmatriz (int [][] matrizA, int [][] matrizB){
        int [][] matrizC = new int [matrizA.length][matrizA.length];
        System.out.println("La multiplicacion de MatrizA x MatrizB es: ");
        for (int i = 0; i < matrizA.length; i++){
            for (int j = 0; j < matrizA[i].length; j++){
                matrizC[i][j] = matrizA[i][j] * matrizB[i][j];
                System.out.println(matrizC[i][j]);
        }System.out.println("");
        }
        return matrizC;
    }
   
    public static int [][] porBAmatriz (int [][] matrizA, int [][] matrizB){
        int [][] matrizC = new int [matrizA.length][matrizA.length];
        System.out.println("La multiplicacion de MatrizB x MatrizA es: ");
        for (int i = 0; i < matrizA.length; i++){
            for (int j = 0; j < matrizA[i].length; j++){
                matrizC[i][j] = matrizB[i][j] * matrizA[i][j];
                System.out.println(matrizC[i][j]);
        }System.out.println("");
        }
        return matrizC;
    }
}