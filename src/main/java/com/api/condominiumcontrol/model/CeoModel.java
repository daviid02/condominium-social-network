package com.api.condominiumcontrol.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "CEO")
@Data
public class CeoModel implements Serializable {
    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    private String phoneNumber;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="ADDRESS_ID")
    private AddressModel addressModel;

    @ManyToOne()
    @JoinColumn(name = "condominium_id")
    private CondominiumModel usersCeo;

}
