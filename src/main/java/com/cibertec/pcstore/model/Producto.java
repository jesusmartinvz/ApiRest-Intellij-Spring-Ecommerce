package com.cibertec.pcstore.model;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_producto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo", length = 10, nullable = false)
    private String codigo;

    @Column(length = 100, nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private BigDecimal precio;

    @Column(nullable = false)
    private Integer stock;

    @Column(nullable = false)
    private Integer garantia;

    @Column(length = 100, nullable = false)
    private String imagen;

    @Column(nullable = false)
    private BigDecimal descuento;

    //OPCION1
    /*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_categoria")
     */

    //OPCION2
    /*
    @OneToOne()
    @JoinColumn(name = "id_categoria")*/
    //@JsonBackReference(value = "id_categoria")
    //JsonIgnore
    //@JsonBackReference(value = "id_categoria")
    //@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
    //@JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_categoria", nullable = false)
    private Categoria categoria;

}