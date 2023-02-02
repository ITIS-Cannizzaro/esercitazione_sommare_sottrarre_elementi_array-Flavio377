import java.util.Scanner;

public class sommare_sottrarre_elementi_array 
{

	public static void main(String[] args) 
	{
		Scanner in= new Scanner (System.in);
		int [] numeri= new int [6];
		int sommapari=0, sommadispari=0;
    	System.out.println("inserisci 6 numeri!.");
    	for (int i=0; i<numeri.length; i++) 
    	{
    		System.out.println("inserisci un numero: ");
    		numeri[i]= Integer.parseInt(in.nextLine());
    		if (i % 2 == 0) 
    		{
    			sommapari += numeri[i];
    		}
    	    if (i % 2 == 1) 
    	    {
    	    	sommadispari -= numeri[i];
    	    }
    	}
    	System.out.println("la sottrazione dei numeri dispari è: " + sommadispari);
    	System.out.println("la somma dei numeri pari è: " + sommapari);

	}

}
