package test;

import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.dozer.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gop.expertec.dto.ClientDTO;
import com.gop.expertec.dto.PersonneDTO;
import com.gop.expertec.dto.string.PersonneDtoString;
import com.gop.expertec.entite.Client;
import com.gop.expertec.entite.Personne;
import com.gop.expertec.entity.Customer;
import com.gop.expertec.entity.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/test-context.xml")
public class TestDozer {

	private static final Logger logger = Logger.getLogger(TestDozer.class);

	// Le Mapper est déclaré dans le fichier
	// /src/test/resources/test-context.xml
	@Autowired
	Mapper mapper;

	/**
	 * Enrichi la personne passé en paramètre
	 * 
	 * @param personne
	 */
	private void initPersonne(Personne personne) {

		try {
			// Init d'une personne et de ses enfants
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			personne.setNom("Skywalker");
			personne.setPrenom("Anakin");
			personne.setDateNaissance(sdf.parse("25/05/1977"));

			Personne enfant1 = new Personne();
			enfant1.setNom("Skywalker");
			enfant1.setPrenom("Luke");
			enfant1.setDateNaissance(sdf.parse("19/08/1997"));

			Personne enfant2 = new Personne();
			enfant2.setNom("Skywalker");
			enfant2.setPrenom("Leia");
			enfant2.setDateNaissance(sdf.parse("19/08/1997"));

			personne.setEnfants(new ArrayList<Personne>());
			personne.getEnfants().add(enfant1);
			personne.getEnfants().add(enfant2);

		} catch (ParseException e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}

	private void controlerEquivalencePersonne(Personne personne,
			PersonneDTO personneDTO) {

		if ((personne == null && personneDTO != null)
				|| (personne != null && personneDTO == null)) {
			fail();
		}
		if (personne != null && personneDTO != null) {

			if (!personne.getNom().equals(personneDTO.getNom())) {
				fail();
			}
			if (!personne.getPrenom().equals(personneDTO.getPrenom())) {
				fail();
			}
			if (!personne.getDateNaissance().equals(
					personneDTO.getDateNaissance())) {
				fail();
			}
			if (personne.getEnfants() != null
					&& personneDTO.getEnfants() == null) {
				fail();
			}
			if (personne.getEnfants() == null
					&& personneDTO.getEnfants() != null) {
				fail();
			}
			if (personne.getEnfants() != null
					&& personneDTO.getEnfants() != null) {
				if (personne.getEnfants().size() != personneDTO.getEnfants()
						.size()) {
					fail();
				}
				for (int i = 0; i < personne.getEnfants().size(); i++) {
					controlerEquivalencePersonne(personne.getEnfants().get(i),
							personneDTO.getEnfants().get(i));

				}
			}
		}

	}

	private void controlerEquivalenceClient(Client client, ClientDTO clientDTO) {
		if ((client == null && clientDTO != null)
				|| (client != null && clientDTO == null)) {
			fail();
		}
		if (client != null && clientDTO != null) {
			if (!client.getNumeroClient().equals(clientDTO.getNumeroClient())) {
				fail();
			}
			controlerEquivalencePersonne(client, clientDTO);
		}
	}

	@Test
	public void testPersonneAndPersonneDTO() {
		logger.info("===============================================");
		logger.info("TEST PERSONNE <=> PERSONNEDTO");
		Personne personne = new Personne();
		initPersonne(personne);

		logger.info("Source :" + personne);

		PersonneDTO personneDTO = mapper.map(personne, PersonneDTO.class);
		logger.info("PersonneDTO from Personne" + personneDTO);
		controlerEquivalencePersonne(personne, personneDTO);

		Personne personneReverse = mapper.map(personneDTO, Personne.class);
		logger.info("Personne from personneDTO :" + personneReverse);
		controlerEquivalencePersonne(personneReverse, personneDTO);

	}

	@Test
	public void testPersonneAndPerson() {
		logger.info("===============================================");
		logger.info("TEST PERSONNE <=> PERSON");
		Personne personne = new Personne();
		initPersonne(personne);

		logger.info("Source :" + personne);

		Person person = mapper.map(personne, Person.class);
		logger.info("Person from Personne :" + person);

		Personne personneReverse = mapper.map(person, Personne.class);
		logger.info("Personne from person :" + personneReverse);

	}

	@Test
	public void testClientAndClientDTO() {
		logger.info("===============================================");
		logger.info("TEST CLIENT <=> CLIENTDTO");
		Client client = new Client();
		initPersonne(client);
		client.setNumeroClient(1L);

		logger.info("Source :" + client);

		ClientDTO clientDTO = mapper.map(client, ClientDTO.class);
		logger.info("ClientDTO from Client:" + clientDTO);
		controlerEquivalenceClient(client, clientDTO);

		Client clientReverse = mapper.map(clientDTO, Client.class);
		logger.info("Client from ClientDTO:" + clientReverse);
		controlerEquivalenceClient(clientReverse, clientDTO);

		PersonneDTO personneDTO = mapper.map(client, PersonneDTO.class);
		logger.info("PersonneDTO from Client:" + personneDTO);

	}

	@Test
	public void testClientAndCustomer() {
		logger.info("===============================================");
		logger.info("TEST CLIENT <=> CUSTOMER");
		Client client = new Client();
		initPersonne(client);
		client.setNumeroClient(1L);

		logger.info("Source :" + client);

		Customer customer = mapper.map(client, Customer.class);
		logger.info("Customer from Client :" + customer);

	}

	@Test
	public void testPersonneAndPersonneDtoString() {
		logger.info("===============================================");
		logger.info("TEST PERSONNE <=> PERSONNEDTO");

		Personne personne = new Personne();
		initPersonne(personne);

		logger.info("Source :" + personne);

		PersonneDtoString personneDtoString = mapper.map(personne,
				PersonneDtoString.class);
		logger.info("PersonneDtoString from Personne :" + personneDtoString);

		Personne personneReverse = mapper
				.map(personneDtoString, Personne.class);
		logger.info("Personne from personneDTO :" + personneReverse);

	}

}
