package modelo;


/**
 *
 * @author Paul
 */
public class Triangulo {
    private double num1;
    private double num2;
    private double perimetro;
    private double area;
    
    public Triangulo () {
    this.num1=0;
    this.num2=0;
    this.perimetro=0;
    this.area=0;
       
 }   
    
    public void Perimetro () {
        this.setPerimetro(this.num1*3);
    }
    
    public void Area (){
        this.setArea((this.num1*this.num2)/2);
               
        }
    
    
    
    
    
    /**
     * @return the num1
     */
    public double getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public double getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    /**
     * @return the perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }
    
    
}
