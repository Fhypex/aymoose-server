package gtu.cse.se.altefdirt.aymoose.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.modulith.Modulithic;
import org.springframework.modulith.core.ApplicationModuleDetectionStrategy;

import gtu.cse.se.altefdirt.aymoose.core.configuration.CustomApplicationModuleDetectionStrategy;
import lombok.RequiredArgsConstructor;

@Modulithic(useFullyQualifiedModuleNames = true,
			additionalPackages = {"gtu.cse.se.altefdirt.aymoose.core",
								  "gtu.cse.se.altefdirt.aymoose.shared",
								  "gtu.cse.se.altefdirt.aymoose.review"})
@SpringBootApplication
@ComponentScan("gtu.cse.se.altefdirt")
@EnableJpaRepositories(basePackages = "gtu.cse.se.altefdirt")
@EntityScan(basePackages = "gtu.cse.se.altefdirt")
@ConfigurationPropertiesScan("gtu.cse.se.altefdirt")
@RequiredArgsConstructor
public class AymooseApplication {

	public static void main(String[] args) {
		SpringApplication.run(AymooseApplication.class, args);
	}

	@Bean
    ApplicationModuleDetectionStrategy customModuleDetectionStrategy() {
        return new CustomApplicationModuleDetectionStrategy();
    }
}
