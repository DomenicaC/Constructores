/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.clases.Ballena;
import ec.edu.ups.clases.Lagarto;
import ec.edu.ups.clases.Perro;
import ec.edu.ups.controladores.ControladorBallena;
import ec.edu.ups.controladores.ControladorLagarto;
import ec.edu.ups.controladores.ControladorPerro;
import ec.edu.ups.controladores.ControladorSerpiente;
import java.util.Scanner;

/**
 *
 * @author Domenica Cañizares
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        boolean salir1 = false;

        ControladorBallena controladorBallena = new ControladorBallena();
        ControladorLagarto controladorLagarto = new ControladorLagarto();
        ControladorPerro controladorPerro = new ControladorPerro();
        ControladorSerpiente controladorSerpiente = new ControladorSerpiente();

        int op, opcion;

        System.out.println("Bienvenido al proyecto Restaurante");
        while (!salir1) {
            System.out.println("1. CRUD Ballena");
            System.out.println("1. CRUD Lagarto");
            System.out.println("1. CRUD Perro");
            System.out.println("1. CRUD Serpiente");
            System.out.println("3. Salir");

            System.out.println("Elija una opcion");
            op = sn.nextInt();
            System.out.println("\n");

            switch (op) {
                case 1:
                    System.out.println("A elegido la opcion Ballena \n");

                    while (!salir) {

                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Dalete");
                        System.out.println("5. Regresar");

                        System.out.println("Elija una opcion");
                        opcion = sn.nextInt();
                        System.out.println("\n");

                        switch (opcion) {
                            case 1:
                                System.out.println("Has seleccionado la opción 'Create' ");
                                Ballena ballena = new Ballena();
                                Scanner dato = new Scanner(System.in);
                                System.out.println("\n");

                                System.out.println("Ingrese en nombre de la ballena ");
                                String nombre = dato.next();
                                //System.out.println("nombre "+nombre);
                                System.out.println("\n");

                                System.out.println("Ingrese el nombre cientifico ");
                                String nomC = dato.next();
                                System.out.println("\n");

                                System.out.println("Ingrese el peso ");
                                double peso = dato.nextDouble();
                                System.out.println("\n");

                                System.out.println("Ingrese el taman ");
                                String tam = dato.next();
                                System.out.println("\n");

                                System.out.println("ingrese el sexo ");
                                String sex = dato.next();
                                System.out.println("\n");

                                System.out.println("Ingrese el color ");
                                String col = dato.nextLine();
                                System.out.println("\n");

                                System.out.println("Ingrese la veocidad ");
                                double vel = dato.nextDouble();
                                System.out.println("\n");

                                System.out.println("Ingrese el numero de huesos ");
                                int numH = dato.nextInt();
                                System.out.println("\n");

                                System.out.println("Tiene pelo? \n Ingrese valores de 'true' o 'false' ");
                                boolean pel = dato.nextBoolean();
                                System.out.println("\n");

                                System.out.println("Ingrese que come la ballena ");
                                String comida = dato.nextLine();
                                System.out.println("\n");

                                System.out.println("Ingresse su habitat ");
                                String hab = dato.nextLine();
                                System.out.println("\n");

                                break;
                            case 2:
                                System.out.println("Has seleccionado la opción 'Read'");

                                break;
                            case 3:
                                System.out.println("Has seleccionado la opción 'Update'");

                                break;
                            case 4:
                                System.out.println("Has seleccionado la opción 'Delete'");

                                break;
                            case 5:
                                System.out.println("Has seleccionado la opción Regresar");

                                salir1 = true;
                                break;
                            default:
                                System.out.println("Solo digite números entre 1 y 5");
                        }
                    }
                    break;

                case 2:
                    System.out.println("A elegido la opcion Lagarto \n");

                    while (!salir) {

                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Dalete");
                        System.out.println("5. Regresar");

                        System.out.println("Elija una opcion");
                        opcion = sn.nextInt();
                        System.out.println("\n");

                        switch (opcion) {
                            case 1:
                                System.out.println("Has seleccionado la opción 'Create'");
                                Lagarto lagarto = new Lagarto();
                                Scanner dato = new Scanner(System.in);
                                System.out.println("\n");

                                System.out.println("Ingrese en nombre del lagarto");
                                String nombre = dato.next();
                                //System.out.println("nombre "+nombre);
                                System.out.println("\n");

                                System.out.println("Ingrese el tipo de sangre 'fria o caliente'");
                                String tipoS = dato.next();
                                System.out.println("\n");

                                System.out.println("Ingrese los años de vida");
                                double aVida = dato.nextDouble();
                                System.out.println("\n");

                                System.out.println("Ingrese el tipo de piel ");
                                String tiPiel = dato.next();
                                System.out.println("\n");

                                System.out.println("ingrese el modo de defensa ");
                                String def = dato.next();
                                System.out.println("\n");

                                System.out.println("¿Cambia de color? \n Ingrese valores de 'true' o 'false'");
                                boolean camColor = dato.nextBoolean();
                                System.out.println("\n");

                                System.out.println("Tiene extremidades \n Ingrese valores de 'true' o 'false'");
                                boolean ext = dato.nextBoolean();
                                System.out.println("\n");

                                System.out.println("¿Cuantos huevos tiene?");
                                int numHu = dato.nextInt();
                                System.out.println("\n");

                                System.out.println("¿Como se desplaza");
                                String des = dato.nextLine();
                                System.out.println("\n");

                                System.out.println("Ingrese el sexo");
                                String sex = dato.nextLine();
                                System.out.println("\n");

                                System.out.println("Ingresse el color del lagarto");
                                String colorL = dato.nextLine();
                                System.out.println("\n");
                                break;
                            case 2:
                                System.out.println("Has seleccionado la opción 'Read'");

                                break;
                            case 3:
                                System.out.println("Has seleccionado la opción 'Update'");

                                break;
                            case 4:
                                System.out.println("Has seleccionado la opción 'Delete'");

                                break;
                            case 5:
                                System.out.println("Has seleccionado la opción Regresar");

                                salir1 = true;
                                break;
                            default:
                                System.out.println("Solo digite números entre 1 y 5");
                        }
                    }

                    break;

                case 3:
                    System.out.println("A elegido la opcion Perro \n");

                    while (!salir) {

                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Dalete");
                        System.out.println("5. Regresar");

                        System.out.println("Elija una opcion");
                        opcion = sn.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Has seleccionado la opción 'Create'");
                                Perro perro = new Perro();
                                Scanner dato = new Scanner(System.in);
                                System.out.println("\n");

                                System.out.println("Ingrese en nombre del perro ");
                                String nombre = dato.next();
                                //System.out.println("nombre "+nombre);
                                System.out.println("\n");

                                System.out.println("Ingrese la raza");
                                String razaP = dato.next();
                                System.out.println("\n");

                                System.out.println("Ingrese la audicion");
                                double peso = dato.nextDouble();
                                System.out.println("\n");

                                System.out.println("Ingrese la temperatura corporal");
                                String tam = dato.next();
                                System.out.println("\n");

                                System.out.println("ingrese el sexo ");
                                String sex = dato.next();
                                System.out.println("\n");

                                System.out.println("Ingrese el color ");
                                String col = dato.nextLine();
                                System.out.println("\n");

                                System.out.println("Ingrese la edad del perro");
                                double vel = dato.nextDouble();
                                System.out.println("\n");

                                System.out.println("Ingrese el numero de huesos ");
                                int numH = dato.nextInt();
                                System.out.println("\n");

                                System.out.println("Tiene pelo? \n Ingrese valores de 'true' o 'false' ");
                                boolean pel = dato.nextBoolean();
                                System.out.println("\n");

                                System.out.println("Ingrese que come el perro ");
                                String comida = dato.nextLine();
                                System.out.println("\n");

                                System.out.println("Ingresse su habitat ");
                                String hab = dato.nextLine();
                                System.out.println("\n");
                                break;
                            case 2:
                                System.out.println("Has seleccionado la opción 'Read'");

                                break;
                            case 3:
                                System.out.println("Has seleccionado la opción 'Update'");

                                break;
                            case 4:
                                System.out.println("Has seleccionado la opción 'Delete'");

                                break;
                            case 5:
                                System.out.println("Has seleccionado la opción Regresar");

                                salir1 = true;
                                break;
                            default:
                                System.out.println("Solo digite números entre 1 y 5");
                        }
                    }
                    break;
                case 4:
                    System.out.println("A elegido la opcion Serpiente \n");

                    while (!salir) {

                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Dalete");
                        System.out.println("5. Regresar");

                        System.out.println("Elija una opcion");
                        opcion = sn.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Has seleccionado la opción 'Create'");
                                Lagarto lagarto = new Lagarto();
                                Scanner dato = new Scanner(System.in);
                                System.out.println("\n");

                                System.out.println("Ingrese en nombre de la serpiente");
                                String nombre = dato.next();
                                //System.out.println("nombre "+nombre);
                                System.out.println("\n");

                                System.out.println("Ingrese el tipo de sangre 'fria o caliente'");
                                String tipoS = dato.next();
                                System.out.println("\n");

                                System.out.println("Ingrese la especie");
                                double aVida = dato.nextDouble();
                                System.out.println("\n");

                                System.out.println("Ingrese la descripcion");
                                String desc = dato.next();
                                System.out.println("\n");

                                System.out.println("ingrese la alimentacion");
                                String ali = dato.next();
                                System.out.println("\n");

                                System.out.println("¿Es venenosa? \n Ingrese valores de 'true' o 'false'");
                                boolean veneno = dato.nextBoolean();
                                System.out.println("\n");

                                System.out.println("Tiene extremidades \n Ingrese valores de 'true' o 'false'");
                                boolean ext = dato.nextBoolean();
                                System.out.println("\n");

                                System.out.println("¿Cuantos huevos tiene?");
                                int numHu = dato.nextInt();
                                System.out.println("\n");

                                System.out.println("¿Como se desplaza");
                                String des = dato.nextLine();
                                System.out.println("\n");

                                System.out.println("Ingrese el sexo");
                                String sex = dato.nextLine();
                                System.out.println("\n");

                                System.out.println("Ingresse el color de la serpiente");
                                String colorL = dato.nextLine();
                                System.out.println("\n");
                                break;
                            case 2:
                                System.out.println("Has seleccionado la opción 'Read'");

                                break;
                            case 3:
                                System.out.println("Has seleccionado la opción 'Update'");

                                break;
                            case 4:
                                System.out.println("Has seleccionado la opción 'Delete'");

                                break;
                            case 5:
                                System.out.println("Has seleccionado la opción Regresar");

                                salir1 = true;
                                break;
                            default:
                                System.out.println("Solo digite números entre 1 y 5");
                        }
                    }
                    break;
            }
        }
    }

}
