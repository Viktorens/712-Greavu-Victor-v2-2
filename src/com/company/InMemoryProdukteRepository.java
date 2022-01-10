package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InMemoryProdukteRepository implements ICrudRepository<Produkte> {
    private List<Produkte> produkte = new ArrayList<>();


    // Implementation of the CRUD

    /**
     * @param name -the id of the entity to be returned id must not be null
     * @return entity with the specified id or null - if there is no entity with the given id
     */
    @Override
    public Produkte findOne(String name) {
        for (Produkte produkt : produkte) {
            if (Objects.equals(produkt.getName(), name)) {
                return produkt;
            }
        }
        return null;
    }

    /**
     * @return all entities
     */
    @Override
    public Iterable<Produkte> findAll() {
        return produkte;
    }


    /**
     * @param entity entity must be not null
     * @return null- if the given entity is saved otherwise returns the entity (id already exists)
     */
    @Override
    public Produkte save(Produkte entity) {
        if (entity == null) {
            return null;
        }
        for (Produkte produkt : produkte) {
            if (Objects.equals(produkt.getName(), entity.getName())) {
                return null;
            }
        }
        produkte.add(entity);
        return entity;
    }

    /**
     * removes the entity with the specified id
     *
     * @param name id must be not null
     * @return the removed entity or null if there is no entity with the given id
     */
    @Override
    public Produkte delete(String name) {
        if (name == null) {
            return null;
        }
        for (Produkte produkt : produkte) {
            if (Objects.equals(produkt.getName(), name)) {
                produkte.remove(produkt);
                return produkt;
            }
        }
        return null;
    }

    /**
     * @param entity entity must not be null
     * @return null - if the entity is updated, otherwise returns the entity - (e.g id does not exist).
     */
    @Override
    public Produkte update(Produkte entity) {
        if (entity == null) {
            return null;
        }
        for (Produkte produkt : produkte) {
            if (Objects.equals(produkt.getName(), entity.getName())) {
                produkte.remove(produkt);
                produkte.add(entity);
                return null;
            }
        }
        return entity;
    }


}
