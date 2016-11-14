package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
    
    public void greet(){
        List<String> greetings= new ArrayList<String>();
        greetings.add("hello");

        for (String greeting:greetings){
            System.out.println("greeting: "+greeting);
        }
    }

    public static void main( String[] args )
    {
        System.out.println("start..");
        Application ap=new Application();
        ap.greet();


    }
}