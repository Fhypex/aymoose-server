package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query;


import gtu.cse.se.altefdirt.aymoose.review.internal.shared.jpa.ReviewEntity;
import gtu.cse.se.altefdirt.aymoose.shared.readmodel.Query;

import java.util.List;

@Query
public interface FindByUserId {

    List<ReviewEntity> query(String userId);
}