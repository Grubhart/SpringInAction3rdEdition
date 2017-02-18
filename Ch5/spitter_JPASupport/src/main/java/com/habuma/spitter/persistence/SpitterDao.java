package com.habuma.spitter.persistence;

import com.habuma.spitter.domain.Spitter;


public interface SpitterDao {
    void addSpitter(Spitter spitter);

    Spitter getSpitterById(long id);

    void saveSpitter(Spitter spitter);
}
