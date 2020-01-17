package dev.dao;

import dev.entite.Plat;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface IPlatDao {
    List<Plat> listerPlats();
    void ajouterPlat(String nomPlat, Integer prixPlat);
}
