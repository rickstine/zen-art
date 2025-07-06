public class SumofArrays {
  public static void main(String [] args){
    int [] num = {1,2,3,4,5,6,7,8,9,0};
    int sum = 0;
    for ( int n : num) sum += n;

    System.out.println(" the sum of the array is :" + sum);
  }
}
