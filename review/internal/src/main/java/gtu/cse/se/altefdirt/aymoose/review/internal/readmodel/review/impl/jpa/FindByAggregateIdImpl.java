package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.impl.jpa;

import java.util.Optional;

import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.ReviewEntity;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindByAggregateId;
import gtu.cse.se.altefdirt.aymoose.shared.domain.AggregateId;
import gtu.cse.se.altefdirt.aymoose.shared.readmodel.QueryImpl;
import lombok.RequiredArgsConstructor;

@QueryImpl
@RequiredArgsConstructor
class FindByAggregateIdImpl implements FindByAggregateId {

    private final ReviewRepository reviewRepository;

    @Override
    public Optional<ReviewEntity> query(AggregateId aggregateId) {
        return reviewRepository.findById(aggregateId.value());  
    }
}
