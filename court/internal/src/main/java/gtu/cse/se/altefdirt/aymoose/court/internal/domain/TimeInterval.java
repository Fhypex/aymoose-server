package gtu.cse.se.altefdirt.aymoose.court.internal.domain;

import java.time.Instant;

public record TimeInterval(
    Instant startTime,
    Instant endTime)
    {
}

