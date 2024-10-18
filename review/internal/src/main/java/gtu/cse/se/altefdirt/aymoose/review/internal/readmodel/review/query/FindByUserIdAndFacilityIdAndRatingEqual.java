package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query;

import gtu.cse.se.altefdirt.aymoose.shared.readmodel.Query;

import java.util.List;

import gtu.cse.se.altefdirt.aymoose.review.internal.shared.jpa.ReviewEntity;

@Query
public interface FindByUserIdAndFacilityIdAndRatingEqual {

    List<ReviewEntity> query(String userId, String facilityId, String rating);
}