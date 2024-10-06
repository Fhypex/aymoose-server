package gtu.cse.se.altefdirt.aymoose.shared.domain;

import java.io.Serializable;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record AggregateId(
    @NotNull UUID id) implements SingleValueObject<UUID>, Serializable { 
    
    public static AggregateId generate() {
        return new AggregateId(UUID.randomUUID());
    }

    public static AggregateId of(UUID value) {
        return new AggregateId(value);
    }

    public static AggregateId of(String value) {
        return new AggregateId(UUID.fromString(value));
    }

    @Override
    public UUID value() {
        return id;
    }
}
