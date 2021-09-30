public class CountPrinter implements Runnable
{
    int count = 0;
    int i = 0;

    @Override
    public void run()
    {

        while(i<20)
        {
            System.out.println(count);
            count++;
            i++;
        }

    }
}
