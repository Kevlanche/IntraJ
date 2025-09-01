public class SwitchFallthrough03 {
    public void test(int value) {
        switch (value) {
            case 1:
                int a = 10;
            case 2:
            case 3:
                int b = 20;
                System.out.println(a + b);
                break;
            default:
                System.out.println("default");
        }
    }
}