/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plano_cartesiano;

/**
 *
 * @author Alejandro Sanchez Ospina, Paulo Duque Vargas
 */

import java.util.Scanner;
public class Plano_Cartesiano {
    public static Scanner leer = new Scanner(System.in);
    
   
    
    
    public static int Menu(){
        int op;
        
            System.out.println("1. Crear Puntos");
            System.out.println("2. Consultar coordenadas");
            System.out.println("3. Modificar coordenadas");
            System.out.println("4. Mostrar Puntos");
            System.out.println("5. Calcular distancia del Origen");
            System.out.println("6. Cuadrante");
            System.out.println("7. Salir");
            System.out.println("Digite una opción: ");
            op=leer.nextInt();
        
        return op;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op, c=0;
        boolean existe = false;
        
        Puntos points[] = new Puntos[20];
        
        do{
            op = Menu();
            switch(op){
                case 1:
                        double x, y;
                        
                        System.out.println("Ingrese el punto de la Coordenada X");
                         x = leer.nextDouble();
        
                        System.out.println("Ingrese el punto de la Coordenada Y");
                        y = leer.nextDouble();
                        
                        points[c] = new Puntos(x, y);
                        System.out.println("Se creo las coordenadas:"+ points[c].toString());
                        c++;
                    break;
                    
                case 2:
                    if(c > 0){
                    System.out.println("Ingrese la Coordenada X que desea consultar:");
                    x = leer.nextDouble();
                    System.out.println("Ingrese la Coordena Y que desea consultar");
                    y = leer.nextDouble();
                    
                    int i = 0;
                    boolean num = false;
                    for(i = 0; i < c; i++){
                       
                         if (x == points[i].getX() && y == points[i].getY()) {
                            System.out.println("Los puntos se encuentran creados "+ points[i].toString()); 
                            num = true;
                        }
                        
                    }
                    
                     if(num ==false) {
                         System.out.println("Los puntos en las Coordenadas X,Y no existen");
                    }

                 }
                    else{
                        System.out.println("No hay puntos creados");
                    }
                    
                    break;
                    
                case 3:   
                    if(c>0)
                        {
			existe=false;
			System.out.println("Ingrese la Coordenada X que desea Modificar:");
                            x = leer.nextDouble();
                        System.out.println("Ingrese la Coordena Y que desea Modificar");
                            y = leer.nextDouble();
                            int i = 0;
			for(i=0;i < c; i++)
			{
				if(x == points[i].getX() && y == points[i].getY())
				{
					existe=true;
					System.out.println("Ingrese el nuevo punto de la Coordenada X");
                                         x = leer.nextDouble();
        
                                        System.out.println("Ingrese el nuevo punto de la Coordenada Y");
                                        y = leer.nextDouble();
                        
                                        points[i].setX(x);
                                        points[i].setY(y);
 
				}
			}
			if(existe==true)
			{
				System.out.println("Posicion Modificada  ");
			}
			else
				System.out.println("Las coordenadas X " +x+",Y "+y+ " No Existen");
		}
		else
			System.out.println("No Hay Datos");
		    break;
                    
                case 4:
                    if(c > 0)
                    {
                        for(int i=0; i<c; i++)
                        System.out.println("Los registros son:"+ points[i].toString());
                    }
                    
                    else{
                        System.out.println("No Hay Datos");
                    }
                    break;
                    
                case 5:
                  if(c > 0){
                     for(int i=0; i<c; i++){
                         
                         double x1= 0;
                         double y1 = 0; 
                         
                        double origen = points[i].distanciaOrigen(points[i].getX(), points[i].getY());
                         System.out.println("La Distancia del Punto "+ points[i].toString()+" con respeto al origen es: "+origen);
                     }
                     
                  }
                  else{
                      System.out.println("No Hay Datos");
                  }
                    break;
                    
                case 6:
                    if(c > 0){
                        for (int i=0; i<c; i++){
                        int cuadrante = points[i].calcularCuadrante(points[i].getX(), points[i].getY());
                        System.out.println("El punto con: "+ points[i].toString()+" Pertenece al cudrante: "+cuadrante);
                                }
                    }
                    
                    else{
                        System.out.println("No hay Datos");
                    }
                    
                    break;
                    
                case 7:
                    System.out.println("Finalizando...");
                    break;
                    
                default:
                    System.out.println("La opción no es válida");
                    break;
                    
            }
            
        }while(op != 7);
        
    }
    
}
