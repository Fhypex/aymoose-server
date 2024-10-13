package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Review {
    
    @Id
    private String aggregateId;
    private String reviewId;
    private String reviewContent;
    private String reviewDate;
    private String reviewRating;
    private String reviewStatus;
    private String reviewTitle;
    private String reviewType;
    private String userId;
}
