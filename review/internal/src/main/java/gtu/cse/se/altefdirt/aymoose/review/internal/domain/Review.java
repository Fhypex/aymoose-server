package gtu.cse.se.altefdirt.aymoose.review.internal.domain;

import gtu.cse.se.altefdirt.aymoose.review.internal.domain.author.Author;
import gtu.cse.se.altefdirt.aymoose.review.internal.domain.comment.Comment;
import gtu.cse.se.altefdirt.aymoose.review.internal.domain.creationtime.CreationTime;
import gtu.cse.se.altefdirt.aymoose.review.internal.domain.rating.Rating;
import gtu.cse.se.altefdirt.aymoose.shared.domain.AggregateId;
import gtu.cse.se.altefdirt.aymoose.shared.domain.BaseAggregateRoot;
import gtu.cse.se.altefdirt.aymoose.shared.domain.annotation.AggregateRoot;
import lombok.Getter;

@Getter
@AggregateRoot
public final class Review extends BaseAggregateRoot{

    private Author author;
    private Comment comment;
    private Rating rating;
    private CreationTime creationTime;
    private boolean isPublished;
    private boolean isDeleted;
    
    public Review(AggregateId aggregateId, Author author, Comment comment, Rating rating, CreationTime creationTime, boolean isPublished, boolean isDeleted) {
        super(aggregateId);
        this.author = author;
        this.comment = comment;
        this.rating = rating;
        this.creationTime = CreationTime.now();
        this.isPublished = false;
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

    public CreationTime creationTime() {
        return creationTime;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public boolean isDeleted() {
        return isDeleted;
    }
}
