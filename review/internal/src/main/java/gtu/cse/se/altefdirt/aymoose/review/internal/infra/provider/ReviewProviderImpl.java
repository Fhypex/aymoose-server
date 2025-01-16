package gtu.cse.se.altefdirt.aymoose.review.internal.infra.provider;

import java.util.List;
import org.springframework.stereotype.Component;
import gtu.cse.se.altefdirt.aymoose.review.api.provider.ReviewProvider;
import gtu.cse.se.altefdirt.aymoose.review.internal.domain.Rating;
import gtu.cse.se.altefdirt.aymoose.review.internal.domain.Review;
import gtu.cse.se.altefdirt.aymoose.review.internal.domain.ReviewRepository;
import gtu.cse.se.altefdirt.aymoose.shared.application.ReviewData;
import gtu.cse.se.altefdirt.aymoose.shared.domain.AggregateId;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
class ReviewProviderImpl implements ReviewProvider {

    private final ReviewRepository repository;

    @Override
    public String getAverageRatingByFacilityId(AggregateId facilityId) {
        List<Review> reviews = repository.findByFacilityId(facilityId);
        if (reviews.isEmpty()) {
            return "0";
        }
        List<Rating> ratings = reviews.stream().map(Review::rating).toList();
        short leadingAvg = 0;
        for (Rating rating : ratings) {
            leadingAvg += rating.leading();
        }
        return String.format("%.1f", (double) leadingAvg / (double) ratings.size());
    }

    @Override
    public String getAverageRatingByUserId(AggregateId userId) {
        return "0.0";
    }

    @Override
    public int getReviewCountByFacilityId(AggregateId facilityId) {
        return repository.findByFacilityId(facilityId).size();
    }

    @Override
    public int getReviewCountByUserId(AggregateId userId) {
        return 0;
    }

    @Override
    public List<ReviewData> getReviewsByFaciliyId(AggregateId facilityId) {
        return null;
    }

    @Override
    public List<ReviewData> getReviewsByUserId(AggregateId userId) {
        return null;
    }
}
