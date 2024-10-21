package gtu.cse.se.altefdirt.aymoose.review.api.rest.dto;

import gtu.cse.se.altefdirt.aymoose.court.internal.application.model.CourtView;
import lombok.Builder;

@Builder
public record CourtResponseDTO(
    String id,
    String height,
    String width,
    int capacity
)
{
    public static CourtResponseDTO from(CourtView courtView) {
        return CourtResponseDTO.builder()
            .id(courtView.id())
            .height(courtView.height())
            .width(courtView.width())
            .capacity(courtView.capacity())
            .build();
    }
}