package Recursion;

public class CalPowBest {
    public static int CalPow(int x , int n){
        if (n==0) {
            return 1;
        }
        if (x==0) {
            return 0;
        }
        int half = CalPow(x, n/2);

        if (n %2 ==0) {
            return half * half;
        }else{
            return x * half *half;
        }
    }
    public static void main(String[] args) {
        int x =2 , n = 4;
        System.out.println(CalPow(x, n));
    }
}
