package mailgenerator;



import configuration.ConfigurationRepository;
import entities.Groupe;
import entities.Personne;
import iconfiguration.IConfigurationRepository;
import ientitites.IGoupe;
import ientitites.IMail;
import ientitites.IPersonne;
import imailgenerator.IPrankMailGenerator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Guillaume Zaretti
 * @author Nair Alic
 */
public class PrankMailGenerator implements IPrankMailGenerator {

    IConfigurationRepository configurationRepository;

    public PrankMailGenerator(IConfigurationRepository configurationRepository) throws IOException {
       this.configurationRepository = configurationRepository;
    }

    @Override
    public List<IMail> generateMailPranks() {
        Random rand = new Random();
        int nbGroupe = configurationRepository.retreaveNbGroupsFromConfig();

        List<IGoupe> groups = new ArrayList();

        for (int i = 0; i < nbGroupe; i++) {
            groups.add(new Groupe());
        }

        int i = 0;
        for (IPersonne v : configurationRepository.retreaveVictimsFromConfig()) {
            groups.get(i % nbGroupe).addVictim(v);
            i++;
        }
        
        List<IMail> listMail = new ArrayList();
                
        i = 0;
        for(IMail m : configurationRepository.retreaveMailsFromConfig()){
            int randomInt = rand.nextInt((configurationRepository.retreaveVictimsFromConfig().size()-1) + 1);
            m.setTo(groups.get(i % nbGroupe));
            m.setFrom(configurationRepository.retreaveVictimsFromConfig().get(randomInt));
            listMail.add(m);
            i++;
        }   
        return listMail;
    }

}
