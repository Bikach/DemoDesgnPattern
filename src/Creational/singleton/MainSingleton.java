package Creational.singleton;

public class MainSingleton {

    public static void main(String[] args) {

        System.out.println("Sample Singleton");

        SampleSingleton instance = SampleSingleton.getInstance();
        System.out.println(instance);
        SampleSingleton anotherInstance = SampleSingleton.getInstance();
        System.out.println(anotherInstance);


        System.out.println("\nlazy Singleton");

        LazySingleton lazyInstance = LazySingleton.getInstance();
        System.out.println(lazyInstance);
        LazySingleton anotherLazyInstance = LazySingleton.getInstance();
        System.out.println(anotherLazyInstance);

        System.out.println("\nThread Safe lazy Singleton");

        ThreadSafeLazySingleton threadSafelazyInstance = ThreadSafeLazySingleton.getInstance();
        System.out.println(threadSafelazyInstance);
        ThreadSafeLazySingleton anotherthreadSafelazyInstance = ThreadSafeLazySingleton.getInstance();
        System.out.println(anotherthreadSafelazyInstance);


    }
}
