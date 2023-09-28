package assignmentOperators;

public class assignmentOperators {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;

        int num3 = 5;
        int num4 = 5;

        int num5 = 5;
        int num6 = 5;

        int num7 = 10;
        int num8 = 5;

        int num9 = 7;
        int num10 = 5;



        // num1 = num1 + 2;
        // shortcut of the above
        // num1+= 2;

        // to incremnt by 1 can use the following shortcut
        // num1++;


        // Post Increment:  num1++
        //(This is known as the post-increment operator. It first uses the current value of the variable and then increments it by 1. So, if num1 is, for example, 5, using num1++ will use the value 5 and then increment num1 to 6.)
        // num1++
        

        // Pre Increment: ++num1 
        // This is the pre-increment operator. It first increments the value of the variable by 1 and then uses the updated value. So, if num1 is 5, using ++num1 will increment num1 to 6 and then use the value 6.

        /*
            int num1 = 5;

            int postIncrementResult = num1++; // postIncrementResult will be 5, num1 will be 6

            int num1 = 5; // Reset num1 to 5

            int preIncrementResult = ++num1; // preIncrementResult will be 6, num1 will be 6
         */

         /*
          In the first case, the post-increment operator num1++ uses the value 5 and then increments num1. In the second case, the pre-increment operator ++num1 increments num1 to 6 and then uses that updated value.
          */





        int resultAdd = num1 + num2;
        int resultSubtract = num3 - num4;
        int resultMultiply = num5 * num6;
        int resultDivide = num7 / num8;
        int resultMod = num9 % num10;
        





        System.out.println(resultAdd);
        System.out.println(resultSubtract);
        System.out.println(resultMultiply);
        System.out.println(resultDivide);
        System.out.println(resultMod); // 5/7 = 1.2 so the remainder 2 is returned
        System.out.println(num1);
        
    }
    
}
