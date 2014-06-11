import java.util.Scanner;

public class main {

  public static void f(int[] V) {
    V[0] = -1;    
  } 

  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    int n = cin.nextInt();
    int[] V = VectorToolbox.leer_vector(n, cin);
    System.out.println(VectorToolbox.conv_en_texto(V));
    f(V);
    System.out.println(VectorToolbox.conv_en_texto(V));
  }

}
