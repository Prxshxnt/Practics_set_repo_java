public class GuestCallFu {
    public static int GuestCall(int n ){

        if (n<=1) {
            return 1;
        }

        int singleCall = GuestCall(n-1);

        int pairCall = (n-1)* GuestCall(n-2);
        
        return singleCall + pairCall;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(GuestCall(n));
    }
}
