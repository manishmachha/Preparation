package SingletonClass;

public class Main {
    public static void main(String[] args) {
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();
        SingletonClass singletonClass3 = SingletonClass.getInstance();

        System.out.println(singletonClass1.hashCode());
        System.out.println(singletonClass2.hashCode());
        System.out.println(singletonClass3.hashCode());
    }
}
