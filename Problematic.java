
public class Problematic {

    static volatile int first = 0;
    static volatile int second = 0;

    public static void main( String[] args ) {
        Runnable r1 = ()->{
            doSomeWork();
            first++;
            second++;
        };

        Runnable r2 = ()->{
            doSomeWork();
            first++;
            second++;
            if (second == 2 && first != 2) {
                assert(false);
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }

    static void doSomeWork() {
        System.out.println(Thread.currentThread().getName() + " doing some work" );
    }
}