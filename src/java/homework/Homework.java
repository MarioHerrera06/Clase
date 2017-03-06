/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author ingenieria
 */
public class Homework {
    private int id;
    private static int idCounter=1;
    private int nota;
    private String nombre;
    private String address;
    
    public Homework(int nota, String nombre,String address){
        this.address=address;
        this.nombre=nombre;
        this.nota=nota;
        this.id=idCounter;
                
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
