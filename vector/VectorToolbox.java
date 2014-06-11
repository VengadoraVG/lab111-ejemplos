import java.util.Scanner;

public class VectorToolbox {
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
