/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sovy.review;

import java.io.IOException;
import java.sql.SQLException;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

/**
 *
 * @author stefan.tomasik
 */
public class RestServiceWithParams extends ServerResource {

    Exception e = new Exception();
    Database database = new Database();

    @Get("/find/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Review findData() throws SQLException, IOException, ClassNotFoundException {
        Long idd;
        idd = Long.valueOf(this.getAttribute("id"));
        Review review = database.getZanerById(idd);
        if (review != null) {
            return review;
        } else {
            throw new NullException("error", e);
        }

    }

    @Put("/update/{id}")
    public void updateData(Review review) throws IOException, ClassNotFoundException, SQLException {

        if (review != null) {
            database.updateText(review);
        } else {
            throw new NullException("error", e);
        }

    }
}
