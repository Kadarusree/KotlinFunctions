public class MyJavaClass
{
    public static void main(String[] args) {
       // FunctionsInKotlinKt.add(10,11);
        Functions.add(10,11);

        int total_amount_1parm = Interest.calucalteAmount(100);
        int toatl_amt_2parm = Interest.calucalteAmount(100, 2.5f);

        System.out.println(total_amount_1parm+"==="+toatl_amt_2parm);
    }
}
