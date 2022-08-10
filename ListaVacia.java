/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		        int a = 0;
        int[] listav = new int[5];
        Scanner teclado = new Scanner(System.in);
        for(a=0; a<listav.length; a++){
            System.out.println(“Ingrese un valor : ");
            listav[a] = teclado.nextInt();}
        for(a=0; a<listav.length; a++){
            System.out.println("Lista: "+listav[a]);
        } 
    } 
}
	

