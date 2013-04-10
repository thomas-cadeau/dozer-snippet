package test;

import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.dozer.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gop.expertec.dto.PersonneDTO;
import com.gop.expertec.entite.Personne;
import com.gop.expertec.entity.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/test-context.xml")
public class Test1 {

	// Le Mapper est déclaré dans le fichier /src/test/resources/test-context.xml
	@Autowired
	Mapper mapper;
	
	@Test
	public void test() {
		try {

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			
			// Init d'une personne et de ses enfants
			Personne personne = new Personne();
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
			
			System.out.println("Source :" + personne);
			
			PersonneDTO personneDTO = mapper.map(personne, PersonneDTO.class);

			System.out.println("Destination 1:"
					+ personneDTO);

			Person person = mapper.map(personne, Person.class);

			System.out
					.println("Destination 2:" + person);

		} catch (ParseException e) {
			e.printStackTrace();
			fail(e.toString());
		}

	}

}
