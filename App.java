public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Carro carro1 = new Carro(); // instancia
        carro1.establecerAtributos("Rojo", "Chevrolet", 2020);
        //carro1.color = "Rojo";
        //carro1.marca = "Chevrolet";
        //carro1.modelo = 2020;
        System.out.println("El carro es marca "+ carro1.marca);
        System.out.println("El carro es de color " + carro1.color);
        System.out.println("El carro es modelo " + carro1.modelo);
        carro1.frenar();
        carro1.acelerar();

        Circulo circulo1 = new Circulo();//instancia
        circulo1.radio = 5;
        float resultado = circulo1.area();
        System.out.println("El área es "+ resultado);

        Login marina1 = new Login();
        marina1.nombreusuario = "marinaCh";
        marina1.saludar();
        marina1.setClave("123");
        System.out.println("La clave es "+ marina1.getClave());


    }
}
class Carro{ // Los nombres de las clases deben comenzar en mayúscula
    //atributos
    //inician cn minúscula
    String color;
    String marca;
    Integer modelo;

    void establecerAtributos(String color, String marca, Integer modelo){
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }
    void acelerar(){ //los métodos son acciones (verbos), inician en minúscula
        System.out.println("El carro está acelerando");
    }
    void frenar(){
        System.out.println("El carro se encuentra frenado");
    }

}


class Circulo{
    float radio;
    private final float pi = 3.1416f; //Las constantes deben ser nombradas con mayúsculas sostenidas.

    float area(){
        return pi * (float)Math.pow(this.radio, 2);
    }
}

class Login{
    public String nombreusuario;
    private String clave;

    public void saludar(){
        System.out.println("El nombre de usuarios es: "+ nombreusuario);
    }

    
    public String getClave() { //getter 
        return this.clave;
    }

    public void setClave(String clave) { //setter
        this.clave = clave;
    }
    

}


