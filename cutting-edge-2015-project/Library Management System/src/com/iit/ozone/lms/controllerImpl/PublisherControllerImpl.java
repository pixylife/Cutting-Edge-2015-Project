/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.ozone.lms.controllerImpl;

import com.iit.ozone.lms.controller.PublisherController;
import com.iit.ozone.lms.entity.Publisher;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Sahan Thinusha
 */
public class PublisherControllerImpl implements PublisherController {

    @Override
    public int addNewPublisher(Publisher publisher) throws IOException {
        RequestControllerImpl rc = new RequestControllerImpl();
        rc.put(publisher, "publisher/add");
        return 1;
    }

    @Override
    public int updatePublisher(Publisher publisher) throws IOException {
        RequestControllerImpl rc = new RequestControllerImpl();
        rc.put(publisher, "publisher/update");
        return 1;
    }

    @Override
    public int deletePublisher(Publisher publisher) throws IOException {
        RequestControllerImpl rc = new RequestControllerImpl();
        rc.put(publisher, "publisher/delete");
        return 1;
    }

    @Override
    public Publisher searchPublisherByID(Publisher publisher) throws IOException, JSONException {
        RequestControllerImpl rc = new RequestControllerImpl();
        JSONObject jo = rc.getOne(publisher, "publisher/search");
        Publisher publisher1 = new Publisher();

        publisher1.setId(Integer.parseInt((jo.get("id")) + ""));
        publisher1.setName((jo.get("name")) + "");

        return publisher1;
    }

    @Override
    public JSONArray searchPublisher(Publisher publisher) throws IOException {
        RequestControllerImpl rc = new RequestControllerImpl();
        return rc.get(publisher, "publisher/searchByName");
    }

    @Override
    public JSONArray viewAllPublisher() throws IOException {
        RequestControllerImpl rc = new RequestControllerImpl();
        return rc.getAll("publisher/viewAll");
    }

}
