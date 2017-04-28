/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.ozone.lms.controller;

import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Sahan Thinusha
 */
public interface RequestController<T> {

    void put(T entity, String url) throws IOException;

    JSONObject getOne(T entity, String url) throws IOException;

    JSONArray get(T entity, String url) throws IOException;

    JSONArray getAll(String url) throws IOException;
}
