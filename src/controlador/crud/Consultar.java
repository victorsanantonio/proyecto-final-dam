/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.crud;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
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
 * Consultas para el listado de los elementos de la empresa
 *
 * @author admin
 */
public class Consultar {

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
     * Obtener un empleado determinado a partir de su nombre de usuario
     *
     * @param nombreUsuario Nombre de usuario introducido
     * @return
     */
    public Empleados obtenerEmpleado(String nombreUsuario) {
        //Creación de un empleado para su retorno
        Empleados empleado = null;
        //Definición de la lista de empleados
        List<Empleados> listaEmpleados = listarEmpleados();
        iniciaOperacion();
        int idEmpleado = 0;
        //Recorrer la lista de emplados
        for (int i = 0; i < listaEmpleados.size(); i++) {
            //Obtener el código cuando el nombre introducido sea igual que el nombre de la lista
            if (nombreUsuario.equals(listaEmpleados.get(i).getNombreUsuario())) {
                idEmpleado = listaEmpleados.get(i).getIdEmpleado();
            }
        }
        empleado = (Empleados) session.get(Empleados.class, idEmpleado);
        terminaOperacion();

        return empleado;
    }

    /**
     * Obtener un empleado determinado a partir de su identificador
     *
     * @param id identificador del empleado en la base de datos
     * @return
     */
    public Empleados obtenerEmpleadoSegunId(Integer id) {
        //Creación de un empleado para su retorno
        Empleados empleado = null;
        //Definición de la lista de empleados
        List<Empleados> listaEmpleados = listarEmpleados();
        iniciaOperacion();
        Integer idEmpleado = 0;
        //Recorrer la lista de emplados
        for (int i = 0; i < listaEmpleados.size(); i++) {
            //Obtener el código cuando el nombre introducido sea igual que el nombre de la lista
            if (id == (listaEmpleados.get(i).getIdEmpleado())) {
                idEmpleado = listaEmpleados.get(i).getIdEmpleado();
            }
        }
        empleado = (Empleados) session.get(Empleados.class, idEmpleado);
        terminaOperacion();
        return empleado;
    }

    /**
     * Obtener un cliente determinado a partir de su identificador
     *
     * @param id identificador del cliente en la base de datos
     * @return
     */
    public Clientes obtenerClienteSegunId(Integer id) {
        //Creación de un cliente para su retorno
        Clientes cliente = null;
        //Definición de la lista de clientes
        List<Clientes> listaClientes = listarClientes();
        iniciaOperacion();
        Integer idCliente = 0;
        //Recorrer la lista de clientes
        for (int i = 0; i < listaClientes.size(); i++) {
            //Obtener el código cuando el nombre introducido sea igual que el nombre de la lista
            if (id == (listaClientes.get(i).getIdCliente())) {
                idCliente = listaClientes.get(i).getIdCliente();
            }
        }
        cliente = (Clientes) session.get(Clientes.class, idCliente);
        terminaOperacion();
        return cliente;
    }

    /**
     * Obtener un proveedor determinado a partir de su identificador
     *
     * @param id identificador del proveedor en la base de datos
     * @return
     */
    public Proveedores obtenerProveedorSegunId(Integer id) {
        //Creación de un proveedor para su retorno
        Proveedores proveedor = null;
        //Definición de la lista de proveedores
        List<Proveedores> listaProveedores = listarProveedores();
        iniciaOperacion();
        Integer idProveedor = 0;
        //Recorrer la lista de proveedores
        for (int i = 0; i < listaProveedores.size(); i++) {
            //Obtener el código cuando el nombre introducido sea igual que el nombre de la lista
            if (id == (listaProveedores.get(i).getIdProveedor())) {
                idProveedor = listaProveedores.get(i).getIdProveedor();
            }
        }
        proveedor = (Proveedores) session.get(Proveedores.class, idProveedor);
        terminaOperacion();
        return proveedor;
    }

    /**
     * Obtener un proveedor determinado a partir de su identificador
     *
     * @param id identificador del producto en la base de datos
     * @return
     */
    public Productos obtenerProductoSegunId(Integer id) {
        //Creación de un producto para su retorno
        Productos producto = null;
        //Definición de la lista de productos
        List<Productos> listaProductos = listarProductos();
        iniciaOperacion();
        Integer idProducto = 0;
        //Recorrer la lista de productos
        for (int i = 0; i < listaProductos.size(); i++) {
            //Obtener el código cuando el nombre introducido sea igual que el nombre de la lista
            if (id == (listaProductos.get(i).getIdProducto())) {
                idProducto = listaProductos.get(i).getIdProducto();
            }
        }
        producto = (Productos) session.get(Productos.class, idProducto);
        terminaOperacion();
        return producto;
    }

