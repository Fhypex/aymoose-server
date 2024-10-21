package gtu.cse.se.altefdirt.aymoose.court.internal.infra.adapter.jpa;

import java.time.Instant;
import java.util.List;
import java.util.Map;

import gtu.cse.se.altefdirt.aymoose.court.internal.domain.Capacity;
import gtu.cse.se.altefdirt.aymoose.court.internal.domain.Court;
import gtu.cse.se.altefdirt.aymoose.court.internal.domain.Measurements;
import gtu.cse.se.altefdirt.aymoose.court.internal.domain.TimeInterval;
import gtu.cse.se.altefdirt.aymoose.shared.domain.AggregateId;
import gtu.cse.se.altefdirt.aymoose.shared.domain.CreatedAt;
import gtu.cse.se.altefdirt.aymoose.shared.domain.UpdatedAt;
import io.micrometer.core.instrument.Measurement;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class CourtEntity {
    
    @Id
    private String id;
    private String facilityId;
    private int height;
    private int width;
    private int capacity;
    private String title;
    private String content;
    private List<Map<String, String>> timeIntervals;

    public static CourtEntity from(Court court) {
        return CourtEntity.builder()
            .id(court.id().value())
            .facilityId(court.getFacilityId().value())
            .height(court.getMeasurements().height())
            .width(court.getMeasurements().width())
            .capacity(court.getCapacity().capacity())
            .build();
    }

    public Court toDomain() {
        return new Court(
            AggregateId.from(this.id),
            AggregateId.from(this.facilityId),
            new Measurements(this.height, this.width),
            new Capacity(this.capacity)
        );
    }
}
