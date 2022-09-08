/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perro;

/**
 *
 * @author Cesar
 */
public class perro {
    private String raza;
    private String color;
    private double temp;
    private int edad;
    private double peso;
    
    public perro() {
        this.raza="chusco";
        this.color = "gris";
        this.temp = 37;
        this.edad = 1;
        this.peso = 2;
}
    public perro(String raza, String color) {
        this.raza = raza;
        this.color = color;
        this.temp = 37;
        this.edad = 1;
        this.peso = 6;
    }



   public String getRaza() {
        return raza;
    }



   public String getColor() {
        return color;
    }
   public double getTemp() {
       return temp;
   }



  public int getEdad() {
       return edad;
   }



  public void setRaza(String raza) {
       this.raza = raza;
   }



  public void setColor(String color) {
       this.color = color;
   }



  public void setTemp(double temp) {
       this.temp = temp;
   }



  public void setEdad(int edad) {
       this.edad = edad;
   }
  
  public double getPeso() {
      return peso;
  }



 public void setPeso(double peso) {
      this.peso = peso;
  }
  


  @Override
   public String toString() {
       return "raza=" + raza + ", color=" + color + ", temp=" + temp + ", edad=" + edad + ", peso=" + peso;
   }
   
       
   
   public void ladrar(){
       System.out.println("Guau Guau");
    }
   public void dormir(){
       System.out.println("zzz zzzz");
    }
   public void comer(){
       System.out.println("pka pka");
    }
   public void increEdad(int anios){
       this.edad = this.edad + anios;
       cambiarPeso(anios);
    }
   private void cambiarPeso(int anios){
       this.peso = this.peso + (anios * 1.5);
    }
}