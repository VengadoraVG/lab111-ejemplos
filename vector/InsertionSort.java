import java.util.Scanner;

public class InsertionSort {

  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in); //Console INput
    int n = cin.nextInt();
    int[] V = VectorToolbox.leer_vector(n, cin);
    V = Sorting.insertion_sort(V);
    System.out.println(VectorToolbox.conv_en_texto(V));
  }

}

