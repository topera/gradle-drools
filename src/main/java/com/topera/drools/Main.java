package com.topera.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

/**
 * Created by topera on 28/04/18.
 */
public class Main {

    public static void main(String[] args) {
        User user = new User("John");
        System.out.println("Name before drools session: " + user.getName());
        runDrools(user);
        System.out.println("Name after drools session: " + user.getName());
    }

    private static void runDrools(User user) {
        StatelessKieSession kieSession = createKieSession();
        kieSession.execute(user);
    }

    private static StatelessKieSession createKieSession() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        return kieContainer.newStatelessKieSession();
    }
}
