package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.impl.jpa;

import java.util.List;

import org.springframework.stereotype.Repository;

import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.Review;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.All;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
class AllImpl implements All {

    private final ReviewRepository reviewRepository;

    @Override
    public List<Review> query() {
        return reviewRepository.findAll();
    }
    
}
