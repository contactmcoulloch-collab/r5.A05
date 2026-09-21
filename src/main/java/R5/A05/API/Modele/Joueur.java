package R5.A05.API.Modele;

import java.sql.Date;

import org.jspecify.annotations.Nullable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table (name = "joueur")
public class Joueur {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "joueur_id")
   private Integer id;

 @Column(name = "nom")
  private String nom;

  @Column(name = "prenom")
  private String prenom;
@Column(name = "date_naissance")
  private Date date_naissance;
@Column(name = "taille")
  private int taille;
@Column(name = "poids")
  private int poids;
@Column(name = "numero_licence")
  private String numero_licence;
@Column(name = "statut")
  private String statut;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public Date getDate_naissance() {
    return date_naissance;
  }

  public void setDate_naissance(Date date_naissance) {
    this.date_naissance = date_naissance;
  }

  public int getTaille() {
    return taille;
  }

  public void setTaille(int taille) {
    this.taille = taille;
  }

  public int getPoids() {
    return poids;
  }

  public void setPoids(int poids) {
    this.poids = poids;
  }

  public String getNumero_licence() {
    return numero_licence;
  }

  public void setNumero_licence(String numero_licence) {
    this.numero_licence = numero_licence;
  }

  public String getStatut() {
    return statut;
  }

  public void setStatut(String statut) {
    this.statut = statut;
  }
}
