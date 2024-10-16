package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.impl.jpa;

import java.util.List;

import org.apache.commons.lang3.NotImplementedException;

import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.SortByCreatedAt;
import gtu.cse.se.altefdirt.aymoose.review.internal.shared.jpa.ReviewEntity;
import gtu.cse.se.altefdirt.aymoose.shared.readmodel.QueryImpl;
import lombok.RequiredArgsConstructor;

@QueryImpl
@RequiredArgsConstructor
class SortCreatedAtImpl implements SortByCreatedAt {

    private final ReviewRepository reviewRepository;

    @Override
    public List<ReviewEntity> queryAscending() {
        throw new NotImplementedException();
    }

    @Override
    public List<ReviewEntity> queryDescending() {
        throw new NotImplementedException();
    }
}
