package vehiculos;

import javax.swing.*;
import java.util.ArrayList;

public class Vehiculo {
    String placa;
    int puertas;
    int velocidadMaxima;
    String nombre;
    int precio;
    int peso;
    String traccion;
    Fabricante fabricante;
    static int CantidadVehiculos;
    public  ArrayList cantidadporPais;
    public Vehiculo(String placa,int puertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion,Fabricante fabricante){
        CantidadVehiculos++;
        this.placa =placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre =nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion =traccion;
        this.fabricante = fabricante;
        if (cantidadporPais.contains(fabricante.pais)){

        }
    }
    public String vehiculoPorTipo(){
    return "Automoviles: "+getCantidadVehiculos()+"/n"+"Camionetas: "+Camioneta.getCantidadCamionetas()+"/n"+"Camiones: "+Camion.getCantidadCamiones();
    }

    public String getPlaca() {
        return placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getPeso() {
        return peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }
}
