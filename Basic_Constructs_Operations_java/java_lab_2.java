// Write a Java class Complex for dealing with complex number. 
package Basic_Constructs_Operations_java;

class Complex {
    public Complex() {
        double realPart = 0;
        double imaginaryPart = 0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImgPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImgPart() {
        return imaginaryPart;
    }
}

public class java_lab_2 {
    public static void main(String[] args) {
        Complex com=new Complex();
        com.setRealPart(15);
        com.getImgPart()
    }
}
