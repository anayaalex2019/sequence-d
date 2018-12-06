public class Main {

    public static void main(String[] args) {
        squares();
        cubes();
        fibonacci();
        prime();
        triangle();
    }
    public static void squares(){
        int x = 1;
        int a = 1;

        System.out.print("First 10 Square Numbers: ");

        while(x < 11){
        a = x*x;
        x = x +1;

        System.out.print(a + " ");
        }
        System.out.println(" ");
    }
    public static void cubes(){
        int x = 1;
        int a = 1;

        System.out.print("First 10 Cube Numbers: ");

        while(x < 11){
            a = x*x*x;
            x = x +1;
            System.out.print(a + " ");
        }
        System.out.println(" ");
    }
    public static void fibonacci(){
        int firstNumber = 1;
        int previousNumber = 0;
        int count = 1;

        int result = 0;

        System.out.print("First 10 Fibonacci Numbers: ");

        while(count < 11){

            result = firstNumber + previousNumber;
            previousNumber = firstNumber;
            firstNumber = result;


            count = count + 1;
            System.out.print(result + " ");
        }
        System.out.println(" ");
    }
    public static void prime(){

        System.out.print("First 10 Prime Numbers: ");
                int x = 2;
                while (x <= 29) {
                    int divisor = 2;
                    // stop when y > x
                    while (divisor <= x) {
                        // if y reaches x then no divisors
                        if (x == divisor) {

                            System.out.print(x + " ");
                        }
                        if (x % divisor == 0) {
                            break;
                        }
                        divisor++;
                    }
                    x++;
                }
            }

    public static void triangle(){

        System.out.println();

        int firstNumber = 0;
        int addNumber = 0;
        int x = 1;
        int count = 1;


        int result = 0;

        System.out.print("First 10 Triangle Numbers: ");

        while(count < 11){

            addNumber = addNumber + 1;
            result = firstNumber + addNumber;
            firstNumber = result;



            count = count + 1;
            System.out.print(result + " ");
        }
        System.out.println(" ");

    }
}
