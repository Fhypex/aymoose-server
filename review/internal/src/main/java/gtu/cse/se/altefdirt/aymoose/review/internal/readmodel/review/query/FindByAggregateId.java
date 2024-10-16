package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query;

import gtu.cse.se.altefdirt.aymoose.shared.domain.AggregateId;
import gtu.cse.se.altefdirt.aymoose.shared.readmodel.Query;

import java.util.List;
import java.util.Optional;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.ReviewEntity;

@Query
public interface FindByAggregateId {

    Optional<ReviewEntity> query(AggregateId aggregateId);
}