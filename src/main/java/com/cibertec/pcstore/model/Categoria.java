package com.cibertec.pcstore.model;


import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_categoria")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Categoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String desCategoria;

    //mappedBy = "categoria", fetch = FetchType.LAZY, cascade = CascadeType.ALL
    //@OneToMany(mappedBy = "categoria")

    //@JsonManagedReference(value = "categoria")
    //@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
    @JsonIgnore
    @OneToMany(mappedBy = "categoria")
    private Set<Producto> producto;
}
