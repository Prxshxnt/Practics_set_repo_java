public class PathCal {
    public static int CountPath(int i, int j, int n, int m){
        if (i==n || j==m) {
         return 0;   
        }
        if (i==n-1 && j==n-1) {
            return 1;
        }

        // Move downward
        int downPath = CountPath(i+1, j, n, m);

        // Move right
        int rightPath = CountPath(i, j+1, n, m);

        return downPath + rightPath;
    }
    public static void main(String[] args) {
        int n = 3 , m =3;
        int totalCount = CountPath(0, 0, n, m);
        System.out.println(totalCount);
    }
}
