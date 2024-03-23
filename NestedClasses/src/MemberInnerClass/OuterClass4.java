package MemberInnerClass;

public class OuterClass4 {
     int i = 30;

     class InnerClass4 {
         public int myInnerMethod(){
             return i;

    }

    public static void main(String[] args) {
        OuterClass4 myOuterClass4 = new OuterClass4();
        OuterClass4.InnerClass4 myinnerClass4= myOuterClass4.new InnerClass4();
        System.out.println(myinnerClass4.myInnerMethod());
    }
}
}
