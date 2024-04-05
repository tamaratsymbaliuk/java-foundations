package package2;

public class ClassB {
    public void publicMethod(){
        System.out.println("This is a public method");
        privateMethod(); //can be called from  public method of their class

    }

    private void privateMethod(){
        System.out.println("This is the private method");
    }

    protected void protectedMethod(){ //can be accessed from a different class in the same package or from a different subclass in the different package
        System.out.println("This is the protected method");
    }

    void packageProtected(){//more restricted than protected
        System.out.println("This is the package protected method");
    }




}
