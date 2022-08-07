public class Lavadora extends Electrodomestico {
    private double carga=5;

    public Lavadora() {
    }
    public Lavadora(double precio_base, double peso ){
     super(precio_base,peso);

    }
    public Lavadora(double precio_base, String color, String consumo_energetico, double peso, double carga){
     super();
     this.carga = carga;
    }
}
