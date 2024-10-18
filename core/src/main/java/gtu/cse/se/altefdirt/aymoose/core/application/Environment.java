package gtu.cse.se.altefdirt.aymoose.core.application;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import gtu.cse.se.altefdirt.aymoose.shared.application.Command;
import gtu.cse.se.altefdirt.aymoose.shared.application.CommandHandler;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Environment {

    private final CommandHandlerRegistry registry;
    
    @SuppressWarnings("unchecked")
    public <R, C extends Command> R run(C command) {
        CommandHandler<C, R> handler = (CommandHandler<C, R>) registry.getHandler(command.getClass());
        if (handler != null) {
            return handler.handle(command);
        } else {
            throw new IllegalArgumentException("No handler found for command: " + command.getClass().getSimpleName());
        }
    }
}