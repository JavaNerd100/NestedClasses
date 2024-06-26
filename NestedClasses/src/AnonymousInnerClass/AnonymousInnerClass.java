package AnonymousInnerClass;


/**
 * Java anonymous inner class is an inner class without a name and for which only a single object is created.
 * An anonymous inner class can be useful when making an instance of an object with certain "extras" such as overloading methods
 * of a class or interface, without having to actually subclass a class.
 * In simple words, a class that has no name is known as an anonymous inner class in Java. It should be used if you have to override a method of class or interface. Java Anonymous inner class can be created in two ways:
 *  1) Class (may be abstract or concrete).
 *  2) Interface
 */
public abstract class AnonymousInnerClass {

    abstract void display();

    public static void main(String[] args) {
        AnonymousInnerClass anonymousInnerClass = new
                AnonymousInnerClass() {
                    @Override
                    void display() {
                        System.out.println("This is the example of a anonymous inner class");
                    }
                };
        anonymousInnerClass.display();
    }


}
