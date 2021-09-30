public class Main {
    public static void main(String[] args)
    {

        DatePrinter dp = new DatePrinter();
        Thread th1 = new Thread(dp);

        CountPrinter cp = new CountPrinter();
        Thread th2 = new Thread(cp);

        th1.start();
        th2.start();


        /*
        Es fällt auf, dass das bis zu einer bestimmten Anzahl an Wiederholung des CountPrint Funktion (~5000)
          immer zuerst die Zahlen ausgegben werden, da das Programm zum bekommen des Datums anscheinend länger andauert.
          Dies erkennt man indem man die Durchläufe der CountPrint Funktion erhöht. 
         */


    }
}
