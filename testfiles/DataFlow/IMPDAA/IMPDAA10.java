public class IMPDAA10 {
    void testMixedDAA_IMPDAA() {
        int a, b, c, d;
        
        a = 1;
        a = 2;
        
        b = c;
        c = b;
        
        d = 5;
        System.out.println(d);
    }
    
    void testChainedMixed() {
        int x, y, z, w;
        
        x = 10;
        y = x;
        z = y;
        y = z;
        
        w = 20;
        System.out.println(w);
    }
    
    void testBrokenCircular() {
        int a, b, c;
        
        a = b;
        b = c;
        c = b;
        
        System.out.println(a);
    }
    
    void testMultipleCirculars() {
        int p, q, r, s;
        
        p = q;
        q = p;
        
        r = s;
        s = r;
    }
    
    void testPartialCircularWithDAA() {
        int m, n, o;
        
        m = 1;
        m = n;
        n = o;
        o = m;
    }
    
    void testComplexMixedPattern() {
        int var1, var2, var3, var4, var5;
        
        var1 = 100;
        
        var2 = var3;
        var3 = var2;
        
        var4 = var5;
        var5 = 200;
        var5 = var4;
        
        System.out.println(var4 + var5);
    }
}