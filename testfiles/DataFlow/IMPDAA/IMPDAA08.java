public class IMPDAA08 {
    void testIfElseCircular(boolean condition) {
        int x, y;
        
        if (condition) {
            x = y;
            y = x;
        } else {
            x = 5;
            y = 10;
        }
    }
    
    void testSwitchCircular(int value) {
        int a, b, c;
        
        switch (value) {
            case 1:
                a = b;
                b = a;
                break;
            case 2:
                b = c;
                c = b;
                break;
            default:
                a = 1;
                break;
        }
    }
    
    void testConditionalInLoop() {
        int m, n;
        
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                m = n;
                n = m;
            }
        }
    }
    
    void testNestedConditionalCircular(boolean outer, boolean inner) {
        int p, q, r;
        
        if (outer) {
            if (inner) {
                p = q;
                q = r;
                r = p;
            } else {
                p = 1;
            }
        }
    }
    
    void testTernaryCircular(boolean condition) {
        int x, y, temp;
        
        temp = condition ? (x = y) : (y = x);
    }
    
    void testTryCatchCircular() {
        int a, b;
        
        try {
            a = b;
            b = a;
            throw new RuntimeException("test");
        } catch (Exception e) {
        }
    }
}