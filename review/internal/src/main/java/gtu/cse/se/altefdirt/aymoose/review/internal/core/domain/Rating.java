package gtu.cse.se.altefdirt.aymoose.review.internal.core.domain;

import gtu.cse.se.altefdirt.aymoose.shared.domain.SingleValueObject;
import gtu.cse.se.altefdirt.aymoose.shared.domain.annotation.ValueObject;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@ValueObject
public record Rating(
    @NotNull @Max(5) @Min(1) short rating) implements SingleValueObject<Short> {    

    @Override
    public Short value() {
        return rating;
    }
}
