import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Electrodomestico electrodomestico1= new Electrodomestico();
        electrodomestico1= new Electrodomestico(200, 10);

        Electrodomestico electrodomestico2 = new Electrodomestico();

        System.out.println("PrecioBase\t Color  ConsumoEnergetico\tPeso");
        System.out.println(electrodomestico1);
        System.out.println(electrodomestico2);
        //Cambios desde la interfaz web
        Television television1=new Television();
        System.out.println(television1);
    }
}
