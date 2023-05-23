

public class Recursive_average {
  static   int averge(int n1, int n2){
      if(n1 == 0 || n2 ==0){
          return 0;
      }
        int sum = n1+n2;
        return sum/2;
    }
    public static void main(String args[]){
     System.out.println(averge(4, 4));
    }
}
