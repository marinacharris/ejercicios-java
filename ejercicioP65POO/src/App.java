public class App {
    //empresa importa autos y camiones
    //placa, marca y precio
    //Costo = precioAuto + factorImpuesto*numeroAirbags --> autos
    //Costo = precioCamion + factorImpuesto*numeroEjes --> camión
    //PrecioTotal ->> Agregar IVA 19 %


    public static void main(String[] args) throws Exception {
        Auto auto1 = new Auto("GHJ556", "Nissan", 50000000, 4);
        //auto1.marca = "Chevrolet";
        System.out.println("Datos del auto:");
        System.out.println("Placa: "+auto1.placa);
        System.out.println("Marca: "+auto1.marca);
        System.out.println("Número de airbags: "+auto1.getNumeroAirbags());
        System.out.println("Costo: "+auto1.calcularCosto(2000));
        Integer costoIva = auto1.calcularCosto(2000)+auto1.calcularCosto(2000)*CalculaCosto.IVA/100;
        System.out.println("Costo mas iva: "+costoIva);

    }
}
