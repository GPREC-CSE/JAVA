class Met
{
    synchronized public void mul(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }
}
class T1 extends Thread
{
    Met m=new Met();
    public void run()
    {
        m.mul(5);
    }
}
class T2 extends Thread
{
    Met m=new Met();
    public void run()
    {
        m.mul(10);
    }
}
public class Main
{
    public static void main(String args[]) throws Exception
    {
        T1 t1=new T1();
        T2 t2=new T2();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
    }
}