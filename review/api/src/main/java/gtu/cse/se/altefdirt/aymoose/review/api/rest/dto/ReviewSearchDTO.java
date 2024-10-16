package gtu.cse.se.altefdirt.aymoose.review.api.rest.dto;

import gtu.cse.se.altefdirt.aymoose.review.internal.domain.Review;
import gtu.cse.se.altefdirt.aymoose.review.internal.readmodel.review.ReviewEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@ToString
@Setter
public class ReviewSearchDTO
{
    private String user;
    private String facility;
    private String rating;
    private String createdAt;
    private String updatedAt;
    private String sort;
    private String dir;
}