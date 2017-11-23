package com.zxuqian

import javax.persistence.Persistence
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

@Path("/")
class TestResource {

    @GET
    @Produces("text/plain")
    fun get(): String {

        val em = Persistence.createEntityManagerFactory("myunit").createEntityManager()
        em.transaction.begin()
        em.persist(User())
        em.flush()
        em.close()
        em.transaction.commit()

        return "abc"
    }
}