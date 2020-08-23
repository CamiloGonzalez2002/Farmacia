import java.util.Scanner;  //Importa la clase Scanner

class Aumento_Al_Sueldo {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
	
System.out.print("Ingresu su salario por favor : ")	;

double salario = sc.nextDouble();

double aumento1,aumento2;

aumento1 = 0.12; //Quizas deba de ponerlas como constantes
aumento2 = 0.15;

	if (salario>500000){

	aumento1 = salario*aumento1;

	System.out.println("El aumento correspondiente es : " + aumento1);
	
	System.out.println("Su salario final es : " + (aumento1+salario));


} 	else {

	aumento2 =salario*aumento2;

	System.out.println("El aumento correspondiente es : " + aumento2);
	
	System.out.println("Su salario final es : " + (aumento2+salario));


}
         
}

}

