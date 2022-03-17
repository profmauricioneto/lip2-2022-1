/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class7.exercicio4;

import java.util.Calendar;

/**
 *
 * @author maumneto
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data() {}
    
    public static String escreverData() {
        String data = "";
        Calendar c = Calendar.getInstance();
        StringBuilder dataFormat = new StringBuilder();
        dataFormat.append(c.get(Calendar.DAY_OF_MONTH));
        dataFormat.append("/");
        dataFormat.append(c.get(Calendar.MONTH));
        dataFormat.append("/");
        dataFormat.append(c.get(Calendar.YEAR));
        data = dataFormat.toString();
        return data;
    }
}
