package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.impl.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.Review;
import gtu.cse.se.altefdirt.aymoose.shared.domain.AggregateId;

interface ReviewRepository extends JpaRepository<Review, String> {
    
}
