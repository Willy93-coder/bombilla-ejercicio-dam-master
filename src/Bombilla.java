import java.util.Scanner;

public class Bombilla {
    // Atributos
    private boolean estado;
    private int potencia;
    private String color;
    private float horas;

    // Constructores

    public Bombilla() {
    }

    public Bombilla(int potencia, String color) {
        this.estado = false;
        this.potencia = potencia;
        this.color = color;
        this.horas = 10;
    }
    public Bombilla(int potencia, String color, float horas) {
        this.estado = false;
        this.potencia = potencia;
        this.color = color;
        this.horas = horas;
    }

    // Getters y Setters
    public boolean ver_estado() {
        return estado;
    }

    public void setEstado() {
        this.estado = !this.estado;
    }

    public int ver_potencia() {
        return potencia;
    }

    public void cambia_potencia(int potencia) {
        this.potencia = potencia;
    }

    public String ver_color() {
        return color;
    }

    public void cambia_color(String color) {
        if(!estado){
            apagar();
            this.color = color;
            System.out.println("La bombilla ha cambiado al color " + this.color);
        } else {
            System.out.println("La bombilla ha cambiado al color " + this.color);
        }
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    // Método encender
    public void encender(){
        Scanner sc = new Scanner(System.in);
        if (this.horas > 0) {
            setEstado();
            System.out.println("La bombilla tiene un máximo de " + this.horas);
            System.out.println("¿Cuanto tiempo estara encendida la bombilla?");
            float horasUsuario = sc.nextFloat();
            float horasRestantes = this.horas - horasUsuario;
            if (horasRestantes < 0) {
                System.out.println("Necesitarás recargar la bombilla");
            } else {
                System.out.println("La bombilla se ha encendido");
                System.out.println("A la bombilla le quedan " + horasRestantes + " hora(s) de energia.");
            }
        }
    }

    // Método apagar
    public void apagar() {
        if (!this.estado){
            setEstado();
            System.out.println("La bombilla se ha apagado.");
        } else {
            System.out.println("La bombilla está apagada");
        }
    }

    // Método recargar
    public void recargar(){
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cuantas horas quieres recargar la bombilla?");
        float horasRecargarBombilla = lector.nextFloat();
        float horasBombilla = getHoras();
        float totalHorasBombilla = horasBombilla + horasRecargarBombilla;
        System.out.println("El total de horas de tu bombilla es de " + totalHorasBombilla);
    }

}
