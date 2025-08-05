class faltu{
    static final   int val=43;
}

public class contant {
    public static void main(String[] args) {
        faltu obj=new faltu();
       // obj.val=45; worng way
        System.out.println(faltu.val);
    }
}
