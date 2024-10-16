package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.impl.jpa;

import java.util.List;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindByUserIdAndFacilityIdAndRatingLesser;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.util.Converter;
import gtu.cse.se.altefdirt.aymoose.review.internal.shared.jpa.ReviewEntity;
import gtu.cse.se.altefdirt.aymoose.shared.readmodel.QueryImpl;
import lombok.RequiredArgsConstructor;

@QueryImpl
@RequiredArgsConstructor
class FindByUserIdAndFacilityIdAndRatingLesserImpl implements FindByUserIdAndFacilityIdAndRatingLesser {

    private final ReviewRepository reviewRepository;

    @Override
    public List<ReviewEntity> query(String userId, String facilityId, String rating) {
        short rounded = Converter.convertRating(rating, false);
        return reviewRepository.findByUserIdAndFacilityIdAndRatingLessThan(userId, facilityId, rounded);
    }
}
