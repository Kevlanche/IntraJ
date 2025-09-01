public class SwitchFallthrough01 {
    public void test(String bar) {
        switch (bar) {
            case "foo":
                int x = 123;
            case "bar":
                System.out.println(123);
                break;
        }
    }
}