import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
public QuadraticEquation(){

}
private QuadraticEquation(double a,double b,double c){
    this.a=a;
    this.b=b;
    this.c=c;
}

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    private double getDiscriminant(){
    return Math.pow(b,2)-4*a*c;
    }
    private double getRoot1(){
    return (-b+Math.pow(getDiscriminant(),0.5))/(2*a);
    }
    private double getRoot2(){
        return (-b-Math.pow(getDiscriminant(),0.5))/(2*a);
    }
    public static class Start{
        public static void main(String[] args) {
            System.out.println("Enter ax^2+bx+c=0");
            System.out.print("Enter a:");
            Scanner scanner=new Scanner(System.in);
            double a=scanner.nextDouble();
            System.out.print("Enter b:");
            double b=scanner.nextDouble();
            System.out.print("Enter c:");
            double c=scanner.nextDouble();
            QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
            double delta=quadraticEquation.getDiscriminant();
            if (delta>0){
                System.out.println("r1="+quadraticEquation.getRoot1()+",r2="+quadraticEquation.getRoot2());
            }else if (delta==0){
                System.out.println("r1=r2="+quadraticEquation.getRoot1());
            }else {
                System.out.println("The equation has no roots!");
            }
        }
    }
}
