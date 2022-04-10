/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocialNetworkProject;

/**
 *
 * @author maumneto
 */
public class LinkedInNetwork extends SocialNetwork {

    public LinkedInNetwork(String username, String password) {
        this.password = password;
        this.username = username;
    }
    
    
    public boolean login(String username, String password) {
        System.out.println("Name: " + this.username);
        System.out.print("Senha: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        if (this.username.equals("admin") && this.password.equals("admin123")){
            System.out.println("\nLogin realizado com sucesso!");
            return true;
        } else {
            return false;
        }

    }

    public boolean sendData(byte[] data) {
        boolean isSend = true;
        if (isSend) {
            System.out.println("Mensagem: " + new String(data) + " foi postada no LinkedIn!");
            return true;
        } else {
            return false;
        }
    }

    public void logout() {
        System.out.println("Usuário: " + username + " foi desconectado do LinkedIn!");
    }
}
