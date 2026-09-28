/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jesusviloria.calpin.rmi.lib;
import java.rmi.RemoteException;

/**
 *
 * @author jesusviloria
 */
public interface IRemotaCalPin {
    
    public DatosCalPin calcularPintura(DatosCalPin data) throws RemoteException;
    
}
