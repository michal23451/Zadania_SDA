public class Main {
    private static int a;

    public static void main(String[] args) {
        //System.out.println(a);
        int a = 5;
        //System.out.println(a);
        System.out.println(f(a));
        System.out.println(f(a));
        System.out.println(a);
    }

    public static int f(int x) {
        a++;
        System.out.println("a:" + a + "   a+x:" + a +"+" +x);
        return a + x;
    }
}