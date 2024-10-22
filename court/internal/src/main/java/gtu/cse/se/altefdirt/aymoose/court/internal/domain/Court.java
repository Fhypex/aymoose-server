package gtu.cse.se.altefdirt.aymoose.court.internal.domain;

import lombok.Getter;
import lombok.Setter;

import gtu.cse.se.altefdirt.aymoose.shared.domain.AggregateId;
import gtu.cse.se.altefdirt.aymoose.shared.domain.BaseAggregateRoot;

@Getter
@Setter
public class Court extends BaseAggregateRoot {
   
    public Court(AggregateId id, AggregateId facilityId, Measurements measurement, Capacity capacity) {
        super(id);
        this.facilityId = facilityId;
        this.measurements = measurements;
        this.capacity = capacity;
    }

    private AggregateId facilityId;

    private Measurements measurements;

    private Capacity capacity; 
}
