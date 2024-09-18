package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;
import java.util.List;

@Entity
@Table(name = "domicilio")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private int numero;

    // Relación unidireccional one-to-many con Localidad
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private List<Localidad> localidades;
}
