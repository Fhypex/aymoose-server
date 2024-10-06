package gtu.cse.se.altefdirt.aymoose.review.api.rest.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * Data Transfer Object (DTO) for adding a review.
 * 
 * This record encapsulates the necessary information required to submit a review, 
 * including the review text and a rating. The fields are validated to ensure 
 * they meet certain criteria before processing.
 * 
 * <p>The following validation rules apply:</p>
 * <ul>
 *     <li><strong>Review:</strong> Must not be blank and must be between 3 and 20 characters in length.</li>
 *     <li><strong>Rating:</strong> Must be between 1 and 5.</li>
 * </ul>
 * 
 * @param review The text of the review. Cannot be blank and must have a length 
 *               between 3 and 20 characters.
 * @param rating The rating associated with the review. Must be a short value 
 *               between 1 and 5 inclusive.
 */
public record AddReviewRequestDTO(
    
    @NotBlank(message = "Review cannot be blank")
    @Size(min = 3, max = 20, message = "Review must be between 3 and 20 characters")
    String review, 
    
    @Size(min = 1, max = 5, message = "Rating must be between 1 and 5")
    short rating
) {
}