import java.util.Scanner;

class Pico_Cedula {
	
public static void main (String[] args){

Scanner sc = new Scanner (System.in);

System.out.println("Programa valido para pico y cedula Cali, AGOSTO");
	
System.out.println("Ingrese el ultimo digito de su cedula: ");
	
int cc = sc.nextInt();	
	
System.out.println("Ingrese el número del dia actual");	

int dia = sc.nextInt();

boolean dia2 = true;
	
if (dia%2==0) {

System.out.println("El dia es par");

} else{
	dia2 = false;
		
System.out.println("El dia es impar");
}
	
if (cc%2==0 && dia2==true) {

System.out.println("Usted puede SI salir hoy.");
	
} else if (cc%2==0 && dia2==false){

System.out.println("Usted NO puede salir hoy.");
	
} else if (cc%2!=0 && dia2==false){
	
System.out.println("Usted SI puede salir hoy.")
	;
} else {

System.out.println("Usted NO puede salir hoy.");	
}	
	
}
	
}