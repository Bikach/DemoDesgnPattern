package Creational.singleton;

class SampleSingleton {

    private static SampleSingleton instance = new SampleSingleton();

    private SampleSingleton(){}

    static SampleSingleton getInstance(){
        return instance;
    }
}
