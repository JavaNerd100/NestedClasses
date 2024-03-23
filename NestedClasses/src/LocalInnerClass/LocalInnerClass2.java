package LocalInnerClass;

public class LocalInnerClass2 {
    private String message = "This is the example of local inner class";

    void display(){
        int value = 50; //local variable must be final till jdk 1.7 only

        class Local{
            void displayMessage(){
                System.out.println(value);
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
