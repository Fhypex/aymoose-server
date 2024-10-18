package gtu.cse.se.altefdirt.aymoose.review.internal.core.domain;

import gtu.cse.se.altefdirt.aymoose.shared.domain.AggregateId;
import gtu.cse.se.altefdirt.aymoose.shared.domain.BaseAggregateRoot;
import gtu.cse.se.altefdirt.aymoose.shared.domain.CreatedAt;
import gtu.cse.se.altefdirt.aymoose.shared.domain.UpdatedAt;
import gtu.cse.se.altefdirt.aymoose.shared.domain.annotation.AggregateRoot;
import lombok.Getter;

@Getter
@AggregateRoot
public final class Review extends BaseAggregateRoot{

    private AggregateId userId;
    private AggregateId reservationId;
    private AggregateId facilityId;
    private Rating rating;
    private Comment comment;
    private CreatedAt createdAt;
    private UpdatedAt updatedAt;
    private boolean isNeedsModeration;
    private boolean isDisabled;
    
    public Review(AggregateId aggregateId, 
                  AggregateId reservationId,
                  AggregateId userId,
                  AggregateId facilityId,
                  Comment comment, 
                  Rating rating, 
                  CreatedAt createdAt,
                  UpdatedAt updatedAt,
                  boolean isNeedsModeration,
                  boolean isDisabled) {
        super(aggregateId);
        this.reservationId = reservationId;
        this.userId = userId;
        this.facilityId = facilityId;
        this.comment = comment;
        this.rating = rating;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.isNeedsModeration = isNeedsModeration;
        this.isDisabled = isDisabled;

    }

    public void disable() {
        this.isDisabled = true;
    }

    public void enable() {
        this.isDisabled = false;
    }

    public void markAsNeedsModeration() {
        this.isNeedsModeration = true;
    }

    public Comment comment() {
        return comment;
    }

    public Rating rating() {
        return rating;
    }

    public CreatedAt createdAt() {
        return this.createdAt;
    }

    public UpdatedAt updatedAt() {
        return this.updatedAt;
    }
}
