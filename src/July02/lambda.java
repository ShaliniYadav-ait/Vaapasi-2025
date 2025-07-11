package July02;

@FunctionalInterface
interface Greeting{
    String sayHello();
}

interface Maths{
 int add(int a, int b);
}

public class lambda {
    public static void main(String[] args) {
        Greeting g = ()->"Happy Holidays";
        System.out.println(g.sayHello());

        Maths m = (Integer::sum);
        System.out.println(m.add(2,3));

        Maths m2 = (lambda::add);
        System.out.println(m2.add(6,7));
    }

    public static int add(int a, int b){
        return a+b;
    }
}
