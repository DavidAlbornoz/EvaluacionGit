public class Electrodomestico {
    private double precio_base=100;
    private String color="blanco";
    private String consumo_energetico="C";
    private double peso=5;

    public boolean comprobarConsumoEnergetico(String consumo_energetico){
        if(consumo_energetico=="A"||consumo_energetico=="B"||consumo_energetico=="C"){
            return true;
        }else return false;
    }
    public boolean comprobarColor(String color){
        if(color=="blanco"||color=="negro"||color=="rojo"){
            return true;
        }else return false;
    }
    public Electrodomestico() {
    }

    public Electrodomestico(double precio_base, double peso) {
        this.precio_base = precio_base;
        this.peso = peso;
    }

   /* public Electrodomestico(double precio_base, String color, String consumo_energetico, double peso) {
        this.precio_base = precio_base;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }

    */

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(comprobarColor(color)){
            this.color=color;
        }
    }

    public String getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(String consumo_energetico) {
        if(comprobarConsumoEnergetico(consumo_energetico))
        this.consumo_energetico = consumo_energetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return ("\t"+this.precio_base+"\t "+this.color+"\t\t\t "+this.consumo_energetico+"\t\t\t "+peso);
    }
}
