package tn.spring.springboot.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Piste implements Serializable {
    @Id
    @GeneratedValue
 long numPiste;
  String nomPiste;
    Couleur couleur;
    int longeur;
    int pente;


}
