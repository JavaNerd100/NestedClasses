package MemberInnerClass;

public class OuterClass3 {
    private int i = 30;

    static class InnerClass3 {

        private int y = 40;

    }

    public static void main(String[] args) {
        OuterClass3.InnerClass3 myinnerClass3= new OuterClass3.InnerClass3();
        System.out.println(myinnerClass3.y);
    }
}
