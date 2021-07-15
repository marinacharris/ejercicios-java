public class Total {
    private Carro[] carros;

    public Total(Carro[] carros) {
        this.carros = carros;
    }

    public Integer totalizar(){
        Integer acumulador = 0;
        for (int i = 0; i<this.carros.length; i++){
            acumulador +=this.carros[i].getPrecio();
        }
        return acumulador;

    }

    public Carro[] getCarros() {
        return carros;
    }

    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }
    

    
}
