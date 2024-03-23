package LocalInnerClass;


import java.util.regex.Matcher;

/**
 * A class i.e., created inside a method, is called local inner class in java.
 * Local Inner Classes are the inner classes that are defined inside a block.
 * Generally, this block is a method body. Sometimes this block can be a for loop, or an if clause.
 * Local Inner classes are not a member of any enclosing classes. They belong to the block they are defined within,
 * due to which local inner classes cannot have any access modifiers associated with them.
 * However, they can be marked as final or abstract. These classes have access to the fields of the class enclosing it.
 * If you want to invoke the methods of the local inner class, you must instantiate this class inside the method.
 */
public class LocalInnerClass {

    private String message = "This is the example of local inner class";

    void display(){
        class Local{
            void displayMessage(){
                System.out.println(message);
            }
        }

        Local myLocal = new Local();
        myLocal.displayMessage();
    }

    public static void main(String[] args) {
        LocalInnerClass myLocalInnerClass = new LocalInnerClass();
        myLocalInnerClass.display();
    }
}
