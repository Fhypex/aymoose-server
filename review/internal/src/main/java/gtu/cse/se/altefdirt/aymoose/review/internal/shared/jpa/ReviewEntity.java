package gtu.cse.se.altefdirt.aymoose.review.internal.shared.jpa;

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
    private String id;
    private String userId;
    private String facilityId;
    private String author;
    private short rating;
    private String title;
    private String content;
    private Instant createdAt;
    private Instant updatedAt;
}
