public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++; //Increment x after printing 
            if (x == 5) {
                //Do some operation here if you like 
            }
        }
        System.out.println("Loop finished");
    }
}