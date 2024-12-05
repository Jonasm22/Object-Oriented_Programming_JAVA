package Example_2_Dog;

abstract class Dog{
    public  void bark(){
        System.out.println("Bark");
    }

    public  abstract  void poop();

    public  abstract  void  smell();

    public  abstract  void play();


}

class Chihuaha extends  Dog{

    @Override
    public void poop(){
        System.out.println("Dog pooped");
    }
    @Override
    public void smell(){
        System.out.println("Dog smell");
    }
    @Override
    public  void play(){
        System.out.println("Dog is playing");
    }

}


class Husky extends Dog {

    public void poop(){
        System.out.println("Husky pooped");
    }

    public void smell(){
        System.out.println("Husky smell");
    }

    public  void play(){
        System.out.println("Husky is playing");
    }
}


public class AbstractExercise {

    public static void main(String[] args) {
        Chihuaha chihuaha = new Chihuaha();
        chihuaha.bark();
        chihuaha.poop();
        chihuaha.smell();


        Husky husky = new Husky();
        husky.bark();
        husky.play();
        husky.poop();




    }


}