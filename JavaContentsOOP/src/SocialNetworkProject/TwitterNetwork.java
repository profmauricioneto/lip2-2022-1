/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocialNetworkProject;

/**
 *
 * @author maumneto
 */
public class TwitterNetwork extends SocialNetwork {

    public TwitterNetwork(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) {
        System.out.println("Name: " + this.username);
        System.out.print("Senha: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        System.out.println("\nLogin realizado com sucesso!");
        return true;
    }

    public boolean sendData(byte[] data) {
        boolean message = true;
        if (message) {
            System.out.println("Mensagem: " + new String(data) + " foi postada no twitter!");
            return true;
        } else {
            return false;
        }
    }

    public void logout() {
        System.out.println("Usuário: " + username + " foi desconectado do twitter!");
    }
}
