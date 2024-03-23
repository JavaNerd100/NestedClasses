package MemberInnerClass;

/**
 * A non-static class that is created inside a class but outside a method is called member inner class.
 * It is also known as a regular inner class.
 * It can be declared with access modifiers like public, default, private, and protected.
 */
public class OuterClass {

    private int i = 30;

    class InnerClass {

        private int y = 40;
         void message(){
             System.out.println("The number of outer class " + i);
         }
    }

    public static void main(String[] args) {
        OuterClass myOuterClass = new OuterClass();
        InnerClass myinnerClass = myOuterClass.new InnerClass();
        myinnerClass.message();
        System.out.println(myOuterClass.i + myinnerClass.y);
    }


}
