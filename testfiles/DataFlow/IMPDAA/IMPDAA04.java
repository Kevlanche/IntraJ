public class IMPDAA04 {
    void testBasicCircular() {
        int x, y;
        x = y;
        y = x;
    }
    
    void testCircularInLoop() {
        int a, b;
        for (int i = 0; i < 10; i++) {
            a = b;
            b = a;
        }
    }
    
    void testCircularInWhile() {
        int m, n;
        while (true) {
            m = n;
            n = m;
        }
    }
}