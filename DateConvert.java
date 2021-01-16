import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateConvert
{
    public String Convert(String Input)
    {
        LocalTime lt = LocalTime.parse(Input, DateTimeFormatter.ofPattern("h:mm a", Locale.US));

        return lt.format( DateTimeFormatter.ofPattern("HH:mm", Locale.US));
    }

}