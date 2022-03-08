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
public class ObserverSenderEmail extends Observer {
    private List<String> emails = new ArrayList<>();
    
    public ObserverSenderEmail(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }
    
    public void showEmails() {
        for (String email: emails) {
            System.out.println(email);
        }
    }
    
    public void addEmail(String email) {
        emails.add(email);
    }
    
    public void update() {
        System.out.println("A wild event appears!");
        System.out.println("Sending e-mails to: ");
        showEmails();
    }
}
