/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.crud;

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
public class Borrar {

    Consultar consultas;
    Empleados empleado;
    Clientes cliente;
    Proveedores proveedor;
    Productos producto;
    Compras compra;
    Ventas venta;

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
     * Eliminar empleado a partir de su identificador
     *
     * @param idEmpleado Identificador interno del empleado
     */
    public void eliminarEmpleado(Integer idEmpleado) {
        consultas = new Consultar();
        //Obtener empleado
        empleado = consultas.obtenerEmpleadoSegunId(idEmpleado);

        //Acción de borrado
        iniciaOperacion();
        session.delete(empleado);
        terminaOperacion();
    }

    /**
     * Eliminar cliente a partir de su identificador
     *
     * @param idCliente Identificador interno del cliente
     */
    public void eliminarCliente(Integer idCliente) {
        consultas = new Consultar();
        //Obtener cliente
        cliente = consultas.obtenerClienteSegunId(idCliente);

        //Acción de borrado
        iniciaOperacion();
        session.delete(cliente);
        terminaOperacion();
    }

    /**
     * Eliminar proveedor a partir de su identificador
     *
     * @param idProveedor Identificador interno del proveedor
     */
    public void eliminarProveedor(Integer idProveedor) {
        consultas = new Consultar();
        //Obtener proveedor
        proveedor = consultas.obtenerProveedorSegunId(idProveedor);

        //Acción de borrado
        iniciaOperacion();
        session.delete(proveedor);
        terminaOperacion();
    }

    /**
     * Eliminar producto a partir de su identificador
     *
     * @param idProducto Identificador interno del producto
     */
    public void eliminarProducto(Integer idProducto) {
        consultas = new Consultar();
        //Obtener producto
        producto = consultas.obtenerProductoSegunId(idProducto);

        //Acción de borrado
        iniciaOperacion();
        session.delete(producto);
        terminaOperacion();
    }

    /**
     * Eliminar compra a partir de su identificador
     *
     * @param idCompra Identificador interno de la compra
     */
    public void eliminarCompra(Integer idCompra) {
        consultas = new Consultar();
        //Obtener compra
        compra = consultas.obtenerCompraSegunId(idCompra);

        //Acción de borrado
        iniciaOperacion();
        session.delete(compra);
        terminaOperacion();
    }

    /**
     * Eliminar venta a partir de su identificador
     *
     * @param idVenta Identificador interno de la venta
     */
    public void eliminarVenta(Integer idVenta) {
        consultas = new Consultar();
        //Obtener venta
        venta = consultas.obtenerVentaSegunId(idVenta);

        //Acción de borrado
        iniciaOperacion();
        session.delete(venta);
        terminaOperacion();
    }
}
