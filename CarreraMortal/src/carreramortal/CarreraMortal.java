package carreramortal;

public class CarreraMortal {
    
    public static void main(String[] args) {
        Auto miAuto = new Auto("gris","KTH337");
        
        miAuto.avanzar(20);
        System.out.println(miAuto.getCombustible()); //muestro la cantidad de combustible que tengo
        
        miAuto.retroceder(30);
        
        double combustibleActual = miAuto.getCombustible();
        
        System.out.println("Combustible disponible en tanque: "+combustibleActual+ " L");
        
        miAuto.llenarTanque();
        System.out.println(miAuto.getCombustible());
        
        miAuto.avanzar(500);
        System.out.println(miAuto.getCombustible());
        miAuto.avanzar(1);
    }
    
}
