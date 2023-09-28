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


        

        System.out.println(num1);

        System.out.println(a);


        System.out.println(d);

        System.out.println(x);
        
        
    }
}
