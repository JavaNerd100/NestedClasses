package StaticNestedClass;

public class StaticNestedClass3 {
    static String message = "This is the example of Static nested class with static method";

    static class InnerClass{
        static void displayMessage(){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        StaticNestedClass3.InnerClass.displayMessage();


    }
}
