import java.util.Scanner;

public class BubbleSort {

  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in); //Console INput
    int n = cin.nextInt();
    int[] V = VectorToolbox.leer_vector(n, cin);
    Sorting.buble_sort(V);
    System.out.println(VectorToolbox.conv_en_texto(V));
  }

}
