package online.marcoszinga.portfolio.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.marcoszinga.portfolio.exceptions.CapacidadNotFoundException;
import online.marcoszinga.portfolio.model.CapacidadesModel;
import online.marcoszinga.portfolio.repository.CapacidadesRepository;

@Service
@Transactional
public class CapacidadesService {

    private final CapacidadesRepository capacidadesRepository;
    
    @Autowired
    public CapacidadesService(CapacidadesRepository capacidadesRepository) {
        this.capacidadesRepository = capacidadesRepository;
    }



    public CapacidadesModel agregarCapacidades(CapacidadesModel capacidadesModel){
        return capacidadesRepository.save(capacidadesModel);
    }

    public List<CapacidadesModel> buscarCapacidades(){
        return capacidadesRepository.findAll();
    }

    public CapacidadesModel buscarCapacidadesPorId(Long id){
        return capacidadesRepository.findById(id).orElseThrow(() ->new CapacidadNotFoundException("Capacidad no encontrada"));
    }
    
    public CapacidadesModel editarCapacidades(CapacidadesModel capacidadesModel){
        return capacidadesRepository.save(capacidadesModel);
    }

    public void borrarCapacidades(Long id){
        capacidadesRepository.deleteById(id);
    }

    
}
