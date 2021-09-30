import java.util.Date;

public class DatePrinter implements Runnable{


    private java.util.Date date = new Date();
    int i = 0;

    @Override
    public void run()
    {

        while(i<20)
        {
            System.out.println(date);
            i++;
        }

    }
}

