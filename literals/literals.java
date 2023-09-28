package literals;

class literals {

  public static void main(String[] args) 
  {
    // Literals

    int num1 = 0b101; // binary
    int num2 = 0x7E; // hex
    int num3 = 10_00_00_000; // can use underscore to make it easier to view the number, will print as 100000000

    double num4 = 56; // int gets converted to a double 
    double num5 = 12e10;  


    char c = 'a';
    c++; // incremtnes so returns b


    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);

    System.out.println(num4);
    System.out.println(num5);

    System.out.println(c);
    
  }
}
