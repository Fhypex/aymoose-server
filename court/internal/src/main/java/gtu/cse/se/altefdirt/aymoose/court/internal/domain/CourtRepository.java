package gtu.cse.se.altefdirt.aymoose.court.internal.domain;

import java.util.List;

import gtu.cse.se.altefdirt.aymoose.shared.domain.AggregateId;

public interface CourtRepository {
    
    Court save(Court court);

    Court findById(AggregateId id);

    List<Court> findAll();

}
