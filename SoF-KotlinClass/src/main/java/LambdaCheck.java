public class LambdaCheck {
    public static void main(String args[]) {
        ILambdaInterface r=(a,b)->a+b;
        ILambdaInterface s=(a,b)->a*b;
        ILambdaInterface q=(a,b)-> a/b;
        ILambdaInterface t=(a,b)->a-b;

        System.out.println(r.operate(4,5));
        System.out.println(s.operate(4,5));
        System.out.println(q.operate(4,5));
        System.out.println(t.operate(4,5));
    }
}
