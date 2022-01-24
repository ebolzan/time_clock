package com.dio.time_clock.controller;

import com.dio.time_clock.model.JornadaTrabalho;
import com.dio.time_clock.service.JornadaTrabalhoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    JornadaTrabalhoService jornadaTrabalhoService;

    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
       return this.jornadaTrabalhoService.save(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaTrabalhoService.findAll();
    }

    @GetMapping("/{idJornada}")
    public JornadaTrabalho getJornadaByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        JornadaTrabalho jornada_não_econtroada = jornadaTrabalhoService.getById(idJornada).orElseThrow(() -> new Exception("Jornada não econtroada"));
        return jornada_não_econtroada;

    }



}
