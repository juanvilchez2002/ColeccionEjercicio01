
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
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
        
//        Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//        un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//        está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//        ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//        la lista ordenada.

        System.out.println("");
        System.out.print("Ingrese una raza a eliminar: ");
        String razaEliminar = consola.nextLine();
        boolean flag = true;
        //creando un Iterador
        Iterator itPerro = perros.iterator();
        //buscamos la raza a eliminar.
        while(itPerro.hasNext()){
            if(itPerro.next().equals(razaEliminar)){
                itPerro.remove();
                System.out.println("Raza elimada");
                flag=false;
            }
        }
        
        if(flag) System.out.println("La raza no se encuentra en la lista");
        System.out.println("");
        
        //ordenando la lista
        Collections.sort(perros);
        
        for(String raza: perros){
            System.out.println(raza);
        }
    }
    
}
