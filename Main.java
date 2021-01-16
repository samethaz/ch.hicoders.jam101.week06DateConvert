import java.awt.desktop.SystemEventListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class Main
{
    public static void main(String[] args)
    {
        DateConvert d=new DateConvert();

        System.out.println(d.Convert("6:23 PM"));
        System.out.println(d.Convert("3:15 AM"));
    }
}
