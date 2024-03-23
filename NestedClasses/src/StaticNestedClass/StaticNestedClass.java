package StaticNestedClass;

/**
 * A static class is a class that is created inside a class, is called a static nested class in Java.
 * It cannot access non-static data members and methods. It can be accessed by outer class name.
 *      1) It can access static data members of the outer class, including private.
 *      2) The static nested class cannot access non-static (instance) ,data members
 *
 */
public class StaticNestedClass {

    private String message = "This is the example of Static nested class";

    static class InnerClass{
        StaticNestedClass staticNestedClass = new StaticNestedClass();
        void displayMessage(){
            System.out.println(staticNestedClass.message);//Note: just like static attributes and methods, a static inner class does not have access to members of the outer class.
        }
    }

    public static void main(String[] args) {
        StaticNestedClass.InnerClass myInnerClass = new InnerClass();
        myInnerClass.displayMessage();

    }


}
