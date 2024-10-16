package gtu.cse.se.altefdirt.aymoose.shared.readmodel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

@Target(ElementType.TYPE)
@Component
public @interface QueryImpl {
    
}