package Class13.Inheritance_Concept_Pkg;

public class ClassB extends ClassA {
    int varB = 20;

    public void myMethod() {
        System.out.println("myMethod from ClassB");
    }

    public void methodB() {
        System.out.println("Inside methodB");
    }
    public void methodB(int val) {
        System.out.println("Inside methodB with val="+val);
    }
    public void methodB(double val) {
        System.out.println("Inside methodB with val="+val);
    }
    public void methodB(double val, int num) {
        System.out.println("Inside methodB with val="+val);
    }
    public void methodB(int num, double val) {
        System.out.println("Inside methodB with val="+val);
    }
}
