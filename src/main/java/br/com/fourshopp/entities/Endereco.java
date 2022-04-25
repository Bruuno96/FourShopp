package br.com.fourshopp.entities;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@SequenceGenerator(name = "endereco", sequenceName = "sq_endereco", allocationSize = 1)
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cd_endereco")
    @GeneratedValue(generator = "endereco", strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nm_rua")
    private String rua;

    @Column(name = "nm_cidade")
    private String cidade;

    @Column(name = "nm_bairro")
    private String bairro;

    @Column(name = "nr_numero")
    private int numero;

}