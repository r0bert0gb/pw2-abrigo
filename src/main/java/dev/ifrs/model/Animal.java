package dev.ifrs.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Animal extends PanacheEntity {

	private String nomeAnimal;
	private int idadeAnimal;
	private String especieAnimal;
}
