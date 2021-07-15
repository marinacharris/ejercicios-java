public class Camion extends Vehiculo implements CalculaCosto{
    private Integer numeroEjes;
    
    public Camion(String placa, String marca, Integer precio, Integer numeroEjes) {
        super(placa, marca, precio);
        this.numeroEjes = numeroEjes;
    }

    @Override
    public Integer calcularCosto(Integer factor) {
        Integer costo = this.precio + (factor*this.numeroEjes);
        return costo;
    }

    public Integer getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(Integer numeroEjes) {
        this.numeroEjes = numeroEjes;
    }


    
}
