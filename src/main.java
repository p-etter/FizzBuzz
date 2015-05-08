/**
 * Created by Petter on 08.05.2015.
 */
public class main {

    public void RunCode() {
        for (int i = 1; i <101; i++) {
            if (Three(i) && Five(i)) {
                System.out.println("FizzBuzz");
            }
            else if (Three(i)) {
                System.out.println("Fizz");
            }
            else if(Five(i)) {
                System.out.println("Buzz");
            }
            else System.out.println(i);
        }
    }

    public boolean Three(int i) {

        if (i % 3 == 0) {
            return true;
        }
        return false;

    }

    public boolean Five(int i) {
        if (i % 5 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String [] args) {
        main m = new main();
        m.RunCode();
    }

}
