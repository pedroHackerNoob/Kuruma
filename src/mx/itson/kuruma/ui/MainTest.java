/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.kuruma.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.kuruma.entidades.Divisa;
import mx.itson.kuruma.entidades.Operacion;

/**
 *
 * @author pedro
 */
public class MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion cambio = new Operacion();
        List<Divisa> divisas = new ArrayList<>();
        //crear Divisas
        Divisa divisa1 = new Divisa();
        divisa1.setTipo("dolar");
        divisa1.setCambio(1.0);
        divisas.add(divisa1);
        
    }
    
}
