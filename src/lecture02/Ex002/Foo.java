package lecture02.Ex002;

class Doo extends Foo {
    public void M() {
        Foo.getCount();     // access with private, protected
        Foo.count = 123;    // access with protected
    }
}

public class Foo {

//    private static Integer count;
    protected static Integer count;
    public static Integer getCount() {
        return count;
    }

    static {
        count = 0;
    }

    public Foo() {
        count++;
    }

    public void printCount() {
        System.out.println(count);
    }
}
