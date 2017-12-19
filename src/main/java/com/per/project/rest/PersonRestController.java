package com.per.project.rest;

import com.per.project.facade.PersonsFacade;
import com.per.project.facade.dto.PersonDto;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/persons")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@TransactionAttribute(TransactionAttributeType.NEVER)
public class PersonRestController {

    @Inject
    private PersonsFacade personsFacade;

    @GET
    @Path("/all")
    public List<PersonDto> getAll() throws Exception {
        return personsFacade.getAll();
    }

    @GET
    @Path("/allllll")
    public List<PersonDto> getAlll() throws Exception {
        return personsFacade.getAll();
    }

    @GET
    @Path("/{personId}")
    public PersonDto getPerson(@PathParam("personId") Integer personId) throws Exception {
        return personsFacade.getPerson(personId);
    }


}
