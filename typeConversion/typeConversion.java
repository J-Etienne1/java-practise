package typeConversion;

public class typeConversion {
    public static void main(String[] args) {
        int num1 = 9;

        /*
         byte b = 127
         int a = 256
         b = a

         This wont work, if we want to do this need to do the following:

         a = b // this will work as int as a bigger range than byte
         */
        byte b = 127;
        int a = 256;
        a = b; // this is implicet conversion


        byte c = 127;
        int d = 256;
        d = (byte)c; // this is casting, also called explicet conversion


        // trying to assign a float value
        float f = 5.6f;
        int x = (int)f; // will loose point values, returns 5


        

        // Type promotion
        byte y = 12;
        byte z = 30;
        // can we save byte to int? Ye the bytes are prmoted to int's and saved to the int vareable result
        int result = y*z;


        System.out.println(num1);

        System.out.println(a);


        System.out.println(d);

        System.out.println(x);

        System.out.println(result);

        
    }
}
