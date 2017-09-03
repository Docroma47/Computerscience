package org.mom47.computerscience;

public class FunctionDemo {

    private String classVariable = "This is a variable which belongs to an object of FunctionDemo class";
    private static String staticVariable = "This is a variable which belongs to FunctionDemoe class";

    private String classMethod() {

        // This variable can only be seen inside of the 'classMethod'
        String localVariable = "This is a local variable of the 'classMethod'";

        return localVariable;
    }

    private String anotherMethod() {

        // you cannot access the 'localVariable' of the classMethod from tis method, because that variable is a 'local variable'

        // however, you can access all 'class variables', for example 'classVariable':

        System.out.println("This is a class variable output:" + classVariable);

        return "Just dummy returning value";
    }

    private static String staticMethod() {
        // this is a 'static' method, all static methods can be accessed without creating of object

        return "static method returning value";
    }

    public static void main(String[] args) {
        // you can access all static methods and variables without creating any objects
        // ALL static methods and variables are SHARED amongst all objects
        // There is only one instance of a static variable/method
        String staticMethodReturnedValue = FunctionDemo.staticMethod();
        System.out.println(staticMethodReturnedValue);

        // a demonstration of a static variable access:
        FunctionDemo demo1 = new FunctionDemo();
        FunctionDemo demo2 = new FunctionDemo();
        demo1.staticVariable = "A new value for a static variable";
        demo2.staticVariable = "Another value for a static variable";
        // what would print the following statement?
        System.out.println(FunctionDemo.staticVariable);


        // In order to access 'normal' (non-static methods) you must create a new object:
        FunctionDemo functionDemo = new FunctionDemo();
        String returnedClassVariable = functionDemo.classMethod();
        System.out.println(returnedClassVariable);
        functionDemo.anotherMethod();
        // In other words, you can't do like that:
        // FunctionDemo.classMethod(); - you must have an instance of a class to access class variables or methods (non static)
        // Normal class variables are not shared across objects:
        FunctionDemo demo3 = new FunctionDemo();
        FunctionDemo demo4 = new FunctionDemo();
        demo3.classVariable = "Demo3 class variable - it is UNIQUE";
        demo4.classVariable = "Demo4 class variable IT IS UNIQUE as well";
        // What would print the following two statements?
        System.out.println(demo3.classVariable);
        System.out.println(demo4.classVariable);

        // all method invocations WITHOUT using their RETURNING value are USELESS, for example:
        FunctionDemo.staticMethod(); // absolutely useless invocation of the static method, returning value is NOT used
        // another useless invocation (returning value is not used):
        functionDemo.classMethod();
        // all invocations without using returning values can be removed

        // this is a demonstration of a useful call of a method (returning value is used in the console output):
        System.out.println("useful invocation: " + functionDemo.classMethod());
    }

}
