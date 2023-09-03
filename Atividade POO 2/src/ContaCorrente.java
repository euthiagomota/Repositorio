import java.util.Scanner;

public class ContaCorrente {
	
		static Scanner leia = new Scanner(System.in);
	
		public static void main(String [] args) {
			
			menu();
		}
		
	
		protected static void menu() {
	
			System.out.println("O que você deseja fazer?\n 1- Depositar\n 2- Sacar\n 3- Obter saldo" );
	  		int opt = leia.nextInt();
	  		
	  		 	switch(opt) {
	  			
			  		case 1:
			  			depositar();
			  			break;
			  		case 2:
			  			sacar();
			  			break;
			  	    case 3:
			  	    	saldo();
			  	    	break;
	  		 }
	  
	  
	  
}
		
		
static double saldo;
	
	  		
		protected static void depositar() {
	  			
	  		System.out.println("Quanto você quer depositar? ");
	  		double dep = leia.nextDouble();
	  				
	  			saldo = saldo + dep;
	  					
	  	menu();	
}

	  		
	  	protected static void sacar() {
	  			
	  			System.out.println("Quanto você quer sacar? ");
	  			double sac = leia.nextDouble();
	  			
	  			if (saldo < sac) {
	  				System.out.println("Você não tem saldo suficiente, seu saldo atual é de: " + saldo);
	  			}
	  				else {
	  					sac = (sac + (sac * 0.005));
	  					saldo = saldo - sac;
	  				}
	  			
	   menu();
	   
	}
	  		
	  protected static void saldo() {
	  			
	  			System.out.println("Você tem :R$" + saldo);
	  			double total = leia.nextDouble();
	  menu();
	  
   }
	  		

}
