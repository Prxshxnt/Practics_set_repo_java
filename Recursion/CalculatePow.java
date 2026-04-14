package Recursion;

public class CalculatePow {
    public static int CalculatePower(int x, int n){
        if (x==0) {
            return 0;
        }
        if (n==0) {
            return 1;
        }

        int powernm_1 = CalculatePower(x, n-1);
        int  power_n = x * powernm_1;
        return power_n;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 0;
        int ans =CalculatePower(x, n);
        System.out.println(ans);
    }
}
