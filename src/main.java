import java.util.Scanner;
public class main {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
            //nombre, apellido, edad, hobbie, editor de código preferido, sistema operativo que utiliza
        usuarios nuevo;
        nuevo = new usuarios();

        System.out.println("Ingrese su nombre: ");
        String dato = sc.next();
        nuevo.nombre = dato;

        System.out.println("Ingrese su Apellido: ");
        dato = sc.next();
        nuevo.apellido = dato;

        System.out.println("Ingrese su edad: ");
        int daton = sc.nextInt();
        nuevo.edad = daton;

        System.out.println("Ingrese su hobbie: ");
        dato = sc.next();
        nuevo.hobbie = dato;
        
        System.out.println("Ingrese su editor de código preferido: ");
        dato = sc.next();
        nuevo.editor_de_codigo = dato;

        System.out.println("Ingrese su editor de sistema operativo que utiliza: ");
        dato = sc.next();
        nuevo.sistema_operativo = dato;


        System.out.println("Gracias ! "+ nuevo.nombre + "  " +nuevo.apellido );
        System.out.println("Tus preferencias son "+ nuevo.sistema_operativo +"  "+  nuevo.hobbie +"  " +nuevo.editor_de_codigo + " y tu edad es " +nuevo.edad);

        }
    }

