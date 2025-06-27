import java.util.*;
public class Main{
    public static String rev(String str ){
        String st = "" ;
        for(int i = str.length() - 1;  i >=0 ; i--){
            st += str.charAt(i);
        }
        return st ; 
    }
    public static void main(String[] args){
      Scanner sc   = new Scanner(System.in) ; 
      String str =  sc.nextLine() ; 
      String ar[] =  str.split(" " ) ; 
        for(int i = 0 ; i < ar.length ; i++){
            ar[i]  = rev(ar[i]) ; 
        }
        String fans = "" ; 
        for(String s : ar ){
            fans += s +" " ; 
        }
        System.out.println(fans);
    }
}