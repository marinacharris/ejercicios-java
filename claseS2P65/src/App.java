public class App {
    public static void main(String[] args) throws Exception {
        //instancia a la clase Circulo
        /*Circulo circulo1 = new Circulo(5);
        Circulo circulo2 = new Circulo(10);

        System.out.println(circulo1.area());
        System.out.println(circulo2.area());
        System.out.println(circulo1.getRadio());*/
        System.out.println(Circulo.perimetro(5));


        //instancia clase Login
        Login usuario1 = new Login("marinaCh");
        Login usuario2 = new Login("Juan2020", "489");
        usuario1.mostrardatos();
        usuario2.mostrardatos();

    }
}
