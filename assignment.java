// assignment operators

public class assignment {
    public static void main(String[] args) {
        int p = 10;
        int q;

        // use of assignment operator
        q = p;
        System.out.println(q); // 10

        // += operator
        p += q; // p = p+q, p = 10 + 10 = 20
        System.out.println(p);

        // -= operator
        p-= q; // p = p-q, p = 20-10 = 10
        System.out.println(p);

        // *= operator
        p*= q; // p = p * q, p = 10 *10 = 100
        System.out.println(p);

        // /= operator
        p/= q; // p = p /q , p = 100/10 = 10
        System.out.println(p);

        // %= operator
        p %= q; // p = p % q, p = 10 % 10 = 0
        System.out.println(p);
    }
}
