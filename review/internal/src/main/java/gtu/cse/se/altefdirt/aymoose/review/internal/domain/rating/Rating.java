package gtu.cse.se.altefdirt.aymoose.review.internal.domain.rating;

import gtu.cse.se.altefdirt.aymoose.shared.domain.SingleValueObject;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record Rating(
    @NotNull @Max(5) @Min(1) short rating) implements SingleValueObject<Short> {    

    @Override
    public Short value() {
        return rating;
    }
}
