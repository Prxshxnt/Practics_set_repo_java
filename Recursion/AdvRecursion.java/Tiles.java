public class Tiles {
    public static int SetTiles(int n , int m){

        if (n==m) {
            return 2;
        }
        if (n<m) {
            return 1;
        }

        int horizontal = SetTiles(n-m, m);

        int vartical = SetTiles(n-1, m);

        return horizontal + vartical;
    }
    public static void main(String[] args) {
        int n =4 , m =2;
        int totalWays = SetTiles(n, m);
        System.out.println(totalWays);
    }
}
