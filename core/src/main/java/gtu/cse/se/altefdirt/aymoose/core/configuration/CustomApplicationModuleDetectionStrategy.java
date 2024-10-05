package gtu.cse.se.altefdirt.aymoose.core.configuration;

import org.springframework.modulith.core.ApplicationModuleDetectionStrategy;
import org.springframework.modulith.core.JavaPackage;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.importer.DomainBuilders.JavaClassBuilder;

import org.springframework.modulith.core.*;

import java.util.stream.Stream;

public class CustomApplicationModuleDetectionStrategy implements ApplicationModuleDetectionStrategy {

    @Override
    public Stream<JavaPackage> getModuleBasePackages(JavaPackage basePackage) {

        // Base package name (adjust based on your project structure)
        System.out.println(basePackage.getClasses());

        // Manually construct the full package names for each module
        return Stream.of(
            JavaPackage.of(basePackage.getClasses(), "gtu.cse.se.altefdirt.aymoose.core"),
            JavaPackage.of(basePackage.getClasses(), "gtu.cse.se.altefdirt.aymoose.review")
            // not base but additional
        );
    }
}