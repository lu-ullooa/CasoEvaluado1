/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1;
import javax.swing.JOptionPane;

/**
 *
 * @author lucianaulloa
 */
public class Cliente {
    private String nombreCliente = "";
    private int cedulaCliente = 0;
    private int telefonoCliente = 0;
    private int mesRentaCliente = 0;
    private CategoriaCliente categoria;

    public Cliente(String nombreCliente, int cedulaCliente, int telefonoCliente, int mesRentaCliente, CategoriaCliente categoria) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.telefonoCliente = telefonoCliente;
        this.mesRentaCliente = mesRentaCliente;
        this.categoria = categoria;
    }
    
    public String getNombreCliente() {
        JOptionPane.showInputDialog("nombre del cliente: ");
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCedulaCliente() {
        JOptionPane.showInputDialog("cédula del cliente: ");
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getTelefonoCliente() {
        JOptionPane.showInputDialog("teléfono del cliente: ");
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public int getMesRentaCliente() {
        String temporal = "";
        int mesRentaCliente = 0;
            
        temporal = JOptionPane.showInputDialog("mes de renta (1 al 12): ");
        mesRentaCliente = Integer.parseInt(temporal);
        
        switch (mesRentaCliente) {
            case 1:
                JOptionPane.showMessageDialog(null, "enero");
            case 2:
                JOptionPane.showMessageDialog(null, "febrero");
            case 3:
                JOptionPane.showMessageDialog(null, "marzo");
            case 4:
                JOptionPane.showMessageDialog(null, "abril");
            case 5:
                JOptionPane.showMessageDialog(null, "mayo");
            case 6:
                JOptionPane.showMessageDialog(null, "junio");
            case 7:
                JOptionPane.showMessageDialog(null, "julio");
            case 8:
                JOptionPane.showMessageDialog(null, "agosto");
            case 9:
                JOptionPane.showMessageDialog(null, "setiembre");
            case 10:
                JOptionPane.showMessageDialog(null, "octubre");
            case 11:
                JOptionPane.showMessageDialog(null, "noviembre");
            case 12:
                JOptionPane.showMessageDialog(null, "diciembre");
            case 13:
                JOptionPane.showMessageDialog(null, "invalido");
                break;
            default:
                throw new AssertionError();
        }
        
        do {  
            temporal = JOptionPane.showInputDialog("digite nuevamente el mes de renta (1 al 12): ");
            mesRentaCliente = Integer.parseInt(temporal);
        } while (mesRentaCliente <= 12 || mesRentaCliente > 1);
        return mesRentaCliente;
    }

    public void setMesRentaCliente(int mesRentaCliente) {
        this.mesRentaCliente = mesRentaCliente;
    }

    public CategoriaCliente getCategoria() {
        String temporal = "";
        int opcionCategoria = 0;
        
        temporal = JOptionPane.showInputDialog("1 - vip"+"\n"+"2 - regular");
        opcionCategoria = Integer.parseInt(temporal);
        
        switch (opcionCategoria) {
            case 1:
                setCategoria(CategoriaCliente.vip);
                break;
            case 2:
                setCategoria(CategoriaCliente.regular);
                break;
            default:
                throw new AssertionError();
        }
        return categoria;
    }

    public void setCategoria(CategoriaCliente categoria) {
        this.categoria = categoria;
    }
    
    
    
    
    
    
    
}
