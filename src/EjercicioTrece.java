import java.util.Calendar;

public class EjercicioTrece {

    public void ejercicioTrece(){
        Calendar calendario = Calendar.getInstance();
        int hour, minutes, seconds, day, month, year;
        year = calendario.get(Calendar.YEAR);
        month = calendario.get(Calendar.MONTH);
        day = calendario.get(Calendar.DATE);
        hour = calendario.get(Calendar.HOUR_OF_DAY);
        minutes = calendario.get(Calendar.MINUTE);
        seconds = calendario.get(Calendar.SECOND);

        System.out.println("(" + year + "/" + month + "/" + day + ") (" + hour + ":" + minutes + ":" + seconds + ")");
    }
}
