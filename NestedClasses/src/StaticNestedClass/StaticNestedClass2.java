package StaticNestedClass;

public class StaticNestedClass2 {

    private static String message = "This is the example of Static nested class with static field";

    static class InnerClass{
        void displayMessage(){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        StaticNestedClass2.InnerClass myInnerClass = new StaticNestedClass2.InnerClass();
        myInnerClass.displayMessage();

    }

}
