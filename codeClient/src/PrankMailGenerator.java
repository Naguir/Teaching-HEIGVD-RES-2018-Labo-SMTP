
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


/**
 *
 * @author ZEED
 */
public class PrankMailGenerator implements IPrankMailGenerator {

    IConfigurationRepository configurationRepository;

    public PrankMailGenerator(String filePath) throws IOException {
        configurationRepository = new ConfigurationRepository(filePath);
    }

    @Override
    public List<IMail> generateMailPranks() {

        int nbGroupe = configurationRepository.retreaveNbGroupsFromConfig();

        List<IGoupe> groups = new ArrayList();

        for (int i = 0; i <= nbGroupe; nbGroupe++) {
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
            m.setTo(groups.get(i % nbGroupe));
            m.setFrom(new Personne("uneAdresseJeSaisPasOu@toto.local"));
            listMail.add(m);
            
        }   
        return listMail;
    }

}
