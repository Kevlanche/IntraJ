public class IMPDAA06 {
    void testCircularWithPrint() {
        int x, y;
        x = y;
        y = x;
        System.out.println(x + y);
    }
    
    void testCircularWithReturn() {
        int a, b;
        a = b;
        b = a;
    }
    
    void testPartialCircularWithUsage() {
        int p, q, r;
        p = q;
        q = r;
        r = q;
        System.out.println(p);
    }
    
    void testCircularWithAssignment() {
        int m, n, result;
        m = n;
        n = m;
        result = m;
    }
    
    void testCircularWithConditionalUsage() {
        int x, y;
        x = y;
        y = x;
        
        if (x > 0) {
            System.out.println("Positive");
        }
    }
}