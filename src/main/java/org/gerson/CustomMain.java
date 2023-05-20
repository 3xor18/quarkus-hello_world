package org.gerson;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class CustomMain {

    public static void main(String ... args){
        //System.out.println("Running main method");
        //Para que arranque la app
        //Quarkus.run(args);

        Quarkus.run(CustomApp.class,args);

        //NOTA: No implementar logica aqui
    }

    public static class CustomApp implements QuarkusApplication{
        //Aqui va la logica
        @Override
        public int run(String... args) throws Exception {
            System.out.println("Running main method from customApp");
            //Para que finalize la app
            Quarkus.waitForExit();
            return 0;
        }
    }

}
