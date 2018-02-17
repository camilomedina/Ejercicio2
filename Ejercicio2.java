public class Ejercicio2{
	
  public static void main(String[ ] arg){

   System.out.println("Segundo Ejercicio");

   int ladoCuadrado=10;
   int ladoCuadrado2=10;
   int ladoTriangulo1=12;
   int ladoTriangulo2=12;
   int baseTriangulo=15;
   int alturaTriangulo1=12;
   int radioCirculo=5;
   int diametro=radioCirculo*2;
   double pi=3.1416;


   System.out.println("Soluciones: ");
   System.out.println("El Area del cuadrado es:"+(ladoCuadrado*ladoCuadrado2));
   System.out.println("El perimetro del cuadrado es:"+((ladoCuadrado+ladoCuadrado2)*2));

   System.out.println("El diametro el circulo:"+(diametro));
   System.out.println("la circunferencia del circulo:"+(diametro*pi));
   System.out.println("El Area del circulo:"+(pi*(radioCirculo^2)));

   System.out.println("El Area del triangulo es:"+((baseTriangulo*alturaTriangulo1)/2));
   System.out.println("Perimetro del triangulo:"+(baseTriangulo+ladoTriangulo1+ladoTriangulo1));


  }



}