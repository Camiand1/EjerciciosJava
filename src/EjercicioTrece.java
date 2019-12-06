import java.util.Calendar;

public class EjercicioTrece {

    public void obtenerFechaHora(){
        Calendar calendario = Calendar.getInstance();
        int hora, minutos, segundos, dia, mes, año;
        año = calendario.get(Calendar.YEAR);
        mes = calendario.get(Calendar.MONTH);
        dia = calendario.get(Calendar.DATE);
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);

        System.out.println("(" + año + "/" + mes + "/" + dia + ") (" + hora + ":" + minutos + ":" + segundos + ")");
    }
}
