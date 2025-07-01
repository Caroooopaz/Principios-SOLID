## *"Los módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos deben depender de abstracciones.”*

Este principio establece que una clase no debería depender de interfaces que no usa o las interfaces no deberían tener métodos que no usan.

public class ServicioNotificacion {
    private EmailNotificacion email = new EmailNotificacion();
    
    public void enviarMensaje(String mensaje) {
        email.enviar(mensaje);
    }
}

public class EmailNotificacion {
    public void enviar(String mensaje) {
        System.out.println("Enviando Email: " + mensaje);
    }
}

❌ ServicioNotificacion depende directamente de EmailNotificacion. Si queremos cambiar a SMS o WhatsApp, debemos modificar ServicioNotificacion.

public interface Notificador {
    void enviar(String mensaje);
}

public class EmailNotificacion implements Notificador {
    public void enviar(String mensaje) { 
	    System.out.println("📧 Enviando Email: " + mensaje); 
    }
}

public class SMSNotificacion implements Notificador {
    public void enviar(String mensaje) { 
	    System.out.println("📱 Enviando SMS: " + mensaje);
    }
}

public class ServicioNotificacion {
    private Notificador notificador;

    public ServicioNotificacion(Notificador notificador) { 
	    this.notificador = notificador; 
    }

    public void enviarMensaje(String mensaje) { 
	    notificador.enviar(mensaje);
    }
}


✅ Ahora ServicioNotificacion no depende de una clase concreta, sino de una interfaz, permitiendo cambiar la implementación sin modificar la lógica.
