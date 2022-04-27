package com.softomore.petclinic.services;

import com.softomore.petclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastname);
}
