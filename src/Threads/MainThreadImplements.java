package Threads;

/**
 * Created by welli on 14/02/2017.
 */
public class MainThreadImplements
{
    public static void main(String[] args)
    {
        MinhaThreadImplements t = new MinhaThreadImplements();

        Thread t2 = new Thread(t);
        t2.start();
    }
}
