package gtu.cse.se.altefdirt.aymoose.review.internal.domain.createdat;

import java.time.Instant;

import gtu.cse.se.altefdirt.aymoose.shared.domain.SingleValueObject;
import gtu.cse.se.altefdirt.aymoose.shared.domain.annotation.ValueObject;
import jakarta.validation.constraints.NotNull;

@ValueObject
public record CreatedAt(
    @NotNull Instant creationTime) implements SingleValueObject<Instant> {   
        
    public static CreatedAt now() {
        return new CreatedAt(Instant.now());
    }

    @Override
    public Instant value() {
        return creationTime;
    }
}