package tn.spring.springboot.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Moniteur implements Serializable{
    @Id
    @GeneratedValue
    long numMoniteur;
    String nomM;
    String prenomM;
    @Temporal(TemporalType.DATE)
    Date dateRecru ;
}
