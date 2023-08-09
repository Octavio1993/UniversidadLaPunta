package carreramortal;

public class Auto {
    private String color;
    private String patente;
    private double combustible = 50;
    
    public Auto(String color, String patente){
        this.color = color;
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
    
    public void avanzar(double metros){
        double consume = metros/10;
        
        if(this.combustible >= consume){
            System.out.println("Avanzando: "+ metros+ " metros");
            this.combustible = this.combustible - consume;
        }else{
            System.out.println("No hay suficiente combustible para avanzar");
        }
    }
    
    public void retroceder(double metros){
        double consume = metros/10;
        
        if(this.combustible >= consume){
            System.out.println("Retrocediendo: "+ metros+ " metros");
            this.combustible = this.combustible - consume;
        }else{
            System.out.println("No hay suficiente combustible para retroceder");
        }
    }
    
    public void llenarTanque(){
        this.combustible = 50;
    }
}
