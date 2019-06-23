package Creational.singleton;

class ThreadSafeLazySingleton {

    private static volatile ThreadSafeLazySingleton instance = null;

    private ThreadSafeLazySingleton(){
        if(instance != null) throw  new RuntimeException("Use getInstance() method to create");
    }

    static ThreadSafeLazySingleton getInstance(){
        if  (instance == null) {
            synchronized (ThreadSafeLazySingleton.class){
                if  (instance == null) instance = new ThreadSafeLazySingleton();
            }
        }
        return instance;
    }
}
