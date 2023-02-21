package com.api.condominiumcontrol.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "CONDOMINIUM")
@Data
public class CondominiumModel implements Serializable {
    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    private long businessNumber;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usersCeo")
    @JoinColumn(name = "CEO_ID")
    private List<CeoModel> ceos;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "phoneNumbers")
    @JoinColumn(name = "CEO_ID")
    private  List<PhoneNumber> phoneNumbers;



}
