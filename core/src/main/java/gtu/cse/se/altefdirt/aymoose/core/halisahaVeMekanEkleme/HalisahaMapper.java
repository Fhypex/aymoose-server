package gtu.cse.se.altefdirt.aymoose.core.halisahaVeMekanEkleme;

import org.springframework.stereotype.Component;

@Component
public class HalisahaMapper {

    
    public HalisahaDTO toDTO(Halisaha halisaha) {
        return new HalisahaDTO(
            halisaha.getId(),           
            halisaha.getMekanId(),      
            halisaha.getOlculer(),      
            halisaha.getKapasite(),     
            halisaha.getAcilisSaati(),  
            halisaha.getKapanisSaati(),
            halisaha.getUcret()  
        );
    }

   
    public Halisaha toEntity(HalisahaDTO dto) {
        Halisaha halisaha = new Halisaha();
        halisaha.setId(dto.id());               
        halisaha.setMekanId(dto.mekanId());     
        halisaha.setOlculer(dto.olculer());     
        halisaha.setKapasite(dto.kapasite());  
        halisaha.setAcilisSaati(dto.acilisSaati()); 
        halisaha.setKapanisSaati(dto.kapanisSaati()); 
        halisaha.setUcret(dto.ucret());
        return halisaha;
    }
}
