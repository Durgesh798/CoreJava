package qa;

public class ReverseString {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :  ");
        String str = sc.next();
        String rstr = "";
        String[] ch = str.split("");
        for (int i = str.length() - 1; i >= 0; i--) {
            rstr = rstr + ch[i];
        }
        System.out.println(rstr);*/

        int stages = 3; // Replace this with the number of stages you want to simulate
        int[] steps = new int[stages];

        // Stage 0: Starting point at position 0
        steps[0] = 0;

        // Stage 1: Take one step forward (+1 step)
        steps[1] = steps[0] + 1;

        // Stage 2: Take two steps backward (-2 steps)
        steps[2] = -2- steps[1] ;

        // Calculate the steps for subsequent stages
        for (int i = 3; i < stages; i++) {
            steps[i] = steps[i - 1] - (steps[i - 2] - steps[i - 3]);
        }

        // Display the dance sequence
        System.out.println("Dance Sequence:");
        for (int i = 0; i < stages; i++) {
            System.out.println("Stage " + i + ": " + steps[i] + " steps");
        }
    }

}
