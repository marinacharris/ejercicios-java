public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //definición del arreglo
        int[] arreglo1 = new int[5];
        arreglo1[0] = 45;
        arreglo1[1] = 50;
        arreglo1[2] = 57;
        arreglo1[3] = 20;
        arreglo1[4] = 89;
        //recorridos
        //Length : longitud
        for (int i = 0; i<arreglo1.length;i++){
            System.out.println(arreglo1[i]);
        }
        for (int i:arreglo1){ //i es el valor de la posición, no es el índice
            System.out.println(i);
        }
        //arreglo de objetos
        Carro arregloObj[] = new Carro[4];
        arregloObj[0] = new Carro("Chevrolet", 65000000);
        arregloObj[1] = new Carro("Nissan", 70500000);
        arregloObj[2] = new Carro("Renault", 45000000);
        arregloObj[3] = new Carro("Mazda", 68000000);
        for (int i=0;i<arregloObj.length; i++){
            System.out.println(arregloObj[i].getMarca());
        }
        for (Carro i: arregloObj){ //for each
            System.out.println(i.getMarca());
        }
        //totalizar los precios de los objetos carro que estan en arregloObj
        //se requiere crear una clase Total

        Total resultado = new Total(arregloObj); //intancia a la clase total 
        System.out.println("La suma total del los precios es:"+ resultado.totalizar());

    }
}
