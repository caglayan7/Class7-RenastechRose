package Day6_IfElseStatements;

public class Topic4_MultipleTernary {
    public static void main(String[] args) {
        /*
        (condition)?first:(condition)?:second:(condition)?third:forth;

         */
        // write a code where it checks if number is even or odd or zero
        // (a%2==0)?"the number is even";(a%2!=0)?"the number is odd":"the number is 0";
        int number1 =70;
        String result = (number1==0)?"the number1 is zero":(number1%2!=0)?"the number is odd":"the number is even";
        System.out.println(result);
    }
}
