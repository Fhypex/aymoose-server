package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.impl.jpa;

import gtu.cse.se.altefdirt.aymoose.shared.readmodel.Query;

import java.util.List;

import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.Review;

@Query
interface SortCreationTime {

    public List<Review> queryAscending();

    public List<Review> queryDescending();
}