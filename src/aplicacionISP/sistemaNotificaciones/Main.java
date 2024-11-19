package aplicacionISP.sistemaNotificaciones;

public class Main {
    public static void main(String[] args) {
        ServicioNotificacionSMS servicioNotificacionSMS = new ServicioNotificacionSMS();
        servicioNotificacionSMS.enviarSMS("3214532312", "Revisa la plataforma SIMA");

        ServicioNotificacionEmail servicioNotificacionEmail = new ServicioNotificacionEmail();
        servicioNotificacionEmail.enviarEmail("slvargasm@unicartagena.edu.co", "Hay que terminar la actividad de POO.");
    }
}
