package Second_pack.def;

public class HelloWorld {
    String str;
    public static void main(String[] args) {
        HelloWorld h= new HelloWorld();
      // method(str); // non-static variable str cannot be referenced from a static context
        h.print();
    }

    private static HelloWorld method(String str) {
        str="abc";
    return new HelloWorld();
    }

    public  void print() {
        System.out.println("String :"+str);

    }

}
