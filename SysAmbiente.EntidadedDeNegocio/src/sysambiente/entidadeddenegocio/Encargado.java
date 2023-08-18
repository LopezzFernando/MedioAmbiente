/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sysambiente.entidadeddenegocio;

/**
 *
 * @author MINEDUCYT
 */
// JAIR  CREO LA ENTIDAD ENCARGADO

public class Encargado
{
    private int id;
    private int idUsuario;
    private String telefono;
    private int top_aux;
    private Usuario usuario;

    public Encargado() {
    }

    public Encargado(int id, int idUsuario, String telefono, int top_aux, Usuario usuario) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.telefono = telefono;
        this.top_aux = top_aux;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getTop_aux() {
        return top_aux;
    }

    public void setTop_aux(int top_aux) {
        this.top_aux = top_aux;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
