package com.dio.time_clock.service;

import com.dio.time_clock.model.JornadaTrabalho;
import com.dio.time_clock.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {

    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    @Autowired
    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository) {
        this.jornadaTrabalhoRepository = jornadaTrabalhoRepository;
    }

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
        return this.jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {

        return this.jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long id) {
        JornadaTrabalho byId = this.jornadaTrabalhoRepository.getById(id);
        return Optional.of(byId);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return this.jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public void delete(Long id) {
         this.jornadaTrabalhoRepository.deleteById(id);
    }
}
