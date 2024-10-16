package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query;

import java.util.List;


import gtu.cse.se.altefdirt.aymoose.review.internal.shared.jpa.ReviewEntity;

public interface FindAll {
    
    List<ReviewEntity> query();
    
}
