package gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.impl.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.ReviewEntity;

interface ReviewRepository extends JpaRepository<ReviewEntity, String> {
    
}
