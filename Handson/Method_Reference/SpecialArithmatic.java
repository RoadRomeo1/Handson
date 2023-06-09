package Handson.Method_Reference;

public class SpecialArithmatic extends Arithmatic{
    public int sqaure(int a, int b){
        int res = 1;
        for(int n = 0; n < b ; n++){
            res = res*a;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(new SpecialArithmatic().sqaure(2, 5));
    }    
}


