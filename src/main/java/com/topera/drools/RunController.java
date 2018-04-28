package com.topera.drools;


import com.topera.drools.model.User;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by topera on 28/04/18.
 */
@RestController
public class RunController {

    @RequestMapping("/run")
    public User run() {
        User user = new User("John");
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
