package HomeWork;

public class HomeWork5 {
    public static void main(String[] args) {
        double Temp = 42;
        if (Temp<10) {
            System.out.println("The weather is so cold");
        }
         else if (Temp>=10 && Temp<40) {
            System.out.println("The weather is cold");
        }
        else if (Temp >=40 && Temp<70) {
            System.out.println("The weather is good");
        }

        else if (Temp >=70 && Temp<90) {
                System.out.println("The weather is hot");
            }
        else if (Temp>=90) {
                    System.out.println("The weather is so hot");
                }

    }
}
