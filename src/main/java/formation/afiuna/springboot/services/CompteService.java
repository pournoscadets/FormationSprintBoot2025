package formation.afiuna.springboot.services;

import formation.afiuna.springboot.entity.Compte;

import java.util.List;

public interface CompteService {
    Compte findById(int id);
    List<Compte> findAll();
}
