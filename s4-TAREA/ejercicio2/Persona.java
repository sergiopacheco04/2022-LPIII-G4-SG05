/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author Cesar
 */
public class Persona {
    private int sexo;
    private int trabaja;
    private int sueldo;

    public Persona(int sexo, int trabaja, int sueldo) {
        this.sexo = sexo;
        this.trabaja = trabaja;
        this.sueldo = sueldo;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(int trabaja) {
        this.trabaja = trabaja;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Persona{" + "sexo=" + sexo + ", trabaja=" + trabaja + ", sueldo=" + sueldo + '}';
    }
    
}
