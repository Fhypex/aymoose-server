package gtu.cse.se.altefdirt.aymoose.account.internal.application.command.handler;

import java.util.List;

import gtu.cse.se.altefdirt.aymoose.account.internal.application.command.UpdateProfilePicture;
import gtu.cse.se.altefdirt.aymoose.account.internal.application.port.ImageOperationPort;
import gtu.cse.se.altefdirt.aymoose.account.internal.domain.Account;
import gtu.cse.se.altefdirt.aymoose.account.internal.domain.AccountRepository;
import gtu.cse.se.altefdirt.aymoose.shared.application.CommandHandler;
import gtu.cse.se.altefdirt.aymoose.shared.application.ImageData;
import gtu.cse.se.altefdirt.aymoose.shared.application.annotation.RegisterHandler;
import gtu.cse.se.altefdirt.aymoose.shared.domain.AggregateId;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RegisterHandler
@RequiredArgsConstructor
@Slf4j
class UpdateProfilePictureCommandHandler implements CommandHandler<UpdateProfilePicture, AggregateId> {

    private final AccountRepository accountRepository;
    private final ImageOperationPort imageOperationPort;

    @Override
    public AggregateId handle(UpdateProfilePicture command) {

        Account account = accountRepository.findById(command.userId())
                .orElseThrow(() -> new RuntimeException("Account not found"));

        List<ImageData> images = imageOperationPort.findByRelationId(account.id());
        if (!images.isEmpty()) {
            imageOperationPort.deleteByRelationId(account.id());
        }

        // TODO : Add image validation
        log.info("Saving image for account {} with image {}", account.id(), command.image().getOriginalFilename());

        imageOperationPort.save(account.id(), command.image());

        return account.id();
    }
}