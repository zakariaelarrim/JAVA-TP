package org.example.models;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
//@PrimaryKeyJoinColumn(name =  "vip_id")
@DiscriminatorValue("normal")
public class ClientVip extends Client{
    private String preferences;
    public ClientVip(String name, String preferences) {
        super(name);
        this.preferences = preferences;
    }
}
