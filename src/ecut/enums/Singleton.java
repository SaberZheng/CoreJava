package ecut.enums;

/**
 * 
 *  双检锁实现单例 ( Singleton )
 *
 */
public class Singleton {  
	/*volatile:修饰成员变量在被每次被线程访问时，都强制从共享内存中读取该成员变量的值，而且当成员变量发生变化时，会强制线程将变化值写到共享内存，
	这样在任何时刻两个不同的线程总是看到某个成员变量的同一个值。*/
    private volatile static Singleton singleton;  
    private Singleton (){}  
    public static Singleton getSingleton() {  
    if (singleton == null) {  
        synchronized (Singleton.class) {  
        if (singleton == null) {  
            singleton = new Singleton();  
        }  
        }  
    }  
    return singleton;  
    }  
}  
