import java.util.Scanner; //Scanner me permite capatura datos por consola
public class condicionalesP65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el color de su tarjeta:");
        String color = sc.nextLine();
        //condicionales
        //if y switch
        
        /*
        if (color.equals("Rojo")){
            System.out.println("PARE");
        }else if(color.equals("Amarillo")){
            System.out.println("PREVENCIÓN");
        }else if(color.equals("Verde")){
            System.out.println("SIGA");
        }else{
            System.out.println("COLOR NO VÁLIDO");
        }
        */
        
        switch (color){
            case "Rojo":
            System.out.println("PARE");
            break;
            case "Amarillo":
            System.out.println("PREVENCIÓN");
            break;
            case "Verde":
            System.out.println("SIGA");
            break;
            default:
            System.out.println("COLOR NO VÁLIDO");
            break;
            
        }
    }
}
