package MemberInnerClass;

/**
 * Unlike a "regular" class, an inner class can be private or protected.
 * If you don't want outside objects to access the inner class, declare the class as private:
 */
public class OuterClass2 {

    private int i = 30;

   private class InnerClass2 {

        private int y = 40;
    }

    public static void main(String[] args) {
        OuterClass2 myOuterClass2 = new OuterClass2();
        OuterClass2.InnerClass2 myinnerClass2 = myOuterClass2.new InnerClass2();
        System.out.println(myOuterClass2.i + myinnerClass2.y);
    }
}
