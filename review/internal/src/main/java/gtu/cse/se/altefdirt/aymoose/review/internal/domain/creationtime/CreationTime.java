package gtu.cse.se.altefdirt.aymoose.review.internal.domain.creationtime;

import java.time.Instant;

import gtu.cse.se.altefdirt.aymoose.shared.domain.SingleValueObject;

import jakarta.validation.constraints.NotNull;

public record CreationTime(
    @NotNull Instant creationTime) implements SingleValueObject<Instant> {   
        
    public static CreationTime now() {
        return new CreationTime(Instant.now());
    }

    @Override
    public Instant value() {
        return creationTime;
    }
}