public class Login {
    private String usuario;
    private String clave;
    //sobrecarga de constructores

    public Login(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }
    public Login(String usuario) {
        this.usuario = usuario;
        this.clave = String.valueOf((int)(Math.random()*1000));

    }
    public void mostrardatos(){
        System.out.println("Los datos requeridos son, usuario: "+this.usuario+", clave: "+this.clave);
    }
       
}
