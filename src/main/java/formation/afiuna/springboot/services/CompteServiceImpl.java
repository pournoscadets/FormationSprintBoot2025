package formation.afiuna.springboot.services;

import formation.afiuna.springboot.entity.Compte;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompteServiceImpl implements CompteService {

    List<Compte> comptes = List.of(
            new Compte(12,25, 20000, null),
            new Compte(13,245, 20000, null),
            new Compte(14,200, 20000, null)
    );

    @Override
    public Compte findById(int id) {
        return null;
    }

    @Override
    public List<Compte> findAll() {
        return List.of();
    }
}
