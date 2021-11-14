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


    public void ConsultaNombre(){
        System.out.println("Ingrese su nombre: ");
        Sc.useDelimiter("\n");
        this.nombre = Sc.next();
    }
    public  void ConsultaApellido(){
        System.out.println("Tipee su Apellido: ");
        Sc.useDelimiter("\n");
        this.apellido = Sc.next();
    }
    public  void ConsultaEdad(){
        System.out.println("Tipee su Edad: ");
        Sc.useDelimiter("\n");
        this.edad = Sc.next();
    }
    public  void ConsultaHobiee(){
        System.out.println("Tipee su Hobiee: ");
        Sc.useDelimiter("\n");
        this.hobbie = Sc.next();
    }
    public  void ConsultaEditorDeCodigo(){
        System.out.println("Tipee su Editor de codigo Favorito: ");
        Sc.useDelimiter("\n");
        this.editor_de_codigo = Sc.next();
    }
    public  void ConsultaSistemaOperativo(){
        System.out.println("Tipee su Sistema Operativo: ");
        Sc.useDelimiter("\n");
        this.sistema_operativo = Sc.next();
    }
    public void  resumen (){
        System.out.println("==>Gracias ! "+ this.nombre + "   " +this.apellido +"<==\n "+ "Tus preferencias son:  \n * "+ this.sistema_operativo +"\n * "+  this.hobbie +"\n * " +this.editor_de_codigo + "\n y tu edad es " +this.edad );

    }
}
