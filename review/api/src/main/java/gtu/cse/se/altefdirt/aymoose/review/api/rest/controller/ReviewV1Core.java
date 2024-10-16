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
class ReviewV1Core {

    private static final class Parameter {
        private static final String ID = "id";
        private static final String USER = "user";
        private static final String FACILITY = "facility";
        private static final String RATING = "rating";
    }
    
}
