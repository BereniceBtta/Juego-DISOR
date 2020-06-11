/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import java.io.Serializable;
import java.util.Random;
import javax.annotation.ManagedBean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author BereniceAnaya
 */
@Named(value = "numero")
@ManagedBean 
@SessionScoped
public class Numero implements Serializable {

    private int numero_adivinar;
    private int numero;
    private String mensaje = "";
    private int minimo;
    private int maximo;
    private int intentos;

    /**
     * Creates a new instance of Numero
     */
    public Numero(){
        
    }
    
    public String validacion(){
        String valor="";
        numero = (int)Math.floor(Math.random()*(minimo-maximo+1)+maximo); //AQUÍ SE GENERA UN NUEVO VALOR EN CADA JUEGO, ES DECIR CADA VEZ QUE
                                                                          //REGRESAS A LA PÁGINA DE CONFIGURACIÓN
       return valor = minimo>=maximo ? "El mínimo es más grande" : "Continua";
    }

    public void mensajeCorrecion() {
        //numero = (int)Math.floor(Math.random()*(minimo-maximo+1)+maximo); //AQUÍ SE GENERA UN NUEVO VALOR CADA VEZ QUE PRESIONAS EL BOTÓN ACEPTAR 
        System.out.println(""+numero);
        if(intentos != 0){
        if (numero_adivinar > numero) {
            mensaje = (" El numero es menor ");
            intentos--;
        } else if (numero_adivinar < numero) {
            mensaje = (" El numero es mayor ");
            intentos--;
        }else {
             mensaje = " ACERTASTE C: ";  
        }}else if(intentos==0)
         mensaje = " SIN INTENTOS :C ";
    }

    public void valores(int min,int max){
        this.setMinimo(min);
        this.setMaximo(max);
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMensaje() {
        return mensaje;
    }

    public int getNumero_adivinar() {
        return numero_adivinar;
    }

    public void setNumero_adivinar(int numero_adivinar) {
        this.numero_adivinar = numero_adivinar;
    }
    
    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
}