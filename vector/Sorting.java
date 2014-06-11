import java.util.Scanner;

public class Sorting {

  /**
     En este método de ordenación, buscamos al elemento más pequeño, 
     y lo ponemos en su lugar, luego repetimos esta operación
     con todos los elementos desde V[1] hasta V[n], y luego, con todos 
     los elementos desde V[2] hasta V[n], y luego ... 
   **/

  public static int[] selection_sort(int[] V) {
    int buffer;

    for(int i=0; i<V.length; i++) {
      int pequeno = VectorToolbox.indice_del_menor_entre_un_rango(V, i, V.length-1);
      buffer = V[i];
      V[i] = V[pequeno];
      V[pequeno] = buffer;
    }

    return V;
  }

  /**
     Puedes imaginar este método de ordenación como una mano de cartas
     que siempre está ordenada... y vas insertando una a una cartas de
     una pila de cartas barajeada.

     btw, con este método se resolvía la 1ra pregunta del parcial.
   **/
  public static int[] insertion_sort(int[] V) {
    int buffer, i=V.length-1;

    while(i>=0) {
      for(int j=0; j<i; j++) {
	if(V[i]<V[j]) {
	  /*
	    si esta condición se cumple, es porque el j-ésimo elemento
	    está fuera de su lugar. Por eso "intercambiamos" el lugar del 
	    jésimo elemento con el del iésimo
	  */
	  buffer = V[i];
	  V[i] = V[j];
	  V[j] = buffer;
	  i++;
	  break;
	}	

      }
      i--;
    }

    return V;
  }

  /**
     El más lento de todos los métodos de ordenación. Solo el Bogo-sort 
     le gana XD
   **/
  public static int[] buble_sort(int[] V) {
    int losQueYaEstanOrdenados=0, buffer;
    
    for(int run=0; run <V.length; run++) {
      for(int i=1; i<V.length-losQueYaEstanOrdenados; i++) {
	if(V[i-1] > V[i]) {
	  buffer = V[i-1];
	  V[i-1] = V[i];
	  V[i] = buffer;
	}
      }
      losQueYaEstanOrdenados++;
    }

    return V;

  }
  
}
