package org.gerson;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

@ApplicationScoped
@Slf4j
public class AppCicleBean {

    void onStard(@Observes StartupEvent evt){
        log.info("The Application is Starting...");
    }

    void onStop(@Observes ShutdownEvent evt){
        log.info("The Application is Stoping...");
    }
}
