package com.petar.demoreferrals.repository;

import java.util.Collection;
import java.util.Optional;

public interface BaseRepository <T, S> {
    Collection<T> findAll();

    Optional<T> findById(S id);

    T save(T t);
}