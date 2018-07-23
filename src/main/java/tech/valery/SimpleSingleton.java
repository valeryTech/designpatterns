package tech.valery;

/**
 *  Class with instantiating instance when loading.
 */
public class SimpleSingleton {

    private static final SimpleSingleton instance;

    private String value;

    static{
        System.out.println("instantiating");
        instance = new SimpleSingleton();
    }

    public static SimpleSingleton getInstance() {
        return instance;
    }



    private SimpleSingleton(){}

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SimpleSingleton{" +
                "value='" + value + '\'' +
                '}';
    }
}
