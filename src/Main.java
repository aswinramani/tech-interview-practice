import TwoPointers.ThreeSum;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void runAlgo(int order) {
        switch (order) {
            case 0:
                ThreeSum.init();
                break;
            default:
                System.out.println("default case! why is this coming");
        }
    }

    public static void main(String[] args) {
        int totalAlgoCount = 1;
        int runAlgo = 0;
        for (int i = runAlgo; i < totalAlgoCount; i++) {
            Main.runAlgo(i);
        }
    }
}