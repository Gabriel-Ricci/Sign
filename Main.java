public class Main {
    public static void main(String[] args) {
        int x;
        String str;
        Sign s = new Sign("ABC222DE", 3);
        x = s.numberOfLines();
        System.out.println(x);
        str = s.getLines();
        System.out.println(str);
    }
}