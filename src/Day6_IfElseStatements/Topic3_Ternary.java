package Day6_IfElseStatements;

public class Topic3_Ternary {
    public static void main(String[] args) {
        /*
        if(a>0){
        print("a is positive")
        }
        else{
        print("a is not positive")
        }
        String result;
        int a = 10;
        result = (condition)?"the number is positive":"the number is not positife";
         */
        int num1 = 90;
        int num2 = 100;
        int big ;
        big = (num1>num2)?num1:num2;// ternary
        System.out.println("the max number is:"+big);

        if (num1>num2){
            big = num1;

        }else {
            big = num2;
        }
        System.out.println("the max number is: "+big);
    }
}
