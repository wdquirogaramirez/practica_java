import  java.util.Scanner;
public class usuarios {
    Scanner Sc = new Scanner(System.in);
      int usuarioID;
    String nombre;
    String apellido;
    String edad;
    String hobbie;
    String editor_de_codigo;
    String sistema_operativo;

    public  usuarios( int usuarioID, String nombre, String apellido, String edad, String hobbie, String editor_de_codigo, String sistema_operativo) {
        this.usuarioID = usuarioID;
        this.nombre = nombre;
        this.apellido =apellido;
        this.edad = edad;
        this.hobbie = hobbie;
        this.editor_de_codigo = editor_de_codigo;
        this.sistema_operativo = sistema_operativo;

    }

  public usuarios() {

  }
  /**
   * consulta el nombre al usuario y lo guarda en el objeto usuario
   *
   * */
    public void ConsultaNombre(){
        System.out.println("Ingrese su nombre: ");
        Sc.useDelimiter("\n");
        this.nombre = Sc.next();
    }
    /**
     * consulta el Apellido al usuario y lo guarda en el objeto usuario
     *
     * */
    public  void ConsultaApellido(){
        System.out.println("Tipee su Apellido: ");
        Sc.useDelimiter("\n");
        this.apellido = Sc.next();
    }
    /**
     * consulta el Edad al usuario y lo guarda en el objeto usuario
     *
     * */
    public  void ConsultaEdad(){
        System.out.println("Tipee su Edad: ");
        Sc.useDelimiter("\n");
        this.edad = Sc.next();
    }
    /**
     * consulta el hobiee al usuario y lo guarda en el objeto usuario
     *
     * */
    public  void ConsultaHobiee(){
        System.out.println("Tipee su Hobiee: ");
        Sc.useDelimiter("\n");
        this.hobbie = Sc.next();
    }
    /**
     * consulta el editor de codigo  al usuario y lo guarda en el objeto usuario
     *
     * */
    public  void ConsultaEditorDeCodigo(){
        System.out.println("Tipee su Editor de codigo Favorito: ");
        Sc.useDelimiter("\n");
        this.editor_de_codigo = Sc.next();
    }
    /**
     * consulta el Sistema Operativo al usuario y lo guarda en el objeto usuario
     *
     * */
    public  void ConsultaSistemaOperativo(){
        System.out.println("Tipee su Sistema Operativo: ");
        Sc.useDelimiter("\n");
        this.sistema_operativo = Sc.next();
    }
    /**
     * Muestra el resumen
     * de los datos  ingresados
     * por en usuario
     *
     * */
    public void  resumen (){
        System.out.println("==>Gracias ! "+ this.nombre + "   " +this.apellido +"<==\n "+ "Tus preferencias son:  \n * "+ this.sistema_operativo +"\n * "+  this.hobbie +"\n * " +this.editor_de_codigo + "\n y tu edad es " +this.edad );

    }
}
