/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sysambiente.entidadeddenegocio;

/**
 *
 * @author MINEDUCYT
 */
// JOEL CREO LA ENTIDAD INSCRIPCION
public class Inscripcion
{
    private int id;
    private int idEvento;
    private String nombre;
    private String telefono;
    private int edad;
    private int top_aux;
    private Evento evento;

    public Inscripcion() {
    }

    public Inscripcion(int id, int idEvento, String nombre, String telefono, int edad, int top_aux, Evento evento) {
        this.id = id;
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.top_aux = top_aux;
        this.evento = evento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTop_aux() {
        return top_aux;
    }

    public void setTop_aux(int top_aux) {
        this.top_aux = top_aux;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    
    
    
}
