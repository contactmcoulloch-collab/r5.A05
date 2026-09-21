package R5.A05.API.Controller;

import org.springframework.data.jpa.repository.JpaRepository;
import  R5.A05.API.Modele.Joueur;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface JoueurRepository extends JpaRepository<Joueur, Integer> {

}