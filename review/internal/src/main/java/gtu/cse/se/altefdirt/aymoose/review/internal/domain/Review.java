package gtu.cse.se.altefdirt.aymoose.review.internal.domain;

import gtu.cse.se.altefdirt.aymoose.review.internal.domain.author.Author;
import gtu.cse.se.altefdirt.aymoose.review.internal.domain.comment.Comment;
import gtu.cse.se.altefdirt.aymoose.review.internal.domain.createdat.CreatedAt;
import gtu.cse.se.altefdirt.aymoose.review.internal.domain.rating.Rating;
import gtu.cse.se.altefdirt.aymoose.review.internal.domain.updatedat.UpdatedAt;
import gtu.cse.se.altefdirt.aymoose.shared.domain.AggregateId;
import gtu.cse.se.altefdirt.aymoose.shared.domain.BaseAggregateRoot;
import gtu.cse.se.altefdirt.aymoose.shared.domain.annotation.AggregateRoot;
import lombok.Getter;

@Getter
@AggregateRoot
public final class Review extends BaseAggregateRoot{

    private AggregateId userId;
    private AggregateId facilityId;
    private Author author;
    private Rating rating;
    private Comment comment;
    private CreatedAt createdAt;
    private UpdatedAt updatedAt;
    private boolean isPublished;
    private boolean isDeleted;
    
    public Review(AggregateId aggregateId, 
                  Author author, 
                  Comment comment, 
                  Rating rating, 
                  CreatedAt createdAt,
                  UpdatedAt updatedAt,
                  boolean isPublished, 
                  boolean isDeleted) {
        super(aggregateId);
        this.author = author;
        this.comment = comment;
        this.rating = rating;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.isPublished = isPublished;
        this.isDeleted = isDeleted;
    }

    public void markAsPublished() {
        this.isPublished = true;
    }

    public void markAsDeleted() {
        this.isDeleted = true;
    }

    public Author author() {
        return author;
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

    public boolean isPublished() {
        return isPublished;
    }

    public boolean isDeleted() {
        return isDeleted;
    }
}
