/*

 *
 **
 ***
 ****
////////////////////////////////

****
***
**
*

 */

public class RecursionPattern {
  static void shape(int n){
     if(n  > 0) {
             shape(n-1);
             pattern_shape(n);
             System.out.println();
            }
        }
 static void pattern_shape(int n){
     if(n>0){
       System.out.print("*");
        pattern_shape(n-1);

            }
        }
///////////////////////////////////////////////////////////////////////////////////////////////
    static void shape2(int n){
        if(n<=0){
            return;
        }
       pattern_shape2(n);
        System.out.println();
        shape2(n-1);
    }
    static void pattern_shape2(int n){
        if (n<=0){
            return;
        }
        System.out.print("*");

        pattern_shape2(n-1);

    }
  public static void main(String[] args) {
            shape(5);
            System.out.println();
      shape2(5);

        }

}

