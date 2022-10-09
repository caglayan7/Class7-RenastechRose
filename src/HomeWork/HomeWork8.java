package HomeWork;

public class HomeWork8 {
    public static void main(String[] args) {
        String FirstName = "marasli ";
        String LastName = "gorkem ";
        int CreditScore = 770;
        if (CreditScore<500) {
            System.out.println(FirstName+""+LastName+"has Bad Credit Score");
        } if (CreditScore>=500 && CreditScore<700) {
            System.out.println(FirstName+""+LastName+"has Average Credit Score");
        } if (CreditScore>=700 && CreditScore<750) {
            System.out.println(FirstName+""+LastName+"has Good Credit Score");
        } if (CreditScore>=750) {
            System.out.println(FirstName+""+LastName+"has Great Credit Score");
        }
    }
}

