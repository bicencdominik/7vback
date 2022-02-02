package osu.opr.erp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "_article")
public class Article {

    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "Name may not be null")
    private String name;
    private Double amount;
    private Double pricePerUnit;
    private String unit;

    @JsonIgnore
    @ManyToMany(
            mappedBy = "articles",                      // nastavit property !ne nazev tabulky !!!!
            cascade = CascadeType.ALL
    )
    private List<Order> orders;


}
