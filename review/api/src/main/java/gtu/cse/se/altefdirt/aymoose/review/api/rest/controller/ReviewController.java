package gtu.cse.se.altefdirt.aymoose.review.api.rest.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.ReviewEntity;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.impl.jpa.*;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindAll;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.query.FindByAggregateId;
import gtu.cse.se.altefdirt.aymoose.review.api.rest.dto.ReviewResponseDTO;
import gtu.cse.se.altefdirt.aymoose.review.api.rest.dto.ReviewSearchDTO;
import gtu.cse.se.altefdirt.aymoose.shared.api.rest.version.ApiVersionV1;
import gtu.cse.se.altefdirt.aymoose.shared.domain.AggregateId;
import gtu.cse.se.altefdirt.aymoose.shared.domain.Secret;
import lombok.RequiredArgsConstructor;

@RestController
@ApiVersionV1
@RequiredArgsConstructor
public class ReviewController {

    private final FindAll findAll;
    private final FindByAggregateId findByAggregateId;
    
    @GetMapping("/reviews")
    public List<ReviewResponseDTO> getAllReviews(ReviewSearchDTO reviewSearchDTO) {
        System.out.println(reviewSearchDTO);
        return findAll.query().stream().map(review -> ReviewResponseDTO.fromEntity(review)).collect(Collectors.toUnmodifiableList());
    }

    @GetMapping("/review/{id}")
    public List<ReviewResponseDTO> getReviewById(@PathVariable(value = "id") String id) {
        return findByAggregateId.query(AggregateId.of(id)).stream().map(review -> ReviewResponseDTO.fromEntity(review)).collect(Collectors.toUnmodifiableList());
    }

}
