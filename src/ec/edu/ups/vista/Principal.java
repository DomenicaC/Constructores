/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.clases.Ballena;
import ec.edu.ups.clases.Lagarto;
import ec.edu.ups.clases.Perro;
import ec.edu.ups.clases.Serpiente;
import ec.edu.ups.controladores.ControladorBallena;
import ec.edu.ups.controladores.ControladorLagarto;
import ec.edu.ups.controladores.ControladorPerro;
import ec.edu.ups.controladores.ControladorSerpiente;
import java.util.Scanner;

/**
 * @author Domenica Cañizares
 * @since 15-April-2019
 * @version IDE 8.0.2 
 * @Principal
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
            System.out.println("2. CRUD Lagarto");
            System.out.println("3. CRUD Perro");
            System.out.println("4. CRUD Serpiente");
            System.out.println("5. Salir");

            System.out.println("Elija una opcion");
            op = sn.nextInt();
            System.out.println("\n");
            Scanner dato = new Scanner(System.in);

            switch (op) {
                case 1:
                    System.out.println("A elegido la opcion Ballena \n");

                    while (!salir1) {

                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Dalete");
                        System.out.println("5. Regresar");

                        System.out.println("Elija una opcion");
                        opcion = sn.nextInt();
                        System.out.println("\n");
                        Ballena ballena = new Ballena();

                        switch (opcion) {
                            case 1:
                                System.out.println("Has seleccionado la opción 'Create' ");
                                

                                System.out.println("\n");

                                System.out.println("Ingrese en nombre de la ballena ");
                                String nombre = dato.next();
                                ballena.setNombre(nombre);
                                System.out.println("\n");

                                System.out.println("Ingrese el nombre cientifico ");
                                String nomC = dato.next();
                                ballena.setNomCientifico(nomC);
                                System.out.println("\n");

                                System.out.println("Ingrese el peso ");
                                double peso = dato.nextDouble();
                                ballena.setPeso(peso);
                                System.out.println("\n");

                                System.out.println("Ingrese el taman ");
                                Double tam = dato.nextDouble();
                                ballena.setTamaño(tam);
                                System.out.println("\n");

                                System.out.println("ingrese el sexo ");
                                String sex = dato.next();
                                ballena.setSexo(sex);
                                System.out.println("\n");

                                System.out.println("Ingrese el color ");
                                String col = dato.nextLine();
                                ballena.setColor(col);
                                System.out.println("\n");

                                System.out.println("Ingrese la veocidad ");
                                double vel = dato.nextDouble();
                                ballena.setVelocidad(vel);
                                System.out.println("\n");

                                System.out.println("Ingrese el numero de huesos ");
                                int numH = dato.nextInt();
                                ballena.setNumHueso(numH);
                                System.out.println("\n");

                                System.out.println("Tiene pelo? \n Ingrese valores de 'true' o 'false' ");
                                boolean pel = dato.nextBoolean();
                                ballena.setPelo(pel);
                                System.out.println("\n");

                                System.out.println("Ingrese que come la ballena ");
                                String comida = dato.nextLine();
                                ballena.setComida(comida);
                                System.out.println("\n");

                                System.out.println("Ingresse su habitat ");
                                String hab = dato.nextLine();
                                ballena.setHabitat(hab);
                                System.out.println("\n");
                                controladorBallena.create(ballena);

                                break;
                            case 2:
                                System.out.println("Has seleccionado la opción 'Read'");
                                System.out.println("Ingrese el codigo a leer");
                                int codigo = dato.nextInt();
                                System.out.println(controladorBallena.read(codigo));
                                break;
                            case 3:
                                System.out.println("Has seleccionado la opción 'Update'");
                                System.out.println("Ingrese en nombre de la ballena ");
                                String nombre1 = dato.next();
                                ballena.setNombre(nombre1);
                                System.out.println("\n");

                                System.out.println("Ingrese el nombre cientifico ");
                                String nomC1 = dato.next();
                                ballena.setNomCientifico(nomC1);
                                System.out.println("\n");

                                System.out.println("Ingrese el peso ");
                                double peso1 = dato.nextDouble();
                                ballena.setPeso(peso1);
                                System.out.println("\n");

                                System.out.println("Ingrese el taman ");
                                double tam1 = dato.nextDouble();
                                ballena.setTamaño(tam1);
                                System.out.println("\n");

                                System.out.println("ingrese el sexo ");
                                String sex1 = dato.next();
                                ballena.setSexo(sex1);
                                System.out.println("\n");

                                System.out.println("Ingrese el color ");
                                String col1 = dato.nextLine();
                                ballena.setColor(col1);
                                System.out.println("\n");

                                System.out.println("Ingrese la veocidad ");
                                double vel1 = dato.nextDouble();
                                ballena.setVelocidad(vel1);
                                System.out.println("\n");

                                System.out.println("Ingrese el numero de huesos ");
                                int numH1 = dato.nextInt();
                                ballena.setNumHueso(numH1);
                                System.out.println("\n");

                                System.out.println("Tiene pelo? \n Ingrese valores de 'true' o 'false' ");
                                boolean pel1 = dato.nextBoolean();
                                ballena.setPelo(pel1);
                                System.out.println("\n");

                                System.out.println("Ingrese que come la ballena ");
                                String comida1 = dato.nextLine();
                                ballena.setComida(comida1);
                                System.out.println("\n");

                                System.out.println("Ingresse su habitat ");
                                String hab1 = dato.nextLine();
                                ballena.setHabitat(hab1);
                                System.out.println("\n");

                                controladorBallena.update(ballena);
                                break;
                            case 4:
                                System.out.println("Has seleccionado la opción 'Delete'");
                                System.out.println("Ingrese el codigo a eliminar");
                                codigo = dato.nextInt();
                                controladorBallena.delete(codigo);
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
                        //Scanner dato = new Scanner(System.in);
                        Lagarto lagarto = new Lagarto();

                        switch (opcion) {
                            case 1:
                                System.out.println("Has seleccionado la opción 'Create'");

                                System.out.println("\n");

                                System.out.println("Ingrese en nombre del lagarto");
                                String nombre = dato.next();
                                //System.out.println("nombre "+nombre);
                                lagarto.setNombre(nombre);
                                System.out.println("\n");

                                System.out.println("Ingrese el tipo de sangre 'fria o caliente'");
                                String tipoS = dato.next();
                                lagarto.setSangre(tipoS);
                                System.out.println("\n");

                                System.out.println("Ingrese los años de vida");
                                int aVida = dato.nextInt();
                                lagarto.setAñosVida(aVida);
                                System.out.println("\n");

                                System.out.println("Ingrese el tipo de piel ");
                                String tiPiel = dato.next();
                                lagarto.setTipoPiel(tiPiel);
                                System.out.println("\n");

                                System.out.println("ingrese el modo de defensa ");
                                String def = dato.next();
                                lagarto.setModoDefensa(def);
                                System.out.println("\n");

                                System.out.println("¿Cambia de color? \n Ingrese valores de 'true' o 'false'");
                                boolean camColor = dato.nextBoolean();
                                lagarto.setCambiaColor(camColor);
                                System.out.println("\n");

                                System.out.println("Tiene extremidades \n Ingrese valores de 'true' o 'false'");
                                boolean ext = dato.nextBoolean();
                                lagarto.setExtremidades(ext);
                                System.out.println("\n");

                                System.out.println("¿Cuantos huevos tiene?");
                                int numHu = dato.nextInt();
                                lagarto.setNumHuevos(numHu);
                                System.out.println("\n");

                                System.out.println("¿Como se desplaza");
                                String des = dato.nextLine();
                                lagarto.setDesplazamiento(des);
                                System.out.println("\n");

                                System.out.println("Ingrese el sexo");
                                String sex = dato.nextLine();
                                lagarto.setSexo(sex);
                                System.out.println("\n");

                                System.out.println("Ingresse el color del lagarto");
                                String colorL = dato.nextLine();
                                lagarto.setColor(colorL);
                                System.out.println("\n");
                                controladorLagarto.create(lagarto);

                                break;
                            case 2:
                                System.out.println("Has seleccionado la opción 'Read'");
                                System.out.println("Ingrese el usuario a leer");
                                int codigo = dato.nextInt();
                                System.out.println(controladorLagarto.read(codigo));
                                break;
                            case 3:
                                System.out.println("Has seleccionado la opción 'Update'");
                                //Lagarto lagarto = new Lagarto();

                                System.out.println("\n");

                                System.out.println("Ingrese en nombre del lagarto");
                                String nombre1 = dato.next();
                                //System.out.println("nombre "+nombre);
                                lagarto.setNombre(nombre1);
                                System.out.println("\n");

                                System.out.println("Ingrese el tipo de sangre 'fria o caliente'");
                                String tipoS1 = dato.next();
                                lagarto.setSangre(tipoS1);
                                System.out.println("\n");

                                System.out.println("Ingrese los años de vida");
                                int aVida1 = dato.nextInt();
                                lagarto.setAñosVida(aVida1);
                                System.out.println("\n");

                                System.out.println("Ingrese el tipo de piel ");
                                String tiPiel1 = dato.next();
                                lagarto.setTipoPiel(tiPiel1);
                                System.out.println("\n");

                                System.out.println("ingrese el modo de defensa ");
                                String def1 = dato.next();
                                lagarto.setModoDefensa(def1);
                                System.out.println("\n");

                                System.out.println("¿Cambia de color? \n Ingrese valores de 'true' o 'false'");
                                boolean camColor1 = dato.nextBoolean();
                                lagarto.setCambiaColor(camColor1);
                                System.out.println("\n");

                                System.out.println("Tiene extremidades \n Ingrese valores de 'true' o 'false'");
                                boolean ext1 = dato.nextBoolean();
                                lagarto.setExtremidades(ext1);
                                System.out.println("\n");

                                System.out.println("¿Cuantos huevos tiene?");
                                int numHu1 = dato.nextInt();
                                lagarto.setNumHuevos(numHu1);
                                System.out.println("\n");

                                System.out.println("¿Como se desplaza");
                                String des1 = dato.nextLine();
                                lagarto.setDesplazamiento(des1);
                                System.out.println("\n");

                                System.out.println("Ingrese el sexo");
                                String sex1 = dato.nextLine();
                                lagarto.setSexo(sex1);
                                System.out.println("\n");

                                System.out.println("Ingresse el color del lagarto");
                                String colorL1 = dato.nextLine();
                                lagarto.setColor(colorL1);
                                System.out.println("\n");

                                controladorLagarto.update(lagarto);
                                break;
                            case 4:
                                System.out.println("Has seleccionado la opción 'Delete'");
                                System.out.println("Ingrese el codigo a eliminar");
                                codigo = dato.nextInt();
                                controladorLagarto.delete(codigo);
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
                        Perro perro = new Perro();

                        switch (opcion) {
                            case 1:
                                System.out.println("Has seleccionado la opción 'Create'");
                                
                                //Scanner dato = new Scanner(System.in);
                                System.out.println("\n");

                                System.out.println("Ingrese en nombre del perro ");
                                String nombre = dato.next();
                                //System.out.println("nombre "+nombre);
                                perro.setNombre(nombre);
                                System.out.println("\n");

                                System.out.println("Ingrese la raza");
                                String razaP = dato.next();
                                perro.setRaza(razaP);
                                System.out.println("\n");

                                System.out.println("Ingrese la audicion");
                                double peso = dato.nextDouble();
                                perro.setAudicion(peso);
                                System.out.println("\n");

                                System.out.println("Ingrese la temperatura corporal");
                                String temp = dato.next();
                                perro.setTempCorporal(temp);
                                System.out.println("\n");

                                System.out.println("ingrese el sexo ");
                                String sex = dato.next();
                                perro.setSexo(sex);
                                System.out.println("\n");

                                System.out.println("Ingrese el color ");
                                String col = dato.nextLine();
                                perro.setColor(col);
                                System.out.println("\n");

                                System.out.println("Ingrese la edad del perro");
                                int edadP = dato.nextInt();
                                perro.setEdad(edadP);
                                System.out.println("\n");

                                System.out.println("Ingrese el numero de huesos ");
                                int numH = dato.nextInt();
                                perro.setNumHueso(numH);
                                System.out.println("\n");

                                System.out.println("Tiene pelo? \n Ingrese valores de 'true' o 'false' ");
                                boolean pel = dato.nextBoolean();
                                perro.setPelo(pel);
                                System.out.println("\n");

                                System.out.println("Ingrese que come el perro ");
                                String comida = dato.nextLine();
                                perro.setComida(comida);
                                System.out.println("\n");

                                System.out.println("Ingresse su habitat ");
                                String hab = dato.nextLine();
                                perro.setHabitat(hab);
                                System.out.println("\n");
                                controladorPerro.create(perro);

                                break;
                            case 2:
                                System.out.println("Has seleccionado la opción 'Read'");
                                System.out.println("Ingrese el usuario a leer");
                                int codigo = dato.nextInt();
                                System.out.println(controladorPerro.read(codigo));
                                break;
                            case 3:
                                System.out.println("Has seleccionado la opción 'Update'");
                                System.out.println("Ingrese en nombre del perro ");
                                String nombre1 = dato.next();
                                //System.out.println("nombre "+nombre);
                                perro.setNombre(nombre1);
                                System.out.println("\n");

                                System.out.println("Ingrese la raza");
                                String razaP1 = dato.next();
                                perro.setRaza(razaP1);
                                System.out.println("\n");

                                System.out.println("Ingrese la audicion");
                                double peso1 = dato.nextDouble();
                                perro.setAudicion(peso1);
                                System.out.println("\n");

                                System.out.println("Ingrese la temperatura corporal");
                                String temp1 = dato.next();
                                perro.setTempCorporal(temp1);
                                System.out.println("\n");

                                System.out.println("ingrese el sexo ");
                                String sex1 = dato.next();
                                perro.setSexo(sex1);
                                System.out.println("\n");

                                System.out.println("Ingrese el color ");
                                String col1 = dato.nextLine();
                                perro.setColor(col1);
                                System.out.println("\n");

                                System.out.println("Ingrese la edad del perro");
                                int edadP1 = dato.nextInt();
                                perro.setEdad(edadP1);
                                System.out.println("\n");

                                System.out.println("Ingrese el numero de huesos ");
                                int numH1 = dato.nextInt();
                                perro.setNumHueso(numH1);
                                System.out.println("\n");

                                System.out.println("Tiene pelo? \n Ingrese valores de 'true' o 'false' ");
                                boolean pel1 = dato.nextBoolean();
                                perro.setPelo(pel1);
                                System.out.println("\n");

                                System.out.println("Ingrese que come el perro ");
                                String comida1 = dato.nextLine();
                                perro.setComida(comida1);
                                System.out.println("\n");

                                System.out.println("Ingresse su habitat ");
                                String hab1 = dato.nextLine();
                                perro.setHabitat(hab1);
                                System.out.println("\n");

                                controladorPerro.update(perro);
                                break;
                            case 4:
                                System.out.println("Has seleccionado la opción 'Delete'");
                                System.out.println("Has seleccionado la opción 'Delete'");
                                System.out.println("Ingrese el codigo a eliminar");
                                codigo = dato.nextInt();
                                controladorPerro.delete(codigo);
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
                        Serpiente serpiente = new Serpiente();

                        switch (opcion) {
                            case 1:
                                System.out.println("Has seleccionado la opción 'Create'");

                                //Scanner dato = new Scanner(System.in);
                                System.out.println("\n");

                                System.out.println("Ingrese en nombre de la serpiente");
                                String nombre = dato.next();
                                //System.out.println("nombre "+nombre);
                                serpiente.setNombre(nombre);
                                System.out.println("\n");

                                System.out.println("Ingrese el tipo de sangre 'fria o caliente'");
                                String tipoS = dato.next();
                                serpiente.setSangre(tipoS);
                                System.out.println("\n");

                                /*System.out.println("Ingrese la especie");
                                double aVida = dato.nextDouble();
                                ser
                                System.out.println("\n");*/

                                System.out.println("Ingrese la descripcion");
                                String desc = dato.next();
                                serpiente.setDescripcion(desc);
                                System.out.println("\n");

                                System.out.println("ingrese la alimentacion");
                                String ali = dato.next();
                                serpiente.setAlimentacion(ali);
                                System.out.println("\n");

                                System.out.println("¿Es venenosa? \n Ingrese valores de 'true' o 'false'");
                                boolean veneno = dato.nextBoolean();
                                serpiente.setVenenosa(veneno);
                                System.out.println("\n");

                                System.out.println("Tiene extremidades \n Ingrese valores de 'true' o 'false'");
                                boolean ext = dato.nextBoolean();
                                serpiente.setExtremidades(ext);
                                System.out.println("\n");

                                System.out.println("¿Cuantos huevos tiene?");
                                int numHu = dato.nextInt();
                                serpiente.setNumHuevos(numHu);
                                System.out.println("\n");

                                System.out.println("¿Como se desplaza");
                                String des = dato.nextLine();
                                serpiente.setDesplazamiento(des);
                                System.out.println("\n");

                                System.out.println("Ingrese el sexo");
                                String sex = dato.nextLine();
                                serpiente.setSexo(sex);
                                System.out.println("\n");

                                System.out.println("Ingresse el color de la serpiente");
                                String colorL = dato.nextLine();
                                serpiente.setColor(colorL);
                                System.out.println("\n");
                                
                                controladorSerpiente.create(serpiente);

                                break;
                            case 2:
                                System.out.println("Has seleccionado la opción 'Read'");
                                System.out.println("Ingrese el usuario a leer");
                                int codigo = dato.nextInt();
                                System.out.println(controladorSerpiente.read(codigo));
                                break;
                            case 3:
                                System.out.println("Has seleccionado la opción 'Update'");
                                System.out.println("Ingrese en nombre de la serpiente");
                                String nombre1 = dato.next();
                                //System.out.println("nombre "+nombre);
                                serpiente.setNombre(nombre1);
                                System.out.println("\n");

                                System.out.println("Ingrese el tipo de sangre 'fria o caliente'");
                                String tipoS1 = dato.next();
                                serpiente.setSangre(tipoS1);
                                System.out.println("\n");
                                /*
                                 System.out.println("Ingrese la especie");
                                 double aVida1 = dato.nextDouble();
                                 serpiente.s
                                 System.out.println("\n");*/

                                System.out.println("Ingrese la descripcion");
                                String desc1 = dato.next();
                                serpiente.setDescripcion(desc1);
                                System.out.println("\n");

                                System.out.println("ingrese la alimentacion");
                                String ali1 = dato.next();
                                serpiente.setAlimentacion(ali1);
                                System.out.println("\n");

                                System.out.println("¿Es venenosa? \n Ingrese valores de 'true' o 'false'");
                                boolean veneno1 = dato.nextBoolean();
                                serpiente.setVenenosa(veneno1);
                                System.out.println("\n");

                                System.out.println("Tiene extremidades \n Ingrese valores de 'true' o 'false'");
                                boolean ext1 = dato.nextBoolean();
                                serpiente.setExtremidades(ext1);
                                System.out.println("\n");

                                System.out.println("¿Cuantos huevos tiene?");
                                int numHu1 = dato.nextInt();
                                serpiente.setNumHuevos(numHu1);
                                System.out.println("\n");

                                System.out.println("¿Como se desplaza");
                                String des1 = dato.nextLine();
                                serpiente.setDesplazamiento(des1);
                                System.out.println("\n");

                                System.out.println("Ingrese el sexo");
                                String sex1 = dato.nextLine();
                                serpiente.setSexo(sex1);
                                System.out.println("\n");

                                System.out.println("Ingresse el color de la serpiente");
                                String colorL1 = dato.nextLine();
                                serpiente.setColor(colorL1);
                                System.out.println("\n");

                                controladorSerpiente.update(serpiente);
                                break;
                            case 4:
                                System.out.println("Has seleccionado la opción 'Delete'");
                                System.out.println("Ingrese el codigo a eliminar");
                                codigo = dato.nextInt();
                                controladorSerpiente.delete(codigo);
                                break;
                            case 5:
                                System.out.println("Has seleccionado la opción Regresar");

                                salir = true;
                                break;
                            default:
                                System.out.println("Solo digite números entre 1 y 5");
                        }
                    }
                    case 5:
                                System.out.println("Has seleccionado la opción Regresar");

                                salir1 = true;
                                break;
            }
        }
    }

}
