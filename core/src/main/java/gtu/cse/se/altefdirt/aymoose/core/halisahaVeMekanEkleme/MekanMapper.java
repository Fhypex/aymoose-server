package gtu.cse.se.altefdirt.aymoose.core.halisahaVeMekanEkleme;

import org.springframework.stereotype.Component;

@Component
public class MekanMapper {
    public MekanDTO toDTO(Mekan mekan) {
        return new MekanDTO(
            mekan.getId(),
            mekan.getKullaniciId(),
            mekan.getKonum(),
            mekan.getIletisimBilgileri()
        );
    }

    public Mekan toEntity(MekanDTO dto) {
        Mekan mekan = new Mekan();
        mekan.setId(dto.id());
        mekan.setKullaniciId(dto.kullaniciId());
        mekan.setKonum(dto.konum());
        mekan.setIletisimBilgileri(dto.iletisimBilgileri());
        return mekan;
    }
}
