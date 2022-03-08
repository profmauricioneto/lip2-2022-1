/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObserverExample;

/**
 *
 * @author maumneto
 */
public class TestingObserver {
    public static void main(String[] args) {
        Subject eventoMonitorado = new Subject();
        
        ObserverSenderSMS sms1 = new ObserverSenderSMS(eventoMonitorado);
        ObserverSenderEmail email1 = new ObserverSenderEmail(eventoMonitorado);
        
        sms1.addPhone("85 99887766");
        sms1.addPhone("85 66778899");
        
        email1.addEmail("fulano@provedor.com");
        email1.addEmail("cicrano@provedor.com");
        
        for(int i = 0; i < 5; i++) {
            if (eventoMonitorado.isEven(i)) {
                eventoMonitorado.notifyAllAttached();
                System.out.println("------");
            }
        }
    }
}