    /**
     * Obtener una compra determinada a partir de su identificador
     *
     * @param id identificador de la compra en la base de datos
     * @return
     */
    public Compras obtenerCompraSegunId(Integer id) {
        //Creación de una compra para su retorno
        Compras compra = null;
        //Definición de la lista de compras
        List<Compras> listaCompras = listarCompras();
        iniciaOperacion();
        Integer idCompra = 0;
        //Recorrer la lista de compras
        for (int i = 0; i < listaCompras.size(); i++) {
            //Obtener el código cuando el nombre introducido sea igual que el nombre de la lista
            if (id == (listaCompras.get(i).getIdCompra())) {
                idCompra = listaCompras.get(i).getIdCompra();
            }
        }
        compra = (Compras) session.get(Compras.class, idCompra);
        terminaOperacion();
        return compra;
    }
    
    /**
     * Obtener una venta determinada a partir de su identificador
     *
     * @param id identificador de la venta en la base de datos
     * @return
     */
    public Ventas obtenerVentaSegunId(Integer id) {
        //Creación de una venta para su retorno
        Ventas venta = null;
        //Definición de la lista de venta
        List<Ventas> listaVentas = listarVentas();
        iniciaOperacion();
        Integer idVenta = 0;
        //Recorrer la lista de venta
        for (int i = 0; i < listaVentas.size(); i++) {
            //Obtener el código cuando el nombre introducido sea igual que el nombre de la lista
            if (id == (listaVentas.get(i).getIdVenta())) {
                idVenta = listaVentas.get(i).getIdVenta();
            }
        }
        venta = (Ventas) session.get(Ventas.class, idVenta);
        terminaOperacion();
        return venta;
    }

    /**
     * Listado de todos los empleados
     *
     * @return Lista de empleados
     */
    public List<Empleados> listarEmpleados() {
        List<Empleados> listaEmpleados = null;

        iniciaOperacion();
        listaEmpleados = session.createQuery("from Empleados").list();
        terminaOperacion();

        return listaEmpleados;
    }

    /**
     * Listado de todos los productos
     *
     * @return Lista de productos
     */
    public List<Productos> listarProductos() {
        List<Productos> listaProductos = null;

        iniciaOperacion();
        listaProductos = session.createQuery("from Productos").list();
        terminaOperacion();

        return listaProductos;
    }

    /**
     * Listado de todos los clientes
     *
     * @return Lista de clientes
     */
    public List<Clientes> listarClientes() {
        List<Clientes> listaClientes = null;

        iniciaOperacion();
        listaClientes = session.createQuery("from Clientes").list();
        terminaOperacion();

        return listaClientes;
    }

    /**
     * Listado de todas las compras
     *
     * @return Lista de compras
     */
    public List<Compras> listarCompras() {
        List<Compras> listaCompras = null;

        iniciaOperacion();
        listaCompras = session.createQuery("from Compras").list();
        terminaOperacion();

        return listaCompras;
    }

    /**
     * Listado de todas las ventas
     *
     * @return Lista de ventas
     */
    public List<Ventas> listarVentas() {
        List<Ventas> listaVentas = null;

        iniciaOperacion();
        listaVentas = session.createQuery("from Ventas").list();
        terminaOperacion();

        return listaVentas;
    }

    /**
     * Listado de todos los proveedores
     *
     * @return Lista de proveedores
     */
    public List<Proveedores> listarProveedores() {
        List<Proveedores> listaProveedores = null;

        iniciaOperacion();
        listaProveedores = session.createQuery("from Proveedores").list();
        terminaOperacion();

        return listaProveedores;
    }

    /**
     * Generación de modelo para su presentación en la capa de vista
     *
     * @return modelo
     */
    public DefaultListModel generarModeloListaEmpleados() {
        List<Empleados> listaEmpleados = listarEmpleados();
        DefaultListModel dlm = new DefaultListModel();
        Empleados e = null;
        //Recorremos la lista y agregamos los atributos que necesitemos mostrar
        for (int i = 0; i < listaEmpleados.size(); i++) {
            e = listaEmpleados.get(i);
            String s = e.getIdEmpleado() + " - ";
            s += e.getNombre() + " - ";
            s += e.getApellido() + " - ";
            s += e.getDni() + " - ";
            s += e.getTelefono() + " - ";
            s += e.getDireccion() + " - ";
            s += e.getCodPostal() + " - ";
            s += e.getPuesto() + " - ";
            s += e.getDepartamento() + " - ";
            s += e.getSalario();
            dlm.addElement(s);
        }
        return dlm;
    }

    /**
     * Generación de modelo para su presentación en la capa de vista
     *
     * @return modelo
     */
    public DefaultComboBoxModel generarModeloComboBoxEmpleados() {
        List<Empleados> listaEmpleados = listarEmpleados();
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        for (int i = 0; i < listaEmpleados.size(); i++) {
            dcbm.addElement(listaEmpleados.get(i).getNombre() + " " + listaEmpleados.get(i).getApellido());
        }
        return dcbm;
    }

