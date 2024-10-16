package gtu.cse.se.altefdirt.aymoose.review.internal.domain.author;

import gtu.cse.se.altefdirt.aymoose.shared.domain.FullName;
import gtu.cse.se.altefdirt.aymoose.shared.domain.SingleValueObject;
import gtu.cse.se.altefdirt.aymoose.shared.domain.annotation.ValueObject;
import jakarta.validation.constraints.NotNull;

@ValueObject
public record Author(
    @NotNull FullName fullName) implements SingleValueObject<FullName> {    
    
    @Override
    public FullName value() {
        return fullName;
    }
}
