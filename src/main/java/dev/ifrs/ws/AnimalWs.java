package dev.ifrs.ws;

import java.util.List;

import org.jboss.resteasy.annotations.jaxrs.FormParam;

import dev.ifrs.model.Animal;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/animal")
@Transactional
public class AnimalWs {

	@POST
	@Path("/cadastrar")
	@Produces(MediaType.APPLICATION_JSON)
	public Animal cadastrarAnimal(
	// @formatter:off
			@FormParam("nome") String nome,
			@FormParam("idade") int idade,
			@FormParam("especie") String especie
	// @formatter:on
	) {
		Animal animal = new Animal();

		animal.setNomeAnimal(nome);
		animal.setIdadeAnimal(idade);
		animal.setEspecieAnimal(especie);

		animal.persist();

		return animal;
	}

	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Animal> listarAnimais() {

		return Animal.listAll();
	}

}
