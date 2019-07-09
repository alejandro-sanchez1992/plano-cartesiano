/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plano_cartesiano;

/**
 *
 * @author Alejandro Sanchez Ospina
 */
public class Puntos {
    
    private double x;
    private double y;
    
    Puntos(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    Puntos(){
        x = 0;
        y = 0;
    }
    
    public double distanciaOrigen(double x, double y){

        double distancia;

        double res1,res2;

        res1=this.x;

        res2=this.y;

        res1=Math.pow(res1,2)+Math.pow(res2,2);

        distancia=Math.sqrt(res1);

            return distancia;
    }
    
    public int calcularCuadrante(double x, double y){
        int cuadrante = 0;
        
        if(this.x > 0 && this.y > 0){
            cuadrante = 1;
        }
        
        else if(this.x < 0 && this.y > 0){
            cuadrante = 2;
        }
        
        else if(this.x <0 && this.y <0){
            cuadrante = 3;
        }
        
        else if(this.x > 0 && this.y <0){
            cuadrante = 4;
        }
        
        return cuadrante;
    }

    public double getX() {
        
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "coordenadas X,Y" + "(" + x + "," + y +")";
    }
    
    
    
}
