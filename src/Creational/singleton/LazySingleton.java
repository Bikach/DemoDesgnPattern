package Creational.singleton;

class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton(){}

    static LazySingleton getInstance(){
        if  (instance == null) instance = new LazySingleton();
        return instance;
    }
}
