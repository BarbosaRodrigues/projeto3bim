package br.edu.ifsp.circulosolidario.repository;

import java.util.ArrayList;

import br.edu.ifsp.circulosolidario.model.Doador;

public class DoadorRepository {
    private static DoadorRepository repo;
    private ArrayList<Doador> doadores;

    private DoadorRepository() {
        this.doadores = new ArrayList<>();
    }

    public static void init() {
        if (DoadorRepository.repo == null) {
            DoadorRepository.repo = new DoadorRepository();
            DoadorRepository.add(new Doador("Tais", "tais@gmail.com", "1234"));
            DoadorRepository.add(new Doador("Ana", "ana@gmail.com", "5678"));
        }
    }

    public static void add(Doador doador) {
        DoadorRepository.repo.doadores.add(doador);
    }

    public static ArrayList<Doador> all() {
        return DoadorRepository.repo.doadores;
    }

    public static Doador getByID(int id) {
        return DoadorRepository.repo.doadores.stream().filter((doador) -> doador.getId() == id).toList().get(0);
    }

    public static boolean deletaPeloId(int id){
        DoadorRepository.repo.doadores.remove(id);
        return true;
    }
}
