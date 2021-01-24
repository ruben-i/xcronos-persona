package org.cronos.persona.rest;

import org.cronos.persona.model.Person;
import org.cronos.persona.service.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/person")
public class PersonaRestController {
    private final PersonaService personaService;

    public PersonaRestController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("list")
    public ResponseEntity<List<Person>> list() {
        List<Person> personas = personaService.list();

        return new ResponseEntity<>(personas, HttpStatus.OK);
    }
}
