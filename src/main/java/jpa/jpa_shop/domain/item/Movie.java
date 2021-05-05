package jpa.jpa_shop.domain.item;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
@Data
public class Movie extends Item{
    private String director;

    private String actor;

}