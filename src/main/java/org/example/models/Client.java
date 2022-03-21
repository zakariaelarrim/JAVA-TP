package org.example.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "Client")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
////@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "client_type")
//@DiscriminatorValue("client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
//    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "client")
//    private List<Facture> factures;
//    @JoinTable(name="my_join_table_client_promotion",joinColumns = @JoinColumn(
//            name = "client_fk",
//            referencedColumnName = "id"
//    ),
//            inverseJoinColumns = @JoinColumn(
//                    name = "promotion_fk",
//                    referencedColumnName = "id"
//            ))
//    @ManyToMany(cascade = {CascadeType.PERSIST})
//    private List<Promotion> promotions;
//    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
//    private CarteFidelio carteFidelio;
    public Client(String name) {
        this.name = name;
    }
    public Client() {
    }
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}

