package StringBulider;
public class main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        sb.append("e");
        sb.delete(5, 6);
        sb.insert(0, "c");
        System.out.println(sb.length());
        sb.setCharAt(0, 'P');
        sb.charAt(3);
        System.out.println(sb);

    }
}