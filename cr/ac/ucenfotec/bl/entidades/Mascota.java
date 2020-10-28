/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.ac.ucenfotec.bl.entidades;

import java.util.ArrayList;
import java.util.Objects;


public class Mascota {
    
    private String nombre;
    private String foto;
    private ArrayList<String> observaciones = new ArrayList<>();
    private int ranking;
    private Duenio duenio;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    /**
     * @return the observaciones
     */
    public ArrayList<String> getObservaciones() {
        return observaciones;
    }
     public void verObservaciones() {
        for(String string: observaciones){
            System.out.println(string + "\n");
        }
    }

    /**
     */
    public void setObservaciones(String observacion) {
        
        observaciones.add(observacion);
    }

    /**
     * @return the ranking
     */
    public int getRanking() {
        return ranking;
    }

    /**
     * @param ranking the ranking to set
     */
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    /**
     * @return the duenio
     */
    public Duenio getDuenio() {
        return duenio;
    }

    public Mascota(String nombre, String foto, int ranking, Duenio duenio) {
        this.nombre = nombre;
        this.foto = foto;
        this.ranking = ranking;
        this.duenio = new Duenio();
    }

    public Mascota() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.foto);
        hash = 79 * hash + Objects.hashCode(this.observaciones);
        hash = 79 * hash + this.ranking;
        hash = 79 * hash + Objects.hashCode(this.duenio);
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
        final Mascota other = (Mascota) obj;
        if (this.ranking != other.ranking) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.foto, other.foto)) {
            return false;
        }
        if (!Objects.equals(this.observaciones, other.observaciones)) {
            return false;
        }
        if (!Objects.equals(this.duenio, other.duenio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", foto=" + foto + ", observaciones=" + observaciones + ", ranking=" + ranking + ", duenio=" + duenio + '}';
    }

    
    
    

}
