public class Enterprise {
    String Name;

    public static void main(String[] args) {
        Enterprise Obj=new Enterprise();
        Obj.Name=null;
        modify(Obj);
        System.out.println(Obj.Name);
    }
    public static void modify(Enterprise enterprise){
        enterprise.Name="Prajapati Sweets";
    }
}
