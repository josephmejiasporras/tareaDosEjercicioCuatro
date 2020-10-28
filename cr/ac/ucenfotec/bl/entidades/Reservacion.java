/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.ac.ucenfotec.bl.entidades;

import java.time.LocalDate;
import java.util.Objects;


public class Reservacion {
    
    private String nombreMascota;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nombreMascota);
        hash = 31 * hash + Objects.hashCode(this.fechaEntrada);
        hash = 31 * hash + Objects.hashCode(this.fechaSalida);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reservacion other = (Reservacion) obj;
        if (!Objects.equals(this.nombreMascota, other.nombreMascota)) {
            return false;
        }
        if (!Objects.equals(this.fechaEntrada, other.fechaEntrada)) {
            return false;
        }
        if (!Objects.equals(this.fechaSalida, other.fechaSalida)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reservacion{" + "nombreMascota=" + nombreMascota + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + '}';
    }

    public Reservacion() {
    }

    public Reservacion(String nombreMascota, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.nombreMascota = nombreMascota;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    /**
     * @return the nombreMascota
     */
    public String getNombreMascota() {
        return nombreMascota;
    }

    /**
     * @param nombreMascota the nombreMascota to set
     */
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    /**
     * @return the fechaEntrada
     */
    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * @param fechaEntrada the fechaEntrada to set
     */
    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    /**
     * @return the fechaSalida
     */
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

}
