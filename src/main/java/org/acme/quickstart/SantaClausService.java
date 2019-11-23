package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class SantaClausService {
    @Inject
    EntityManager em;

    @Transactional
    public List<Gift> getGifts() {
        return (List<Gift>) em.createQuery("select g from Gift g").getResultList();
    }
}
