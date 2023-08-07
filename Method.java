public class Method {

    static void addition(int x, int y){
        System.out.println(x+y);        // addition
    }
    static void subtruction(int x, int y){
        System.out.println(x-y);        // subtruction
    }
    static void multify(int x, int y){
        System.out.println(x*y);         // multify
    }

    static void division(int x, int y) {
        System.out.println(x / y);         // division
    }
    public static void main(String[] args){
        addition(2,3);
        subtruction(5,2);
        multify(6,2);
        division(12,2);
    }
}
/* we use method for reuse code , define the code once ,
and use it many times.*/
