/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sysambiente.entidadeddenegocio;

/**
 *
 * @author MINEDUCYT
 */

// JOEL CREO LA ENTIDAD BOLETO
public class Boleto
{
    private int id;
    private int idInscripcion;
    private int idEvento;    
    private int top_aux;
    private Inscripcion inscripcion;
    private Evento evento;

    public Boleto() {
    }

    public Boleto(int id, int idInscripcion, int idEvento, int top_aux, Inscripcion inscripcion, Evento evento) {
        this.id = id;
        this.idInscripcion = idInscripcion;
        this.idEvento = idEvento;
        this.top_aux = top_aux;
        this.inscripcion = inscripcion;
        this.evento = evento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public int getTop_aux() {
        return top_aux;
    }

    public void setTop_aux(int top_aux) {
        this.top_aux = top_aux;
    }

    public Inscripcion getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    
    
}
