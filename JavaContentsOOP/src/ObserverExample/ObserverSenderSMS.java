/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObserverExample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class ObserverSenderSMS extends Observer {
    private List<String> phones = new ArrayList<>();
    
     public ObserverSenderSMS(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    
    public void showPhones() {
        for (String phone: phones) {
            System.out.println(phone);
        }
    }
    
    public void addPhone(String phone) {
        phones.add(phone);
    }
    
    public void update() {
        System.out.println("A wild event appears!");
        System.out.println("Sending SMS to: ");
        showPhones();
    }
}
