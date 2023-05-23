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

public class Pattern {
    static void traingle(int n){
        for(int i =1; i<=n; i++){
            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
//////////////////////////////////////////////////////////////
        for(int i =n; i>=1; i--){
            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        traingle(4);
    }
}
