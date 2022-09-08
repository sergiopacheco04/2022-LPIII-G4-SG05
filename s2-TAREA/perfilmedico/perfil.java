/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perfilmedico;
public class perfil {
	private String a;
    private String b;
    private String c;
    private int d;
    private int e;
    private int f;
    private double g;
    private double h;

    public perfil() {
        this.a = " ";
        this.b = " ";
        this.c = " ";
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0.0;
    }
    public perfil(String a, String b, String c, int d, int e, int f, double g, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    public void seta(String a){
        this.a = a;
    }
    public String geta(){
        return a;
    }
    public void setb(String b){
        this.b = b;
    }
    public String getb(){
        return b;
    }
    public void setc(String c){
        this.c = c;
    }
    public String getc(){
        return c;
    }
    public void setd(int d){
        this.d = d;
    }
    public int getd(){
        return d;
    }
    public void sete(int e){
        this.e = e;
    }
    public int gete(){
        return e;
    }
    public void setf(int f){
        this.f = f;
    }
    public int getf(){
        return f;
    }
    public void setg(double g){
        this.g = g;
    }
    public double getg(){
        return g;
    }
    public void seth(double h){
        this.h = h;
    }
    public double geth(){
        return h;
    }
    public void fechaNacimiento(){
        String FN;
        FN = d+"/"+e+"/"+f;
        System.out.println(FN);
    }
    @Override
    public String toString() {
        return ("Nombre: "+a+"\nApellido: "+b+"\nFecha: "+d+"/"+e+"/"+f+"\nAltura: "+g+"\nPeso: "+h);
    }
    public int edad(){
        int añoActual = 2022;
        int edad;
        edad = añoActual - f;
        //System.out.println("Tiene "+edad+" años");
        return edad;
    }
    public void frecuenciaCardiacaMax(){
        double FCM;
        FCM = 208- 0.7* edad();
        System.out.println("Frecuencia Cardiada Maxima: "+FCM);
    }
    public void IMC(){
        double imc;
        imc = h/g;
        System.out.println("IMC: "+imc);
    }
}