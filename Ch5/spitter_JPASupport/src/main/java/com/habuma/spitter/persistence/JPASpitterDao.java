package com.habuma.spitter.persistence;


import com.habuma.spitter.domain.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository("spitterDao")
@Transactional
public class JPASpitterDao implements SpitterDao {

    private static final String RECENT_SPITTLES=
            "SELECTsFROMSpittles";
    private static final String ALL_SPITTERS=
            "SELECTsFROMSpitters";
    private static final String SPITTER_FOR_USERNAME=
            "SELECTsFROMSpittersWHEREs.username=:username";
    private static final String SPITTLES_BY_USERNAME=
            "SELECTsFROMSpittlesWHEREs.spitter.username=:username";

    @PersistenceContext
    private EntityManager em;

    public void addSpitter(Spitter spitter) {
        em.persist(spitter);
    }

    public Spitter getSpitterById(long id) {
        return em.find(Spitter.class, id);
    }

    public void saveSpitter(Spitter spitter) {
        em.merge(spitter);
    }
}
