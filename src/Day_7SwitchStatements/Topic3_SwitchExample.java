package Day_7SwitchStatements;

public class Topic3_SwitchExample {
    public static void main(String[] args) {
       // write a code where it prints the name of the day based on the weeks day


       int day=1;


       switch (day){
           case 1:
               System.out.println("the 1st day of the week is monday");
       break;
           case 2:
               System.out.println("the 2st day of the week is tuesday");
               break;
           case 3:
               System.out.println("the 3st day of the week is wednesday");
               break;
               case 4 :
                   System.out.println("the 4st day of the week is thursday");
                   break;
           case 5 :
               System.out.println("the 5st day of the week is friday");
               break;
           case 6:
               System.out.println("the  6st day of the week is saturday");
               break;
           case 7:
               System.out.println("the 7st day of the week is sunday");
           default:
               System.out.println("Invalid day of the week ");
       }
    }
}
