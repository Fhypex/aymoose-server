package gtu.cse.se.altefdirt.aymoose.review.internal.core.application.port;

import gtu.cse.se.altefdirt.aymoose.review.internal.core.application.model.ReservationData;

public interface ReservationOperationPort {
    
    ReservationData getReservationData(String reservationId, String userId);
}
