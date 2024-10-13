package gtu.cse.se.altefdirt.aymoose.core.halisahaVeMekanEkleme;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Halisaha {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long mekanId;

    @NotNull
    private String olculer;

    @NotNull
    private int kapasite;

    @NotNull
    private String acilisSaati;

    @NotNull
    private String kapanisSaati;

    @NotNull
    private double ucret;
}
