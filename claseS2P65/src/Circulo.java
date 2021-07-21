public class Circulo {
    //atributos
    private Integer radio;
    
    //constructor
    //El constructor es un método que tiene el mismo nombre de la clase
    //El constructor se ejecuta cuando se realiza la instancia
    public Circulo(Integer radio){
        this.radio = radio;
    }
    //métodos
    public float area(){
        return (float)(Math.PI*Math.pow(this.radio,2));
    }
    //getter
    public Integer getRadio() {
        return radio;
    }
    //setter
    public void setRadio(Integer radio) {
        this.radio = radio;
    }
    //método static

    public static float perimetro(int radio){
        return (float)(2*Math.PI*radio);
    }
     
}
