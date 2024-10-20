package gtu.cse.se.altefdirt.aymoose.review.internal.application.command;

import gtu.cse.se.altefdirt.aymoose.shared.application.Command;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record UpdateReview(
        @NotBlank(message = "User ID cannot be null or empty")
        String reviewId,

        @NotBlank(message = "Review cannot be null or empty")
        String title,

        @NotBlank(message = "Review cannot be null or empty")
        String content,

        @Min(value = 1, message = "Rating must be between 1 and 5")
        @Max(value = 5, message = "Rating must be between 1 and 5")
        short rating
) implements Command {
}