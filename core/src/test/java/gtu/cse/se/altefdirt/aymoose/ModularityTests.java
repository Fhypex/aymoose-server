package gtu.cse.se.altefdirt.aymoose;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

import gtu.cse.se.altefdirt.aymoose.core.AymooseApplication;

class ModularityTests {
    static ApplicationModules modules = ApplicationModules.of(AymooseApplication.class);
    

    @Test
    void verifiesModularStructure() {
        modules.verify();
        System.out.println("Test begun");
        for(var module : modules) 
            System.out.println(module);
        System.out.println("End of test");
    }

    /* @Test
    void createModuleDocumentation() {
        new Documenter(modules).writeDocumentation();
    } */
}