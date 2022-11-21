public class Main {
    public static void main(String[] args) {
        Bombilla bombilla1 = new Bombilla(50, "amarilla", 10);
        System.out.println(bombilla1.ver_estado());
        bombilla1.encender();
        System.out.println(bombilla1.ver_estado());
    }
}