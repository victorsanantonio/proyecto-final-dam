/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.crud;

import java.util.Date;
import modelo.Clientes;
import modelo.Compras;
import modelo.Empleados;
import modelo.Productos;
import modelo.Proveedores;
import modelo.Ventas;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author admin
 */
public class Modificar {

    private Session session;

    /**
     * Iniciar transacción Hibernate
     */
    private void iniciaOperacion() {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        session.getTransaction().begin();
    }

    /**
     * Terminar transacción Hibernate
     */
    private void terminaOperacion() {
        session.getTransaction().commit();
        session.close();
    }

    /**
     * Modificación de empleado
     *
     * @param id
     * @param nombre
     * @param apellidos
     * @param dni
     * @param fechaNac
     * @param telefono
     * @param direccion
     * @param codPostal
     * @param puesto
     * @param departamentos
     * @param salario
     * @param sexo
     * @param imagen
     * @param usuario
     * @param contrasenha
     * @param rol
     * @param fechaAlta
     */
    public void modificarEmpleado(Integer id, String nombre, String apellidos, String dni, Date fechaNac, String telefono, String direccion, Integer codPostal, String puesto, String departamentos, Float salario, Boolean sexo, byte[] imagen, String usuario, String contrasenha, String rol, Date fechaAlta) {
        iniciaOperacion();
        //Creación del objeto empleado
        Empleados empleado = new Empleados(nombre, apellidos, dni, fechaNac, telefono, direccion, codPostal, puesto, departamentos, salario, sexo, imagen, usuario, contrasenha, rol, fechaAlta, null, null);
        //Establecer el id del empleado que se pretende modificar
        empleado.setIdEmpleado(id);
        //Actualización de datos del objeto empleado
        session.update(empleado);
        terminaOperacion();
    }

    /**
     * Modificación de cliente
     *
     * @param id
     * @param nombre
     * @param dni
     * @param telefono
     * @param direccion
     * @param ciudad
     * @param codPostal
     * @param imagen
     */
    public void modificarCliente(Integer id, String nombre, String dni, Integer telefono, String direccion, String ciudad, Integer codPostal, byte[] imagen) {
        iniciaOperacion();
        //Creación del objeto cliente
        Clientes cliente = new Clientes(nombre, dni, telefono, direccion, ciudad, codPostal, imagen, null);
        //Establecer el id del cliente que se pretende modificar
        cliente.setIdCliente(id);
        //Actualización de datos del objeto cliente
        session.update(cliente);
        terminaOperacion();
    }

    /**
     * Modificación de proveedor
     *
     * @param id
     * @param nombre
     * @param dni
     * @param direccion
     * @param ciudad
     * @param codPostal
     * @param imagen
     * @param valoracion
     * @param categoria
     * @param web
     * @param email
     */
    public void modificarProveedor(Integer id, String nombre, String dni, String direccion, String ciudad, Integer codPostal, byte[] imagen, Integer valoracion, String categoria, String web, String email) {
        iniciaOperacion();
        //Creación del objeto proveedor
        Proveedores proveedor = new Proveedores(nombre, dni, direccion, ciudad, codPostal, imagen, valoracion, categoria, web, email, null);
        //Establecer el id del proveedor que se pretende modificar
        proveedor.setIdProveedor(id);
        //Actualización de datos del objeto proveedor
        session.update(proveedor);
        terminaOperacion();
    }

    /**
     * Modificación de producto
     *
     * @param id
     * @param nombre
     * @param descripcion
     * @param unidades
     * @param precio
     * @param categoria
     * @param imagen
     */
    public void modificarProducto(Integer id, String nombre, String descripcion, Integer unidades, Float precio, String categoria, byte[] imagen) {
        iniciaOperacion();
        //Creación del objeto producto
        Productos producto = new Productos(null, null, nombre, descripcion, unidades, precio, categoria, imagen, null, null);
        //Establecer el id del producto que se pretende modificar
        producto.setIdProducto(id);
        //Actualización de datos del objeto producto
        session.update(producto);
        terminaOperacion();
    }

    public void modificarCompra(Integer id, Empleados empleado, Productos producto, Date fechaCompra, String nombreProveedor, Integer codPostal, Float total, Float totalIva) {
        iniciaOperacion();
        //Creación del objeto compra
        Compras compra = new Compras(empleado, producto, fechaCompra, nombreProveedor, codPostal, 0, total, totalIva);
        //Establecer el id de la compra que se pretende modificar
        compra.setIdCompra(id);
        //Actualización de datos del objeto compra
        session.update(compra);
        terminaOperacion();
    }
    
    public void modificarVenta(Integer id, Empleados empleado, Productos producto, Date fechaVenta, Float precio, String nombreCliente,String dniCliente, String ciudad, String direccion) {
        iniciaOperacion();
        //Cración del objeto producto a partir de los parámetros introducidos
        Ventas venta = new Ventas(empleado, producto, fechaVenta, precio, nombreCliente, dniCliente, ciudad, direccion);
        //Establecer el id de la venta que se pretende modificar
        venta.setIdVenta(id);
        //Guardado del objeto venta
        session.save(venta);
        terminaOperacion();
    }
}
