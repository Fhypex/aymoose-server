package gtu.cse.se.altefdirt.aymoose.review.internal.domain.comment;

import gtu.cse.se.altefdirt.aymoose.shared.domain.SingleValueObject;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record Comment(
    @NotNull @Size(min = 3, max = 255) String comment) implements SingleValueObject<String> {

    @Override
    public String value() {
        return comment;
    }
}
