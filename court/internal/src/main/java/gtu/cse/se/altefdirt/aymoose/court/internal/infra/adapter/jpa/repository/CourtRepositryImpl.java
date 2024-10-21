package gtu.cse.se.altefdirt.aymoose.court.internal.infra.adapter.jpa.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import gtu.cse.se.altefdirt.aymoose.court.internal.domain.Court;
import gtu.cse.se.altefdirt.aymoose.court.internal.domain.CourtRepository;
import gtu.cse.se.altefdirt.aymoose.court.internal.infra.adapter.jpa.CourtEntity;
import gtu.cse.se.altefdirt.aymoose.court.internal.infra.adapter.jpa.JpaCourtRepository;
import gtu.cse.se.altefdirt.aymoose.shared.domain.AggregateId;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CourtRepositryImpl implements CourtRepository {

    private final JpaCourtRepository jpaCourtRepository;

    @Override
    public Court save(Court court) {
        return jpaCourtRepository.save(CourtEntity.from(court)).toDomain();
    }

    @Override
    public Court findById(AggregateId id) {
        return jpaCourtRepository.findById(id.value()).get().toDomain();
    }

    @Override
    public List<Court> findAll() {
        return jpaCourtRepository.findAll().stream().map(CourtEntity::toDomain).collect(Collectors.toList());
    }
}