    /**
     * Generación de modelo para su presentación en la capa de vista
     *
     * @return modelo
     */
    public DefaultListModel generarModeloListaClientes() {
        List<Clientes> listaClientes = listarClientes();
        DefaultListModel dlm = new DefaultListModel();
        Clientes c = null;
        //Recorremos la lista y agregamos los atributos que necesitemos mostrar
        for (int i = 0; i < listaClientes.size(); i++) {
            c = listaClientes.get(i);
            String s = c.getIdCliente() + " - ";
            s += c.getNombre() + " - ";
            s += c.getDni() + " - ";
            s += c.getTelefono() + " - ";
            s += c.getDireccion() + " - ";
            s += c.getCiudad() + " - ";
            s += c.getCodPostal();
            dlm.addElement(s);
        }
        return dlm;
    }
    
    /**
     * Generación de modelo para su presentación en la capa de vista
     *
     * @return modelo
     */
    public DefaultComboBoxModel generarModeloComboBoxClientes() {
        List<Clientes> listaClientes = listarClientes();
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        for (int i = 0; i < listaClientes.size(); i++) {
            dcbm.addElement(listaClientes.get(i).getIdCliente() + " - " + listaClientes.get(i).getNombre());
        }
        return dcbm;
    }

    /**
     * Generación de modelo para su presentación en la capa de vista
     *
     * @return modelo
     */
    public DefaultListModel generarModeloListaProveedores() {
        List<Proveedores> listaProveedores = listarProveedores();
        DefaultListModel dlm = new DefaultListModel();
        Proveedores p = null;
        //Recorremos la lista y agregamos los atributos que necesitemos mostrar
        for (int i = 0; i < listaProveedores.size(); i++) {
            p = listaProveedores.get(i);
            String s = p.getIdProveedor() + " - ";
            s += p.getNombre() + " - ";
            s += p.getDni() + " - ";
            s += p.getDireccion() + " - ";
            s += p.getCiudad() + " - ";
            s += p.getCodPostal();
            dlm.addElement(s);
        }
        return dlm;
    }

    /**
     * Generación de modelo para su presentación en la capa de vista
     *
     * @return modelo
     */
    public DefaultComboBoxModel generarModeloComboBoxProveedores() {
        List<Proveedores> listaProveedores = listarProveedores();
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        for (int i = 0; i < listaProveedores.size(); i++) {
            dcbm.addElement(listaProveedores.get(i).getNombre());
        }
        return dcbm;
    }

    /**
     * Generación de modelo para su presentación en la capa de vista
     *
     * @return modelo
     */
    public DefaultListModel generarModeloListaProductos() {
        List<Productos> listaProductos = listarProductos();
        DefaultListModel dlm = new DefaultListModel();
        Productos p = null;
        //Recorremos la lista y agregamos los atributos que necesitemos mostrar
        for (int i = 0; i < listaProductos.size(); i++) {
            p = listaProductos.get(i);
            String s = p.getIdProducto() + " - ";
            s += p.getNombre() + " - ";
            s += p.getCategoria() + " - ";
            s += p.getUnidades();
            dlm.addElement(s);
        }
        return dlm;
    }

    /**
     * Generación de modelo para su presentación en la capa de vista
     *
     * @return modelo
     */
    public DefaultComboBoxModel generarModeloComboBoxProductos() {
        List<Productos> listaProductos = listarProductos();
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        for (int i = 0; i < listaProductos.size(); i++) {
            dcbm.addElement(listaProductos.get(i).getIdProducto() + " - " + listaProductos.get(i).getNombre());
        }
        return dcbm;
    }

    /**
     * Generación de modelo para su presentación en la capa de vista
     *
     * @return modelo
     */
    public DefaultListModel generarModeloListaCompras() {
        List<Compras> listaCompras = listarCompras();
        DefaultListModel dlm = new DefaultListModel();
        Compras c = null;
        //Recorremos la lista y agregamos los atributos que necesitemos mostrar
        for (int i = 0; i < listaCompras.size(); i++) {
            c = listaCompras.get(i);
            String s = c.getIdCompra() + " - ";
            s += c.getNombreProveedor() + " - ";
            s += c.getFechaCompra() + " - ";
            s += c.getTotalIva();
            dlm.addElement(s);
        }
        return dlm;
    }
    
    /**
     * Generación de modelo para su presentación en la capa de vista
     *
     * @return modelo
     */
    public DefaultListModel generarModeloListaVentas() {
        List<Ventas> listaVentas = listarVentas();
        DefaultListModel dlm = new DefaultListModel();
        Ventas v = null;
        //Recorremos la lista y agregamos los atributos que necesitemos mostrar
        for (int i = 0; i < listaVentas.size(); i++) {
            v = listaVentas.get(i);
            String s = v.getIdVenta() + " - ";
            s += v.getNombreCliente()+ " - ";
            s += v.getFechaVenta() + " - ";
            s += v.getPrecio();
            dlm.addElement(s);
        }
        return dlm;
    }
}
