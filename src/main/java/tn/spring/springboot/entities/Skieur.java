package tn.spring.springboot.entities;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Skieur implements Serializable {
    @Id
    @GeneratedValue
    long numSkieur;
    String nomS;
    String prenomS;
    @Temporal(TemporalType.DATE)
    Date dateNaissance;
    String ville;

}
