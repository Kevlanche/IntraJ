public class IMPDAA07 {
    void testNestedForLoops() {
        int x, y;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                x = y;
                y = x;
            }
        }
    }
    
    void testNestedWhileLoops() {
        int a, b, c;
        while (true) {
            while (a < 10) {
                a = b;
                b = c;
                c = a;
                a++;
            }
        }
    }
    
    void testMixedNestedLoops() {
        int p, q;
        for (int i = 0; i < 10; i++) {
            while (p < 5) {
                p = q;
                q = p;
                p++;
            }
        }
    }
    
    void testTripleNestedCircular() {
        int m, n;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    m = n;
                    n = m;
                }
            }
        }
    }
    
    void testNestedWithBreakPattern() {
        int x, y, z;
        outer: for (int i = 0; i < 10; i++) {
            inner: for (int j = 0; j < 10; j++) {
                x = y;
                y = z;
                z = x;
                
                if (i > 5) break outer;
                if (j > 5) break inner;
            }
        }
    }
}