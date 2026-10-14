/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jesusviloria.imc.rmi.lib;
import java.rmi.RemoteException;

/**
 *
 * @author jesusviloria
 */
public interface IRemotaCalculoImc {
    
    public DatosImc calcularImc(DatosImc data);
    
}
