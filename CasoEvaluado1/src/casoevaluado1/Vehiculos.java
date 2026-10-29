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
public class Vehiculos {
    private String placaVehiculo = "";
    private String marcaVehiculo = "";
    private double precioBaseVehiculo = 0;
    private int diasAlquilerVehiculo = 0;
    private CategoriaVehiculo categoria;
    private double subtotal = 0;
    private int puntosGanados = 0;
    private double costoBase = 0;
       
    public Vehiculos(String placaVehiculo, String marcaVehiculo, double precioBaseVehiculo, int diasAlquilerVehiculo, CategoriaVehiculo categoria) {
        this.placaVehiculo = placaVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.precioBaseVehiculo = precioBaseVehiculo;
        this.diasAlquilerVehiculo = diasAlquilerVehiculo;
        this.categoria = categoria;
    }
   
    public String getPlacaVehiculo() {
        JOptionPane.showInputDialog("placa del vehículo: ");
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getMarcaVehiculo() {
        JOptionPane.showInputDialog("marca del vehículo: ");
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public double getPrecioBaseVehiculo() {
        JOptionPane.showInputDialog("precio base por día del vehículo: ");
        return precioBaseVehiculo;
    }

    public void setPrecioBaseVehiculo(double precioBaseVehiculo) {
        this.precioBaseVehiculo = precioBaseVehiculo;
    }

    public int getDiasAlquilerVehiculo(int DiasAlquilerVehiculo) {
        do {   
            JOptionPane.showInputDialog("cantidad de días que alquila el vehículo: ");
            if (DiasAlquilerVehiculo < 0) {
            JOptionPane.showInputDialog(null, "ingrese la cantidad de días que alquila el vehículo:");         
        }
        } while (DiasAlquilerVehiculo > 0);
        
        if (DiasAlquilerVehiculo > 7) {
            costoBase = precioBaseVehiculo * diasAlquilerVehiculo;
            puntosGanados = puntosGanados + 5;  
        }    
        return diasAlquilerVehiculo;
    }

    public void setDiasAlquilerVehiculo(int diasAlquilerVehiculo) {
        this.diasAlquilerVehiculo = diasAlquilerVehiculo;
    }

    public CategoriaVehiculo getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaVehiculo categoria) {
        this.categoria = categoria;
    }
    
    
   
}

