package tech.valery;

/**
 * DCSingleton uses Double-Checked lock for lazy initialization of the Singleton instance.
 *
 * There is might be the problems due to Java memory model (reordering),
 * but with using a volatile keyword (memory barrier with writing to the field)
 * we preserve any possible wrong reads.
 *
 * With private constructor we provide the ability to the Singletone class be the only global access point
 * to get the instance of the class, but Reflection API can destroy this mechanism.
 *
 */
public class DCSingleton {

    private static volatile DCSingleton instance;

    private DCSingleton() {
    }

    public static boolean isInitialized(){
        return instance != null;
    }

    public static DCSingleton getInstance() {

        if (instance == null) {
            synchronized (DCSingleton.class) {
                if (instance == null) {
                    instance = new DCSingleton();
                }
            }
        }
        return instance;
    }
}

