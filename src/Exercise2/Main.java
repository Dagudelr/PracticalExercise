package Exercise2;

public class Main { // ->The Main class is configured as the main class and will be compiled first.
    public static void main(String[] args) { // ->The main method is executed.
        System.out.println("It is possible to have several classes with main.java methods and call them together," +
                " however, 1 will always be compiled by default and this is what will determine" +
                " the starting point of the application.");
        Main2 main2 = new Main2(); //->Instantiate and compile main2
        Main3 main3 = new Main3();//->Instantiate and compile main3
        main2.main(args);//->The method of the Main2 class is executed.
        main3.main(args);//->The method of the Main3 class is executed.

    }
}
