
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    //Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
    //programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    //después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
    //salir, se mostrará todos los perros guardados en el ArrayList.
    
    
    
    public static void main(String[] args) {
        //creamos un ArrayList de Perros
        ArrayList<String> perros = new ArrayList();
    
        //usamos Scanner
        Scanner consola = new Scanner(System.in);
        
        String op = "";
        
        //ingresando valores
        do{
            System.out.print("Ingrese una raza de perros: ");
            perros.add(consola.nextLine());
            
            System.out.print("¿desea adicionar otra raza? (S/N): ");
            op = consola.nextLine();
            
            if(!op.equalsIgnoreCase("s")){
                break;
            }

            System.out.println("");            
        }while(true);
        
        //mostramos las razas de erros
        System.out.println("");
        System.out.println("Mostrando las razas");
        for(String razas: perros){
            System.out.println(razas);
        }
        
    }
    
}
