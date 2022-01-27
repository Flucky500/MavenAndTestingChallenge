package pl.pasko;

public class IsAdult {

    public static boolean isAdult (int age) {
        if (age <= 0){
            System.out.println("Age cannot be less than zero");
            return false;
        }
        else if(age < 18){
            System.out.println("This person is not an adult");
            return false;
        }
        System.out.println("This person is an adult");
        return true;
    }
}
