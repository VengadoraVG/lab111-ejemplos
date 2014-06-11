import java.util.Scanner;

public class VectorToolbox {
  public static void rotar_hacia_la_derecha(int[] V) {

  }

  public static void recorrer_hacia_la_derecha(int[] V, int posicion) {
    V=cambiar_tamano_vector(V, V.length);
    
    for(int i=V.length-1; i>posicion; i++) 
      V[i] = V[i-1];

  }

  public static int[] cambiar_tamano_vector(int[] V, int nuevoTamano) {
    int[] Grande = new int[nuevoTamano];    
    int lim = Math.min(nuevoTamano, V.length);

    for(int i=0; i<lim; i++) {
      Grande[i] = V[i];
    }

    return Grande;
  }
  
  public static int indice_del_menor_entre_un_rango(int[] V, int a, int b) {
    int pequeno = a; //asumimos que el valor más pequeño es el primero del Vector.
    
    for(int i=a; i<=b; i++) {
      if(V[i] < V[pequeno])
	pequeno = i; //y luego, vamos actualizándolo mientras exploramos el resto del vector.
    }
    
    return pequeno;
  }

  public static int[] leer_vector(int tamano, Scanner cin) {
    int[] V = new int[tamano];

    for(int i=0; i<tamano; i++) {
      V[i] = cin.nextInt();
    }
    
    return V;
  }

  public static String conv_en_texto(int[] V) {
    String texto = "";
    texto += "{";

    for(int i=0; i<V.length; i++) {
      texto += V[i] + ",";
    }

    return texto.substring(0, texto.length()-1) + "}";
  }

}
