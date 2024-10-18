package gtu.cse.se.altefdirt.aymoose.review.internal.core.application.command.handler;

import org.apache.commons.lang3.NotImplementedException;

import gtu.cse.se.altefdirt.aymoose.review.internal.core.application.command.CreateReview;
import gtu.cse.se.altefdirt.aymoose.review.internal.core.application.command.DisableReview;
import gtu.cse.se.altefdirt.aymoose.review.internal.core.domain.Review;
import gtu.cse.se.altefdirt.aymoose.shared.application.CommandHandler;
import gtu.cse.se.altefdirt.aymoose.shared.application.annotation.RegisterHandler;

@RegisterHandler
public class DisableReviewCommandHandler implements CommandHandler<DisableReview, Review> {

    @Override
    public Review handle(DisableReview command) {
        throw new NotImplementedException();
    }
}