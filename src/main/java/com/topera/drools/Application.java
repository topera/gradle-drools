package com.topera.drools;

import com.topera.drools.model.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by topera on 28/04/18.
 */
public class Application {

    public static void main(String[] args) {

    }

    public User run() {
        User user = new User("John");
        System.out.println("Name before session: " + user.get);
        runDrools(user);
        return user;
    }

    private void runDrools(User user) {
        StatelessKieSession kieSession = createKieSession();
        kieSession.execute(user);
    }

    private StatelessKieSession createKieSession() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        return kieContainer.newStatelessKieSession();
    }
}
