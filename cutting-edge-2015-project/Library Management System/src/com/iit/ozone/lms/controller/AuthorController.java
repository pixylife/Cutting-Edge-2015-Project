/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.ozone.lms.controller;

import com.iit.ozone.lms.entity.Author;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;

/**
 *
 * @author Sahan Thinusha
 */
public interface AuthorController {

    public int addNewAuthor(Author author) throws IOException;

    public int updateAuthor(Author author) throws IOException;

    public int deleteAuthor(Author author) throws IOException;

    public Author searchAuthorByID(Author author) throws IOException, JSONException;

    public JSONArray searchAuthor(Author author) throws IOException;

    public JSONArray viewAllAuthors() throws IOException;

}
