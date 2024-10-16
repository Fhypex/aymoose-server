package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review;

import java.time.Instant;

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
public class ReviewEntity {
    
    @Id
    private String aggregateId;
    private String userId;
    private String facilityId;
    private String author;
    private short reviewRating;
    private String reviewTitle;
    private String reviewContent;
    private Instant createdAt;
    private Instant updatedAt;
}
