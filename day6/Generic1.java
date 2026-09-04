// Write a Java program to create a generic class Box<T> that can store and retrieve a value of any data type, and demonstrate its use by 
// creating objects to store a String and an Integer value.

class Box <T>{
T value;

void setvalue(T value){
    this.value=value;
}
T getvalue(){
    return value;
}
}
public class Generic1{
    public static void main(String[] args){
        Box<String> box1=new Box<>();
        box1.setvalue("Ram");
        System.out.println("Name: "+box1.getvalue());

        Box<Integer> box2=new Box<>();
        box2.setvalue(2000);
        System.out.println("Number: "+box2.getvalue());

    }
}
