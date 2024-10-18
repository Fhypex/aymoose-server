package gtu.cse.se.altefdirt.aymoose.review.api.rest.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gtu.cse.se.altefdirt.aymoose.review.internal.core.application.command.CreateReview;
import gtu.cse.se.altefdirt.aymoose.review.internal.core.domain.Review;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindAll;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindById;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindByFacilityId;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindByUserId;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindByUserIdAndFacilityId;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindByUserIdAndFacilityIdAndRatingGreater;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindByUserIdAndFacilityIdAndRatingLesser;
import gtu.cse.se.altefdirt.aymoose.core.application.Environment;
import gtu.cse.se.altefdirt.aymoose.review.api.rest.dto.CreateReviewRequestDTO;
import gtu.cse.se.altefdirt.aymoose.review.api.rest.dto.ReviewResponseDTO;
import gtu.cse.se.altefdirt.aymoose.shared.api.rest.version.ApiVersionV1;
import lombok.RequiredArgsConstructor;

@RestController
@ApiVersionV1
@RequiredArgsConstructor
class ReviewCommandV1Controller {

    private final Environment environment;


    @PostMapping("/reviews")
    public ResponseEntity<Review> createReview(@RequestBody CreateReviewRequestDTO request) {
        Review review = environment.run(new CreateReview(request.reservationId(), request.title(), request.content(), request.rating()));
        return ResponseEntity.ok(review);
    }

    
}
