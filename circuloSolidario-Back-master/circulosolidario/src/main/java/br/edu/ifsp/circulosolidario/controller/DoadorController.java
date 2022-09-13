package br.edu.ifsp.circulosolidario.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.circulosolidario.model.Doador;
import br.edu.ifsp.circulosolidario.repository.DoadorRepository;

@CrossOrigin
@RestController
public class DoadorController {
    @GetMapping("/doador")
    public List<Doador> listaDoadores() {
        return DoadorRepository.all();
    }

    @GetMapping("/doador/{id}")
    public Doador recuperaDoadorPeloId(@PathVariable("id") int id) {
        return DoadorRepository.getByID(id);
    }

    @PostMapping("/recebeDoador")
    public void addDoador(@RequestBody Doador doador){
        DoadorRepository.add(doador);
    }

    @DeleteMapping("/deletaDoador/{id}")
    public boolean deletaDoador(@PathVariable("id") int id){
        boolean excluir = DoadorRepository.deletaPeloId(id-1);
        if(!excluir){
            return false;
        }
        return true;
    }
}
