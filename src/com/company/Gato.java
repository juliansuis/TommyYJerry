package com.company;

import java.util.List;

public class Gato {
    private String nombre;
    private Double cantidadDeEnergia = 0.0;
    private Integer velocidad = 5;

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    public void comerRaton (Raton unRaton) {
        cantidadDeEnergia += unRaton.getPeso();
    }

    public void comerRatones(List<Raton> ratones) {
        for (Raton unRaton: ratones) {
            cantidadDeEnergia += unRaton.getPeso();
        }
    }

    public Double correr(Integer cantidadMetros) {
        cantidadDeEnergia -= 0.5 * cantidadMetros;
        return cantidadMetros.doubleValue() / velocidad;
    }

    public Boolean meConvieneComer(Raton unRaton, Integer unaDistancia) {
        return unRaton.getPeso() >= unaDistancia/2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCantidadDeEnergia() {
        return cantidadDeEnergia;
    }

    public Integer getVelocidad() {
        return velocidad;
    }
}
