package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.impl.jpa;

import java.util.List;

import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindByUserIdAndFacilityId;
import gtu.cse.se.altefdirt.aymoose.review.internal.shared.jpa.ReviewEntity;
import gtu.cse.se.altefdirt.aymoose.shared.readmodel.QueryImpl;
import lombok.RequiredArgsConstructor;

@QueryImpl
@RequiredArgsConstructor
class FindByUserIdAndFacilityIdImpl implements FindByUserIdAndFacilityId {

    private final ReviewRepository reviewRepository;

    @Override
    public List<ReviewEntity> query(String userId, String facilityId) {
        return reviewRepository.findByUserIdAndFacilityId(userId, facilityId);
    }
}
