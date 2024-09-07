/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YorkSeveriche.seminario.imc.rmi.net;

import YorkSeveriche.seminario.imc.rmi.lib.IRemotaCalculoImc;
import YorkSeveriche.seminario.imc.rmi.lib.DatosImc;
/**
 *
 * @author York Severiche
 */
public class CalculoRmiImcImplem implements IRemotaCalculoImc{

    private DatosImc datos;

    public CalculoRmiImcImplem() {
    }
    
    @Override
    public DatosImc calcularImc(DatosImc datos) {
        
        float resultado = 0;
        
        if(datos.getPeso() <= 0 || datos.getAltura() <= 0){
            datos.setInterpretación("ERROR: El peso y la altura deben ser mayor 0");
            return datos;
        }else{
            resultado = datos.getPeso() / (datos.getAltura() * datos.getAltura());
            datos.setResultado(resultado);
            if(resultado < 18.5) {
                datos.setInterpretación("Debes consultar un Medico, tu peso es muy bajo");
            }else if(resultado >= 18.5 && resultado <= 24.9){
                datos.setInterpretación("Estas bien de peso");
            }else if(resultado > 24.9 && resultado <= 29.9){
                datos.setInterpretación("Debes bajar un poco de peso");
            }else {
                datos.setInterpretación("Debes consultar un Medico, tu peso es muy alto");
            }
            return datos;
        }
    }
    
}
