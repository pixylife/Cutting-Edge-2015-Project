/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.ozone.lms.controllerImpl;

import com.iit.ozone.lms.controller.AuthorController;
import com.iit.ozone.lms.entity.Author;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Sahan Thinusha
 */
public class AuthorControllerImpl implements AuthorController {

    @Override
    public int addNewAuthor(Author author) throws IOException {
        RequestControllerImpl rc = new RequestControllerImpl();
        rc.put(author, "author/add");
        return 1;
    }

    @Override
    public int updateAuthor(Author author) throws IOException {
        RequestControllerImpl rc = new RequestControllerImpl();
        rc.put(author, "author/update");
        return 1;
    }

    @Override
    public int deleteAuthor(Author author) throws IOException {
        RequestControllerImpl rc = new RequestControllerImpl();
        rc.put(author, "author/delete");
        return 1;
    }

    @Override
    public JSONArray searchAuthor(Author author) throws IOException {
        RequestControllerImpl rc = new RequestControllerImpl();
        return rc.get(author, "author/searchByName");
    }

    @Override
    public JSONArray viewAllAuthors() throws IOException {
        RequestControllerImpl rc = new RequestControllerImpl();
        return rc.getAll("author/viewAll");
    }

    @Override
    public Author searchAuthorByID(Author author) throws IOException, JSONException {
        RequestControllerImpl rc = new RequestControllerImpl();
        JSONObject jo = rc.getOne(author, "author/search");
        Author author1 = new Author();

        author1.setId(Integer.parseInt((jo.get("id")) + ""));
        author1.setName((jo.get("name")) + "");

        return author1;
    }

}
