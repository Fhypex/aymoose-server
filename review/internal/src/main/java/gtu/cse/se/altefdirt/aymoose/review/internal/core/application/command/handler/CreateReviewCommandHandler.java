package gtu.cse.se.altefdirt.aymoose.review.internal.core.application.command.handler;

import org.apache.commons.lang3.NotImplementedException;

import gtu.cse.se.altefdirt.aymoose.review.internal.core.application.command.CreateReview;
import gtu.cse.se.altefdirt.aymoose.review.internal.core.application.model.ReservationData;
import gtu.cse.se.altefdirt.aymoose.review.internal.core.application.port.ReservationOperationPort;
import gtu.cse.se.altefdirt.aymoose.review.internal.core.application.service.ReviewService;
import gtu.cse.se.altefdirt.aymoose.review.internal.core.domain.Review;
import gtu.cse.se.altefdirt.aymoose.review.internal.core.domain.ReviewFactory;
import gtu.cse.se.altefdirt.aymoose.review.internal.core.domain.ReviewRepository;
import gtu.cse.se.altefdirt.aymoose.shared.application.CommandHandler;
import gtu.cse.se.altefdirt.aymoose.shared.application.annotation.RegisterHandler;
import lombok.RequiredArgsConstructor;

@RegisterHandler
@RequiredArgsConstructor
public class CreateReviewCommandHandler implements CommandHandler<CreateReview, Review> {

    private final ReviewFactory factory;
    private final ReservationOperationPort reservationOperationPort;
    private final ReviewRepository repository;
    private final ReviewService service;

    @Override
    public Review handle(CreateReview command) {

        ReservationData reservationData = reservationOperationPort.getReservationData(command.reservationId(), command.userId());

        if (service.isReviewExist(command.reservationId(), command.userId())) {
            throw new IllegalArgumentException("Review already exists");
        }
        Review review = factory.create(command.reservationId(), command.userId(), command.title(), command.content(), command.rating(), reservationData);
        return repository.save(review);
    }
}