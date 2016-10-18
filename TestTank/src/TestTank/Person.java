package TestTank;

/**
 * Created by Andy on 2016/9/30.
 */
public abstract class Person {
    abstract void eat();
}
abstract class Child extends Person{
    public static void main(String[] args) {
        Person p =new Child() {
            @Override

            void eat() {
                System.out.println("eat");
            }
        };
        p.eat();
    }

}
