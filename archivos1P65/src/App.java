import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class App {
    
    public static void main(String[] args) {
        try {
            //lectura de datos (entrada)
            File archivo1 = new File("C:\\recursos\\nombres.txt");
            Scanner sc = new Scanner(archivo1);
            while (sc.hasNextLine()){
                String linea = sc.nextLine();
                System.out.println(linea);
            }
            //Escritura de datos (salida)
            //Crear un array tipo String
            String datos[] = {"Medellín", "Cali","Pereira","Barranquilla","Bogotá","Cartagena"};
            FileWriter archivo2 = new FileWriter("ciudades.txt");
            for (String i: datos){
                archivo2.write(i+"\n");
            }     
            archivo2.close();

        } catch (Exception e) {
            System.out.println("No se pudo leer el archivo");
            System.out.println(e.getMessage());
        }
    }
}
