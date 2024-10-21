package gtu.cse.se.altefdirt.aymoose.court.internal.application.model;

import gtu.cse.se.altefdirt.aymoose.court.internal.domain.Capacity;
import gtu.cse.se.altefdirt.aymoose.court.internal.domain.Court;
import gtu.cse.se.altefdirt.aymoose.court.internal.domain.Measurements;
import gtu.cse.se.altefdirt.aymoose.shared.domain.AggregateId;

public record CourtView (
    String id,
    String facilityId,
    String height,
    String width,
    int capacity
)
{
    public static CourtView fromDomain(Court court) {
        return new CourtView(
            court.id().value(),
            court.getFacilityId().value(),
            court.getMeasurements().height().toString(),
            court.getMeasurements().width().toString(),
            court.getCapacity().capacity()
        );
    }
}
