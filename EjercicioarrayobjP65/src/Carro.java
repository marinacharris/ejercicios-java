public class Carro {
    private String marca;
    private Integer precio;
    public Carro(String marca, Integer precio) {
        this.marca = marca;
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
}
