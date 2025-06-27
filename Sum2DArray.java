import java.util.*;
public class sub {

    public static int sum(int[][] ar ){
        int sum = 0 ; 
        for(int[] a : ar ){
            for(int x : a ){
                sum += x ; 
            }
        }
        return sum ; 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ; 
        int n  = sc.nextInt() ; 
        int[][] ar=  new int[n][n] ; 
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                ar[i][j] =  sc.nextInt() ; 

            }
        }
        int ans = sum(ar) ; 
        System.out.println(ans);
    }
}
