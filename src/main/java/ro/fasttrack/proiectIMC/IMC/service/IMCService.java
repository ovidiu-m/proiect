package ro.fasttrack.proiectIMC.IMC.service;

import org.springframework.stereotype.Service;
import ro.fasttrack.proiectIMC.IMC.domain.IMC;
import ro.fasttrack.proiectIMC.IMC.repository.IMCRepository;

import java.util.List;

@Service
public class IMCService {
    private final IMCRepository imcRepository;

    public IMCService(final IMCRepository imcRepository) {
        this.imcRepository = imcRepository;
    }
    public List<IMC> getAll(){
        return imcRepository.findAll();
    }
}
