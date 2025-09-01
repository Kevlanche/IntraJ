public class SwitchFallthrough02 {
    public void test(String input) {
        switch (input) {
            case "a":
                int x = 1;
            case "b":
                int y = 2;
            case "c":
                System.out.println(x + y);
                break;
        }
    }
}