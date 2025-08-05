//local variable
public class Business {
    int businessId; // 🔧 Add this line

    public static void main(String[] args) {
        Business obj1 = new Business();
        obj1.businessId = 50;
        Business obj2 =new Business();
        obj2.businessId =24;

        modify(obj2);
        System.out.println(obj2.businessId); // Output: 20
    }

    private static void modify(Business busness) {
        busness.businessId=55;

    }
}
