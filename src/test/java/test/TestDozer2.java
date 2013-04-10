package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.dozer.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gop.expertec.inheritance.fr.Adresse;
import com.gop.expertec.inheritance.fr.Groupe;
import com.gop.expertec.inheritance.fr.PersonneAbstract;
import com.gop.expertec.inheritance.fr.PersonneMorale;
import com.gop.expertec.inheritance.fr.PersonnePhysique;
import com.gop.expertec.inheritance.uk.Adress;
import com.gop.expertec.inheritance.uk.Group;
import com.gop.expertec.inheritance.uk.LegalForm;
import com.gop.expertec.inheritance.uk.MoralPerson;
import com.gop.expertec.inheritance.uk.PersonAbstract;
import com.gop.expertec.inheritance.uk.PhysicalPerson;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/test-context.xml")
public class TestDozer2 {

    private static final Logger logger = Logger.getLogger(TestDozer2.class);

    // Le Mapper est déclaré dans le fichier
    // /src/test/resources/test-context.xml
    @Autowired
    Mapper mapper;

    /**
     * Enrichi la personne passé en paramètre
     * 
     * @param personne
     */
    private List<PersonAbstract> setupEN() {

        List<PersonAbstract> persons = new ArrayList<PersonAbstract>();
        // EN
        MoralPerson mp = new MoralPerson();
        persons.add(mp);
        mp.setCreationDate("01/01/13");
        mp.setEmail("mp@yopmail.com");
        mp.setLegalForm(LegalForm.ARTISAN);
        mp.setName("La boite à choux");
        mp.setSiret("73282932000074");
        Adress adress = new Adress("5 rue du bois joli", "44300", "Nantes");
        mp.setAdress(adress);
        
        PhysicalPerson physPers = new PhysicalPerson();
        persons.add(physPers);
        physPers.setAdress(adress);
        physPers.setBirthDate(new Date());
        physPers.setEmail("john@doe.com");
        physPers.setFirstName("john");
        physPers.setName("doe");
        
        return persons;
    }
    
    private List<PersonneAbstract> setUpFR()  {
        List<PersonneAbstract> personnes = new ArrayList<PersonneAbstract>();
        
        // FR
        PersonneMorale pm = new PersonneMorale();
        personnes.add(pm);
        pm.setDateCreation("01/01/13");
        pm.setEmail("mp@yopmail.com");
        pm.setFormeLegale("ARTISAN");
        pm.setNom("La boite à choux");
        pm.setSiren("73282932");
        pm.setNic("000074");
        Adresse adress = new Adresse("5 rue du bois joli", "44300", "Nantes", "FRANCE");
        pm.setAdresse(adress);
        
        PersonnePhysique persPhys = new PersonnePhysique();
        personnes.add(persPhys);
        persPhys.setAdresse(adress);
        persPhys.setDateNaiss(new Date());
        persPhys.setEmail("john@doe.com");
        persPhys.setPrenom("john");
        persPhys.setNom("doe");
        
        return personnes;
    }
    
    @Test
    public void groupeFRtoGroupEN() {

        Groupe groupe = new Groupe();
        groupe.setPersonnes(setUpFR());
        
        logger.debug("converting to groupe EN");
        Group group = mapper.map(groupe, Group.class);

        logger.info("Source :" + groupe);
        logger.info("Target :" + group);

//        PersonneDTO personneDTO = mapper.map(personne, PersonneDTO.class);
//        logger.info("PersonneDTO from Personne" + personneDTO);
//        controlerEquivalencePersonne(personne, personneDTO);
//
//        Personne personneReverse = mapper.map(personneDTO, Personne.class);
//        logger.info("Personne from personneDTO :" + personneReverse);
//        controlerEquivalencePersonne(personneReverse, personneDTO);

    }

}
