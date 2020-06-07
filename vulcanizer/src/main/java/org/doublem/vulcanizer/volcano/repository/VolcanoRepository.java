package org.doublem.vulcanizer.volcano.repository;

import org.doublem.vulcanizer.volcano.model.Volcano;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class VolcanoRepository {

    @Inject
    EntityManager entityManager;

    @Transactional
    public void save(Volcano volcano){
        entityManager.persist(volcano);
    }

    public Volcano get(Long volcanoId){
        return entityManager.find(Volcano.class, volcanoId);
    }
}
