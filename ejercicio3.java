import java.util.*;

public class ejercicio3{
	
	public static void main(String[] args){
		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero natural: ");
		num = scanner.nextInt();
		
		while(num < 0){
			System.out.println("Error: numero mal ingresado, ingrese un numero natural mayor a 0");
			num = scanner.nextInt();
		}
		
		int factorial = 1;
		String procedimiento = "";
		
		if ((num == 0)||(num == 1)){
			System.out.println(num+"! = "+1);
		}else{
			for(int i = 1; i<=num;i++){
				factorial = factorial*i;
				if (i<num){
					procedimiento=procedimiento+String.valueOf(i)+'x';
				}else{
					procedimiento = procedimiento+String.valueOf(i);
				}
			}
			System.out.println(num+"! = "+procedimiento+" = "+factorial);
		}
	}
}