package gtu.cse.se.altefdirt.aymoose.review.api.rest.dto;

import gtu.cse.se.altefdirt.aymoose.review.internal.domain.Review;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.ReviewEntity;
import lombok.Builder;

@Builder
public class ReviewResponseDTO
{
    private String id;
    private String author;
    private short rating;
    private String title;
    private String content;
    private String createdAt;
    private String updatedAt;

    public static ReviewResponseDTO fromDomain(Review review) {
        return new ReviewResponseDTO(review.id().value(), 
                                     review.author().fullName().value(), 
                                     review.rating().value(), 
                                     review.comment().title(), 
                                     review.comment().content(), 
                                     review.createdAt().value().toString(), 
                                     review.updatedAt().value().toString());
    }


    public static ReviewResponseDTO fromEntity(ReviewEntity reviewEntity) {
        return new ReviewResponseDTO(reviewEntity.getAggregateId(),
                                     reviewEntity.getAuthor(),
                                     reviewEntity.getReviewRating(), 
                                     reviewEntity.getReviewTitle(), 
                                     reviewEntity.getReviewContent(),
                                     reviewEntity.getCreatedAt().toString(),
                                     reviewEntity.getUpdatedAt().toString());
    }



}