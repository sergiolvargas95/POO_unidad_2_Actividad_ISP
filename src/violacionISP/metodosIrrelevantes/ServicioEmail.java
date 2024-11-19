package violacionISP.metodosIrrelevantes;

public class ServicioEmail implements Notificacion {
    @Override
    public void enviarEmail(String destinatario, String mensaje) {
        System.out.println("Enviando email a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
    @Override
    public void enviarSMS(String numero, String mensaje) {
// Implementación vacía, ya que el servicio de email no envía SMS.
    }
}