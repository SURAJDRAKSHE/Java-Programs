public class Swapping2Numbers {
    public static void main(String[] args) {
        int a =10;
        int b =20;

        System.out.println("Before swapping two numbers .."+a+" "+b);

        // Using 3rd varibale
        /*int t =a;
        a = b;
        b =t;*/

        // Without 3rd varible
        /*a = a+b; //10+20 =30
        b = a-b; //30-20 =10
        a = a-b;*/ //30-10 =20

        //using * oprator
        /*a = a*b; //10*20 =200
        b = a/b; //200/20 =10
        a = a/b;*/ // 200/10 =20

        // Single Statement
       // b = a+b -(a=b);

       // using bitwise XOR 
       a = a^b;
       b = a ^b;
       a = a^b; 

        System.out.println("After swapping two numbers .."+a+" "+b);
        
    }
    
}
