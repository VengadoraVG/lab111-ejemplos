import java.util.Scanner;

public class VectorToolbox {
  public static void rotar_hacia_la_izquierda(int[] V) {
    int first = recorrer_hacia_la_izquierda(V, V.length);
    V[V.length-1] = first;
  }

  public static void rotar_hacia_la_derecha(int[] V) {
    int last = recorrer_hacia_la_derecha(V, 0);
    V[0] = last;
  }

  public static int recorrer_hacia_la_derecha(int[] V, int posicion) {
    int buffer = V[V.length-1];
    
    for(int i=V.length-1; i>posicion; i--) {      
      System.out.println(i + " es ahora " + (i-1));
      V[i] = V[i-1];
    }
    
    return buffer;
  }

  public static int recorrer_hacia_la_izquierda(int[] V, int posicion) {
    int buffer = V[0];

    if(posicion > V.length-1)
      posicion = V.length-1;

    for(int i=0; i<posicion; i++) {
      V[i] = V[i+1];
    }

    return buffer;
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
