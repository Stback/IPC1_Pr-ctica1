import java.util.Random;
import java.util.Scanner;
import java.util.Vector;


public class Práctica1 {
	static Scanner leer = new Scanner(System.in);
	static void menu() {
	System.out.println("Selecciona el número de programa a utilizar: ");	
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("1. Dibujar Rombo");
	System.out.println("2. Promedio de 6 Notas");
	System.out.println("3. Traductor de hora");
	System.out.println("4. Área y Perímetro");
	System.out.println("5. Número de días entre dos fechas");
	System.out.println("6. Calculadora Simple");
	System.out.println("7. Tabla de Multiplicar");
	System.out.println("8. Conversor Entero a Cadena (0-100)");
	System.out.println("9. Conversor Número Arábigo a Romano");
	System.out.println("10. Pirámide Invertida de 'x' fila de números");
	System.out.println("11. Lista de Romanos");
	System.out.println("12. Cadena en Asteriscos");
	System.out.println("13. Adivinar la Letra");
	System.out.println("14. Dibujar Cuadrado");
	System.out.println("15. Mostrar Números Primos");
	seleccionar();
}
	static void seleccionar(){
	int seleccion = leer.nextInt();
		switch (seleccion){
		 	case (1): rombo(); break;
		 	case (2): promedio(); break;
		 	case (3): hora(); break;
		 	case (4): area(); break;
		 	case (5): dias(); break;
		 	case (6): calcu(); break;
		 	case (7): tabla(); break;
		 	case (8): letras(); break;
		 	case (9): romanos(); break;
		 	case (10): piramide(); break;
		 	case (11): romanos2(); break;
		 	case (12): asterisco(); break;
		 	case (13): adivinar(); break;
		 	case (14): cuadrado(); break;
		 	case (15): primos(); break;
		default:System.out.println("El programa no existe");menu();
		}
}
	static void primos() {
		String otra;
		do{
		for (int i=0;i<36;i++)
			   System.out.println(" ");
		System.out.println("Imprime los numeros primos entre 1 y el numero ingresado: ");
			for (int i=0;i<6;i++)
				System.out.println(" ");	
		System.out.println(" Ingresar número: (MAYOR QUE 1)");
		int n,divisores=0;
		n = leer.nextInt();
		System.out.println("Los numeros primos de 1 a " + n +" son:");
		for(int i=1; i<=n; i++){
			divisores = 0;
			for(int j=1; j<=i; j++){
				if (i%j==0)
				divisores++;
				if (divisores>2)break;
			}				 
			if(divisores==2)
			System.out.print(i+" ");
		}System.out.println();
		System.out.println("##############################################################################################################################");
		System.out.println("¿Realizar otra operacion?: SI/NO");		
		otra = leer.next();	
		}while(otra.equals("SI"));
		System.out.println("¿Volver al menu principal?: SI/NO");
		otra = leer.next();
		if (otra.equals("SI")){
			System.out.println("##############################################################################################################################");
			menu();}
	}
	static void cuadrado() {
		for (int i=0;i<36;i++)
		    System.out.println(" ");
		System.out.println("Programa que imprime un cuadrado de 'n' asteriscos por lado");
		for (int i=0;i<6;i++)
		    System.out.println(" ");
		System.out.println("Ingresar número deseado: ");		
		int n = leer.nextInt();
		for (int l=1;l<=n;l++){
			if (l<2 || l==n){
				for (int a=1;a<=n;a++)
					System.out.print("* ");
			}
			else{ 
				for (int a=1;a<=n;a++){
					if (a<2 || a==n)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				}
		System.out.println();
		}
		    
}
	static void adivinar() {
	
	
}
	static void piramide() {
	
	
}
	static void letras() {
		for (int i=0;i<36;i++)
		    System.out.println(" ");
		System.out.println("Se debe ingresar el limite inferior, luego el superior; para generar un numero aleatorio entre el rango dado y mostrarlo en letras: ");
		for (int i=0;i<6;i++)
		    System.out.println(" ");
		Random num = new Random();
		String otra,ca,b="";
		int li,ls,a;
		do{
			do{
				System.out.println("Ingresa el Limite Inferior: ");
				li = leer.nextInt();
				}while(li<0 || li>98);
			do{
				System.out.println("Ingresa el Limite Superior: ");
				ls = leer.nextInt();
				}while(ls<=li+1 || ls>101);
			a = (int)(num.nextDouble()*(ls-li)+li);
			ca = Integer.toString(a);
			String U[]= new String[10];
			String D[]= new String[10];
			U[0]="";
			U[1]="Uno";
			U[2]="Dos";
			U[3]="Tres";
			U[4]="Cuatro";
			U[5]="Cinco";
			U[6]="Seis";
			U[7]="Siete";
			U[8]="Ocho";
			U[9]="Nueve";
			D[0]="";
			D[1]="Diez";
			D[2]="Veinti";
			D[3]="Treinta";
			D[4]="Cuarenta";
			D[5]="Cincuenta";
			D[6]="Sesenta";
			D[7]="Setenta";
			D[8]="Ochenta";
			D[9]="Noventa";
			if (ca.length()<2){
				if (Integer.parseInt(ca)==0){
					System.out.println("Numero Generado: "+ a + " ---> "+ "Cero");
				}else{
					System.out.println("Numero Generado: "+ a + " ---> "+ U[Integer.parseInt(b+ca.charAt(0))]);
				}
					
			}else{
				if (a>9 && a < 21 ){
				switch(a){
				case(10):System.out.println("Numero Generado: "+ a + " ---> "+D[1]);break;
				case(11):System.out.println("Numero Generado: "+ a + " ---> Once");break;
				case(12):System.out.println("Numero Generado: "+ a + " ---> Doce");break;
				case(13):System.out.println("Numero Generado: "+ a + " ---> Trece");break;
				case(14):System.out.println("Numero Generado: "+ a + " ---> Catorce");break;
				case(15):System.out.println("Numero Generado: "+ a + " ---> Quince");break;
				case(16):System.out.println("Numero Generado: "+ a + " ---> Dieciseis");break;
				case(17):System.out.println("Numero Generado: "+ a + " ---> Diecisiete");break;
				case(18):System.out.println("Numero Generado: "+ a + " ---> Dieciocho");break;
				case(19):System.out.println("Numero Generado: "+ a + " ---> Diecinueve");break;
				case(20):System.out.println("Numero Generado: "+ a + " ---> Veinte");break;
				}
			}else{
				if (a>20&&a<30){
				System.out.println("Numero Generado: "+ a + " ---> "+ D[Integer.parseInt(b+ca.charAt(0))]+U[Integer.parseInt(b+ca.charAt(1))]);
				}else{
				System.out.println("Numero Generado: "+ a + " ---> "+ D[Integer.parseInt(b+ca.charAt(0))]+" y "+U[Integer.parseInt(b+ca.charAt(1))]);	
				}
			}
			}
		System.out.println("¿Realizar otra operacion?: SI/NO");		
		otra = leer.next();	
		System.out.println("##############################################################################################################################");	
		}while(otra.equals("SI"));
		System.out.println("¿Volver al menu principal?: SI/NO");
		otra = leer.next();
		if (otra.equals("SI"))
			menu();
	}
	static void tabla() {
		for (int i=0;i<36;i++)
		    System.out.println(" ");
			System.out.println("Programa que Recibe un numero entre 0 y 100 y muestra su tabla de multiplicar: ");
			for (int i=0;i<6;i++)
		    	System.out.println(" ");
			
			
			int n;
			do{
			System.out.println("Por Favor Ingresar numero de tabla solicitada (0-100)");
			n=leer.nextInt();
			}while(n>100 || n<0);

			System.out.println("Tabla del: "+n);
			System.out.println(" ");
			for (int i=10;i>0;i--){
				System.out.println(n+" * "+i+" = "+n*i);
			}
			for (int i=0;i<6;i++)
		    	System.out.println(" ");
	}
	static void calcu() {
	int n1,n2,res = 0;
	String op=" ";
	for (int i=0;i<36;i++)
	    System.out.println(" ");
		System.out.println("Programa que Recibe dos numeros y un caracter simulando una calculadora: (s:suma; r:resta; m:producto; d:division)");
		for (int i=0;i<6;i++)
	    	System.out.println(" ");
		
		System.out.println("Ingresa tu primer numero");
		n1 = leer.nextInt();
		System.out.println("Ingresa tu segundo numero");
		n2 = leer.nextInt();
		System.out.println("Por Favor Ingresa tu Operador (Ej. s,r,m,d)");
		op = leer.next();
		switch(op){
		case("s"):res=n1+n2;break;
		case("r"):res=n1-n2;break;
		case("m"):res=n1*n2;break;
		case("d"):res=n1/n2;break;
		default:System.out.println("Operador no reconocido ");}
		System.out.println("El resultado de tu operacion es: "+res);
	}
	static void asterisco() {

}
	static void romanos2() {
		String n;
		Vector<String> v = new Vector<String>();
		do{
			for (int i=0;i<36;i++)
				   System.out.println(" ");
			System.out.println("Imprime en letras el numero mayor y menor de una lista ingresada en romanos:  ");
				for (int i=0;i<6;i++)
					System.out.println(" ");	
			do{
				System.out.println("Ingresa numeros romanos: (Terminar con FIN)");		
				n = leer.next();	
				v.add(n);
			}while(!n.equals("FIN"));
				
				
			System.out.println("##############################################################################################################################");
			System.out.println("¿Realizar otra operacion?: SI/NO");		
			n = leer.next();	
			}while(n.equals("SI"));
			System.out.println("¿Volver al menu principal?: SI/NO");
			n = leer.next();
			if (n.equals("SI")){
				System.out.println("##############################################################################################################################");
				menu();}
		}
	static void romanos() {
		for (int i=0;i<36;i++)
		    System.out.println(" ");
			
		System.out.println("Programa que convierte un numero arabigo a romano: ");
			for (int i=0;i<6;i++)
		    	System.out.println(" ");
			
		System.out.println("Ingresar 1 numero arabigo (0-3999): ");
			for (int i=0;i<6;i++)
		    	System.out.println(" ");
		String n = leer.next();
		String U[]=new String[10];
		U[0]= "";
		U[1]= "I";
		U[2]= "II";
		U[3]= "III";
		U[4]= "IV";
		U[5]= "V";
		U[6]= "VI";
		U[7]= "VII";
		U[8]= "VIII";
		U[9]= "IX";
		String D[]=new String[10];
		D[0]= "";
		D[1]= "X";
		D[2]= "XX";
		D[3]= "XX";
		D[4]= "XL";
		D[5]= "L";
		D[6]= "LX";
		D[7]= "LXX";
		D[8]= "LXXX";
		D[9]= "XC";
		String C[]=new String[10];
		C[0]= "";
		C[1]= "C";
		C[2]= "CC";
		C[3]= "CCC";
		C[4]= "CD";
		C[5]= "D";
		C[6]= "DC";
		C[7]= "DCC";
		C[8]= "DCCC";
		C[9]= "CM";
		String M[]=new String[4];
		M[0]= "";
		M[1]= "M";
		M[2]= "MM";
		M[3]= "MMM";
		String sa = null;
		int u = 0,d,c,m;
		if (n.length()==4){
			u = (n.charAt(n.length()-1))-48;
			d = (n.charAt(n.length()-2))-48;
			c = (n.charAt(n.length()-3))-48;
			m = (n.charAt(n.length()-4))-48;
			sa = M[m]+C[c]+D[d]+U[u];
		}
		if (n.length()==3){
			u = (n.charAt(n.length()-1))-48;
			d = (n.charAt(n.length()-2))-48;
			c = (n.charAt(n.length()-3))-48;
			sa = C[c]+D[d]+U[u];}
		
		if (n.length()==2){
			u = (n.charAt(n.length()-1))-48;
			d = (n.charAt(n.length()-2))-48;
			sa = D[d]+U[u];}
		if (n.length()==1){
			u = (n.charAt(n.length()-1))-48;
			sa = U[u];}
		System.out.println(n +" ---> "+ sa);
}
	static void dias() {
		for (int i=0;i<36;i++)
		    System.out.println(" ");
			
		System.out.println("Programa que calcula el número de días entre dos fechas: ");
			for (int i=0;i<6;i++)
		    	System.out.println(" ");
			
		int d1,m1,a1,d2,m2,a2,m = 0,d = 0,a= 0;
			System.out.println("Primera fecha: (ej. 01 03 2016)");
			System.out.print("Dia: (ej. 01)  ");
			d1=leer.nextInt();
			System.out.print("Mes: (ej. 03)  ");
			m1=leer.nextInt();
			System.out.print("Anho: (ej. 2016)  ");
			a1=leer.nextInt();
			System.out.println("Segunda fecha: (ej. 15 01 1990)");
			System.out.print("Dia: (ej. 15)  ");
			d2=leer.nextInt();
			System.out.print("Mes: (ej. 01)  ");
			m2=leer.nextInt();
			System.out.print("Anho: (ej. 1990)  ");
			a2=leer.nextInt();
			d= d1-d2;
			m=m1-m2;
			a=a1-a2;
	
			System.out.println("El numero de dias entre las fechas es: "+(Math.abs(d)+Math.abs(m)*30+Math.abs(a)*360));
						
			//int entero = Integer.parseInt(cadena);
			
			
}
	static void area() {
		for (int i=0;i<36;i++)
		    System.out.println(" ");
		String otra = null;
		System.out.println("Calcula el area y perimetro de la figura seleccionada:  ");
		do{
		System.out.println("Ingresa la figura deseada:  ");
		System.out.println();
		System.out.println("C: Circunferencia  ");
		System.out.println("U: Cuadrado ");
		System.out.println("T: Triangulo Equilatero");
		String f = leer.next();
		for (int i=0;i<6;i++)
		    System.out.println(" ");
		switch(f){
		case("C"):{
			System.out.println("Ingresa el radio:  ");
			float r = leer.nextFloat();
			System.out.println("Area: "+ (Math.PI*r*r));
			System.out.println("Perimetro: "+(2*Math.PI*r));
			};break;
		case("U"):{
			System.out.println("Ingresar lado:  ");
			float l = leer.nextFloat();
			System.out.println("Area: "+ (l*l));
			System.out.println("Perimetro: "+(4*l));
			};break;
		case("T"):{
			System.out.println("Ingresar lado:  ");
			float l = leer.nextFloat();
			System.out.println("Area: "+ ((((Math.sqrt(3))/2)*l)/2));
			System.out.println("Altura: "+(((Math.sqrt(3))/2)*l));
			System.out.println("Perimetro: "+(3*l));
			};break;
		}System.out.println("¿Realizar otro cálculo?: SI/NO");
		otra = leer.next();
		}while(otra.equals("SI"));
		}
	static void hora() {
		String h24,m,h;
		for (int i=0;i<36;i++)
		    System.out.println(" ");
			
		System.out.println("Programa que lee la hora en notacion de 24 hrs y la devuelve en notacion 12 hrs. ");
			for (int i=0;i<6;i++)
		    	System.out.println(" ");
		do{
			System.out.println("Ingresa la hora en Notacion 24 hrs. (Ej. 17:00)");
			h24 = leer.next();m="";h="";
			h = h+((h24.charAt(0)))+((h24.charAt(1)));
			m = m+((h24.charAt(3)))+((h24.charAt(4)));
		}while(h24.length()!=5 || h24.charAt(2)!=':'||Integer.parseInt(m)>59 ||Integer.parseInt(h)>23);
		if (Integer.parseInt(h)!=0 && Integer.parseInt(h)<12)
			System.out.println(h+":"+m+" AM");
		else if (Integer.parseInt(h)!=0 && Integer.parseInt(h)>12)
			System.out.println((Integer.parseInt(h)-12)+":"+m+" PM");
		else if (Integer.parseInt(h)==12)
			System.out.println((Integer.parseInt(h))+":"+m+" PM");
		else if (Integer.parseInt(h)==0)
			System.out.println("12"+":"+m+" AM");
	}	
	static void promedio() {
		float p=0,n;
		for (int i=0;i<36;i++)
		    System.out.println(" ");
			System.out.println("Programa que Recibe 6 Notas y muestra el Promedio y Puntuacion: ");
			for (int i=0;i<16;i++)
		    	System.out.println(" ");
		    
		for(int i=1;i<7;i++){
			System.out.println("Ingresar Nota: ");
			n=leer.nextFloat();
			p+=n;
		}
		for (int i=0;i<15;i++)
	    	System.out.println(" ");
		if (p/6>0 && p/6<60)
			System.out.println("Media: "+ (p/6) + "  Puntuacion: " + " E");
		if (p/6>59 && p/6<70)
			System.out.println("Media: "+ (p/6) + "  Puntuacion: " + " D");
		if (p/6>69 && p/6<80)
			System.out.println("Media: "+ (p/6) + "  Puntuacion: " + " C");
		if (p/6>79 && p/6<90)
			System.out.println("Media: "+ (p/6) + "  Puntuacion: " + " B");
		if (p/6>89)
			System.out.println("Media: "+ (p/6) + "  Puntuacion: " + " A");
		for (int i=0;i<17;i++)
	    	System.out.println(" ");
	
}
	static void rombo() {
	    for (int i=0;i<36;i++)
	    System.out.println(" ");
		System.out.println("Programa que muestra un rombo de asteriscos: ");
		for (int i=0;i<16;i++)
	    	System.out.println(" ");
	    
		for (int i=1;i<6;i++){
	    	for(int j=25-i;j>0;j--){
	    		System.out.print(" ");
	    	}
	    	for (int k=1;k<=2*i-1;k++){
	    		System.out.print("*");
	    	}
	    	System.out.println(" ");
	    }
		for (int i=1;i<5;i++){
			for (int j=1;j<=i+20;j++)
				System.out.print(" ");
			for (int k=1;k<=9-2*i;k++)
				System.out.print("*");
			System.out.println(" ");
		}
		for (int i=0;i<17;i++)
	    	System.out.println(" ");
}
	public static void main(String[] args) {
		menu();
	}
}  