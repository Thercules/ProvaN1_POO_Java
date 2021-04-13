package testando;

import java.util.Scanner; 

public class testando5 {
	 public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Entre com um numero: ");
	        double input = in.nextDouble();

	        if (input > 0)
	        {
	            if (input < 1)
	            {
	                System.out.println("Numero pequeno positivo");
	            }
	            else if (input > 1000000)
	            {
	                System.out.println("Numero grande positivo");
	            }
	            else
	            {
	                System.out.println("Numero positivo");
	            }
	        }
	        else if (input < 0)
	        {
	            if (Math.abs(input) < 1)
	            {
	                System.out.println("Número pequeno negativo");
	            }
	            else if (Math.abs(input) > 1000000)
	            {
	                System.out.println("Número grande negativo");
	            }
	            else
	            {
	                System.out.println("Numero negativo");
	            }
	        }
	        else
	        {
	            System.out.println("Zero");
	        }
	    }
	}

