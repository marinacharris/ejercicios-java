public class Auto extends Vehiculo implements CalculaCosto{
    private Integer numeroAirbags;

    public Auto(String placa, String marca, Integer precio, Integer numeroAirbags) {
        super(placa, marca, precio);
        this.numeroAirbags = numeroAirbags;
    }

    @Override
    public Integer calcularCosto(Integer factor) {
        Integer costo = this.precio + (factor*this.numeroAirbags);
        return costo;
    }

    public Integer getNumeroAirbags() {
        return numeroAirbags;
    }

    public void setNumeroAirbags(Integer numeroAirbags) {
        this.numeroAirbags = numeroAirbags;
    }
    

    

    
}
