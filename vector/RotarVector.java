import java.util.Scanner;

public class RotarVector {

  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    System.out.println("tamaño del vector?");
    int n = cin.nextInt();
    System.out.println("elementos del vector?");
    int[] V = VectorToolbox.leer_vector(n, cin);
    System.out.println("izquierda o derecha?");
    String orientacion = cin.next();
    System.out.println("cuántas veces lo roto?");
    int veces = cin.nextInt();

    if(orientacion.compareTo("izquierda") == 0) {
      for(int i=0; i<veces; i++) 
	VectorToolbox.rotar_hacia_la_izquierda(V);
    } else {
      for(int i=0; i<veces; i++)
	VectorToolbox.rotar_hacia_la_derecha(V);
    }

    System.out.println(VectorToolbox.conv_en_texto(V));

  }

}
