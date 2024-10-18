package gtu.cse.se.altefdirt.aymoose.review.internal.core.domain;

import org.springframework.stereotype.Component;

import gtu.cse.se.altefdirt.aymoose.shared.domain.AggregateId;
import gtu.cse.se.altefdirt.aymoose.shared.domain.CreatedAt;
import gtu.cse.se.altefdirt.aymoose.shared.domain.UpdatedAt;

@Component
public class ReviewFactory {
    
    public Review create(AggregateId reservationId, AggregateId userId, AggregateId facilityId, Comment comment, Rating rating) {
        return new Review(AggregateId.generate(), reservationId, userId, facilityId, comment, rating, CreatedAt.now(), UpdatedAt.now(), false, false);
    }
}