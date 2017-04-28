/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.ozone.lms.controller;

import com.iit.ozone.lms.entity.Publisher;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;

/**
 *
 * @author Sahan Thinusha
 */
public interface PublisherController {

    public int addNewPublisher(Publisher publisher) throws IOException;

    public int updatePublisher(Publisher publisher) throws IOException;

    public int deletePublisher(Publisher publisher) throws IOException;

    public Publisher searchPublisherByID(Publisher publisher) throws IOException, JSONException;

    public JSONArray searchPublisher(Publisher publisher) throws IOException;

    public JSONArray viewAllPublisher() throws IOException;
}
