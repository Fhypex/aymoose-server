package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.impl.jpa;

import java.util.List;

import org.springframework.stereotype.Repository;

import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.ReviewEntity;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindAll;
import gtu.cse.se.altefdirt.aymoose.shared.readmodel.QueryImpl;
import lombok.RequiredArgsConstructor;

@QueryImpl
@RequiredArgsConstructor
class FindAllImpl implements FindAll {

    private final ReviewRepository reviewRepository;

    @Override
    public List<ReviewEntity> query() {
        return reviewRepository.findAll();
    }
    
}
