package cn.tedu.oop;

public class TestOOP {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        System.out.println(dog.name);
    }
}

class Animal{
    String name;
    public void eat(){
        System.out.println("啥都吃！");
    }
}

class Dog extends Animal{

}
