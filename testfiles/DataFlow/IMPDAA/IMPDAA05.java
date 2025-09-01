public class IMPDAA05 {
    void testBasicThreeWayCircle() {
        int x, y, z;
        x = y;
        y = z;
        z = x;
    }
    
    void testThreeWayInLoop() {
        int a, b, c;
        for (int i = 0; i < 5; i++) {
            a = b;
            b = c;
            c = a;
        }
    }
    
    void testComplexThreeWayChain() {
        int p, q, r;
        while (p < 100) {
            p = q + 1;
            q = r * 2;
            r = p / 3;
        }
    }
    
    void testFourVariableChain() {
        int a, b, c, d;
        a = b;
        b = c;
        c = d;
        d = a;
    }
}