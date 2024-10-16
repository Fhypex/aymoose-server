package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.impl.jpa;

import java.util.List;

import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindByFacilityId;
import gtu.cse.se.altefdirt.aymoose.review.internal.shared.jpa.ReviewEntity;
import gtu.cse.se.altefdirt.aymoose.shared.readmodel.QueryImpl;
import lombok.RequiredArgsConstructor;

@QueryImpl
@RequiredArgsConstructor
class FindByFacilityIdImpl implements FindByFacilityId {

    private final ReviewRepository reviewRepository;

    @Override
    public List<ReviewEntity> query(String facilityId) {
        return reviewRepository.findByFacilityId(facilityId);  
    }
}
