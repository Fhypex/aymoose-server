package gtu.cse.se.altefdirt.aymoose.review.internal.domain.author;

import gtu.cse.se.altefdirt.aymoose.shared.domain.FullName;
import gtu.cse.se.altefdirt.aymoose.shared.domain.SingleValueObject;
import jakarta.validation.constraints.NotNull;

public record Author(
    @NotNull FullName author) implements SingleValueObject<FullName> {    
    
    @Override
    public FullName value() {
        return author;
    }
}
