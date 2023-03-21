package tn.spring.springboot.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
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
public class Cours implements Serializable {
    @Id
    @GeneratedValue
    long numCours;
    int niveau;
    @Enumerated
    TypeCours typeCours;
    @Enumerated
    Support support;
    float prix;
    int crenau ;

}
