package org.cronos.persona.service;

import org.cronos.persona.model.Person;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
public class DefaultPersonaService implements PersonaService {
    @Override
    public List<Person> list() {
        return Collections.singletonList(create());
    }

    private Person create() {
        Person persona = new Person();
        persona.setId(UUID.randomUUID().toString());
        persona.setFistName(UUID.randomUUID().toString());
        persona.setLastName(UUID.randomUUID().toString());

        return persona;
    }
}
