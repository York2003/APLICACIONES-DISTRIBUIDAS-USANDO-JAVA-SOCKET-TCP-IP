/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YorkSeveriche.seminario.imc.rmi.lib;

import java.io.Serializable;

/**
 *
 * @author York Severiche
 */
public class DatosImc implements Serializable{
    
    private float peso;
    private float altura;
    private float resultado;
    private String interpretación;

    public DatosImc() {
    }

    public DatosImc(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public String getInterpretación() {
        return interpretación;
    }

    public void setInterpretación(String interpretación) {
        this.interpretación = interpretación;
    }
    
    
}
