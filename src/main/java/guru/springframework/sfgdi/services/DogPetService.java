package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Profile({"dog-pearson", "default"})
@Service("petService")
public class DogPetService implements PetService, ApplicationContextAware {

    private ApplicationContext ctx;

    public String getPetType(){
        return "Dogs are the best! Psst, a secret cat has infiltrated us and says: " + ((GreetingService) ctx.getBean("i18nService")).sayGreeting();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
}
