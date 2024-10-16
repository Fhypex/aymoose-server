package gtu.cse.se.altefdirt.aymoose.review.api.rest.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindAll;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindById;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindByFacilityId;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindByUserId;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindByUserIdAndFacilityId;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindByUserIdAndFacilityIdAndRatingGreater;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindByUserIdAndFacilityIdAndRatingLesser;
import gtu.cse.se.altefdirt.aymoose.review.api.rest.dto.ReviewResponseDTO;
import gtu.cse.se.altefdirt.aymoose.shared.api.rest.version.ApiVersionV1;
import lombok.RequiredArgsConstructor;

@RestController
@ApiVersionV1
@RequiredArgsConstructor
class ReviewV1View {

    private final FindAll findAll;
    private final FindById findByAggregateId;
    private final FindByUserId findByUserId;
    private final FindByFacilityId findByFacilityId;
    private final FindByUserIdAndFacilityId findByUserIdAndFacilityId;
    private final FindByUserIdAndFacilityIdAndRatingGreater findByUserIdAndFacilityIdAndRatingGreater;
    private final FindByUserIdAndFacilityIdAndRatingLesser findByUserIdAndFacilityIdAndRatingLesser;


    private static final class Parameter {
        private static final String ID = "id";
        private static final String USER = "user";
        private static final String FACILITY = "facility";
        private static final String RATING = "rating";
    }
    
    @GetMapping(value = "/reviews")
    List<ReviewResponseDTO> getAllReviews() {
        return findAll.query().stream().map(ReviewResponseDTO::fromEntity).collect(Collectors.toUnmodifiableList());
    }

    @GetMapping(value = "/review/{id}")
    List<ReviewResponseDTO> getReviewById(@PathVariable(Parameter.ID) String id) {
        return findByAggregateId.query(id).stream().map(review -> ReviewResponseDTO.fromEntity(review)).collect(Collectors.toUnmodifiableList());
    }

    @GetMapping(value = "/reviews", params = Parameter.USER)
    List<ReviewResponseDTO> getReviewsByUser(@RequestParam(Parameter.USER) String userId) {
        return findByUserId.query(userId).stream().map(review -> ReviewResponseDTO.fromEntity(review)).collect(Collectors.toUnmodifiableList());
    }

    @GetMapping(value = "/reviews", params = Parameter.FACILITY)
    List<ReviewResponseDTO> getReviewsByFacility(@RequestParam(Parameter.FACILITY) String facilityId) {
        return findByFacilityId.query(facilityId).stream().map(review -> ReviewResponseDTO.fromEntity(review)).collect(Collectors.toUnmodifiableList());
    }

    @GetMapping(value = "/reviews", params = {Parameter.USER, Parameter.FACILITY})
    List<ReviewResponseDTO> getReviewsByUserAndFacility(@RequestParam(Parameter.USER) String userId, @RequestParam(Parameter.FACILITY) String facilityId) {
        return findByUserIdAndFacilityId.query(userId, facilityId).stream().map(review -> ReviewResponseDTO.fromEntity(review)).collect(Collectors.toUnmodifiableList());
    }

    @GetMapping(value = "/reviews", params = {Parameter.USER, Parameter.FACILITY, Parameter.RATING})
    List<ReviewResponseDTO> getReviewsByUserAndFacilityAndRatingGreater(@RequestParam(Parameter.USER) String userId, @RequestParam(Parameter.FACILITY) String facilityId, @RequestParam(Parameter.RATING) String rating) {
        return findByUserIdAndFacilityIdAndRatingGreater.query(userId, facilityId, rating).stream().map(review -> ReviewResponseDTO.fromEntity(review)).collect(Collectors.toUnmodifiableList());
    }

    /* @GetMapping(value = "/reviews", params = {Parameter.USER, Parameter.FACILITY, Parameter.RATING})
    List<ReviewResponseDTO> getReviewsByUserAndFacilityAndRatingLesser(@RequestParam(Parameter.USER) String userId, @RequestParam(Parameter.FACILITY) String facilityId, @RequestParam(Parameter.RATING) String rating) {
        return findByUserIdAndFacilityIdAndRatingLesser.query(userId, facilityId, rating).stream().map(review -> ReviewResponseDTO.fromEntity(review)).collect(Collectors.toUnmodifiableList());
    } */

    @GetMapping(value = "/reviews", params = {Parameter.FACILITY, Parameter.RATING})
    List<ReviewResponseDTO> getReviewsByFacilityAndRatingEqual(@RequestParam(Parameter.FACILITY) String facilityId, @RequestParam(Parameter.RATING) short rating) {
        throw new NotImplementedException("Not implemented yet");
    }
}
