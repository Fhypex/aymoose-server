package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.impl.jpa;

import java.util.Optional;

import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindById;
import gtu.cse.se.altefdirt.aymoose.review.internal.shared.jpa.ReviewEntity;
import gtu.cse.se.altefdirt.aymoose.shared.readmodel.QueryImpl;
import lombok.RequiredArgsConstructor;

@QueryImpl
@RequiredArgsConstructor
class FindByIdImpl implements FindById {

    private final ReviewRepository reviewRepository;

    @Override
    public Optional<ReviewEntity> query(String id) {
        return reviewRepository.findById(id);  
    }
}
