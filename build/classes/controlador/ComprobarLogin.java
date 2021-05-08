/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.crud.Consultar;
import java.util.HashMap;
import modelo.Empleados;

/**
 * Comparación de credenciales introducidos en el login
 * @author admin
 */
public class ComprobarLogin {

    Consultar operaciones;

    /**
     * Validación de usuario y contraseña
     * @param nombreUsuario
     * @param contrasenha
     * Se comprueban los credenciales y se comparan los datos introducidos con los ya almacenados en la base de datos
     * Retorna verdadero si los credenciales introducidos son correctos
     */
    public boolean validarCredenciales(String nombreUsuario, String contrasenha) {
        Empleados empleado = null;
        operaciones = new Consultar();
        //Clave-valor del usuario introducido
        HashMap<String, String> usuarioIntroducido = new HashMap<String, String>();
        usuarioIntroducido.put(nombreUsuario, contrasenha);

        try {
            //Creación de un nuevo empleado a partir del usuario introducido
            empleado = operaciones.obtenerEmpleado(nombreUsuario);
            //Clave valor del usuario original
            //El usuario original se obtiene a partir del nombre de usuario introducido
            HashMap<String, String> usuarioOriginal = new HashMap<String, String>();
            usuarioOriginal.put(empleado.getNombreUsuario(), empleado.getContrasenha());

            //Si los credenciales introducidos son iguales a los almacenados
            if (usuarioIntroducido.equals(usuarioOriginal)) {
                return true;
            }
            //Si el empleado no existe, se trata la excepción lanzada en este caso
        } catch (NullPointerException npe) {
            System.err.println("Empleado no existente");
        }
        return false;
    }
}
