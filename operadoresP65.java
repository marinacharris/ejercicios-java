public class operadoresP65 {
    public static void main(String[] args) {
        //operadores 
        // artimeticos / * + -
        int a = 0;
        a = a +1; //1
        a++; //2
        a +=5; //7
        a--; //6
        System.out.println(a);
        //operadores relacionales > < >= <= == !=
        //Exprension comparación el resultado es true o false
        System.out.println(a == 20);
        //operadores logicos
        // and &&   or ||   not !
        System.out.println(true && false);
        //operador ternario
        // ITTT
        String mensaje;
        a = 20;
        mensaje = a>10 ? "A mayor que 10": "A es menor o igual a 10";
        System.out.println(mensaje);
    }
}
