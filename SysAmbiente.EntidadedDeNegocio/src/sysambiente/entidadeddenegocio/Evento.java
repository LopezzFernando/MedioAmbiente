/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sysambiente.entidadeddenegocio;

/**
 *
 * @author MINEDUCYT
 */
// EMERSON CREO LA ENTIDAD EVENTO

import java.time.LocalDate;
public class Evento
{
    private int id;
    private int idEncargado;
    private String nombre;
    private String descripcion;
    private String ubicacion;
    private LocalDate Fecha;
    private  byte estado;
    private int top_aux;
    private Encargado encargado;

    public Evento() {
    }

    public Evento(int id, int idEncargado, String nombre, String descripcion, String ubicacion, LocalDate Fecha, byte estado, int top_aux, Encargado encargado) {
        this.id = id;
        this.idEncargado = idEncargado;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.Fecha = Fecha;
        this.estado = estado;
        this.top_aux = top_aux;
        this.encargado = encargado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(int idEncargado) {
        this.idEncargado = idEncargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    public int getTop_aux() {
        return top_aux;
    }

    public void setTop_aux(int top_aux) {
        this.top_aux = top_aux;
    }

    public Encargado getEncargado() {
        return encargado;
    }

    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }
    
    
    
    
}
