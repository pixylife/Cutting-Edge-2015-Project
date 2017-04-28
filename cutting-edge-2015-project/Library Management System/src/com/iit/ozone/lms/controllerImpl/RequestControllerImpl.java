/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.ozone.lms.controllerImpl;

import com.iit.ozone.lms.controller.RequestController;
import com.iit.ozone.lms.resource.ServiceConnector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Sahan Thinusha
 */
public class RequestControllerImpl<T> implements RequestController<T> {

    @Override
    public void put(T entity, String url) throws IOException {
        URL serviceURL = new URL("http://" + ServiceConnector.getIp() + ":" + ServiceConnector.getPort() + "" + ServiceConnector.getService() + "" + url);
        HttpURLConnection conn = (HttpURLConnection) serviceURL.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("PUT");
        conn.setRequestProperty("Content-Type", "application/json");
        JSONObject jsonc = new JSONObject(entity);

        OutputStream os = conn.getOutputStream();
        os.write(jsonc.toString().getBytes());
        os.flush();

        if (!(conn.getResponseCode() + "").equals(204 + "")) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseMessage());
        }
        conn.disconnect();
    }

    @Override
    public JSONArray get(T entity, String url) throws IOException {
        URL serviceURL = new URL("http://" + ServiceConnector.getIp() + ":" + ServiceConnector.getPort() + "" + ServiceConnector.getService() + "" + url);
        HttpURLConnection conn = (HttpURLConnection) serviceURL.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("PUT");
        conn.setRequestProperty("Content-Type", "application/json");
        JSONObject jsonc = new JSONObject(entity);

        OutputStream os = conn.getOutputStream();
        os.write(jsonc.toString().getBytes());
        os.flush();

        if (!(conn.getResponseCode() + "").equals(200 + "")) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseMessage());
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(
                (conn.getInputStream())));

        String output;
        String x = "";
        while ((output = br.readLine()) != null) {
            if ("".equals(x)) {
                x = output;
            } else {
                x += output;
            }

        }

        JSONArray array = null;

        if (!"".equals(x)) {
            try {
                array = new JSONArray(x);
            } catch (JSONException ex) {
                Logger.getLogger(RequestControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        conn.disconnect();

        return array;
    }

    @Override
    public JSONArray getAll(String url) throws IOException {
        URL serviceURL = new URL("http://" + ServiceConnector.getIp() + ":" + ServiceConnector.getPort() + "" + ServiceConnector.getService() + "" + url);
        HttpURLConnection conn = (HttpURLConnection) serviceURL.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(
                (conn.getInputStream())));

        String output;
        String x = "";
        while ((output = br.readLine()) != null) {
            if ("".equals(x)) {
                x = output;
            } else {
                x += output;
            }

        }
        JSONArray array = null;

        if (!"".equals(x)) {
            try {
                array = new JSONArray(x);
            } catch (JSONException ex) {
                Logger.getLogger(RequestControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        conn.disconnect();
        return array;
    }

    @Override
    public JSONObject getOne(T entity, String url) throws IOException {
        URL serviceURL = new URL("http://" + ServiceConnector.getIp() + ":" + ServiceConnector.getPort() + "" + ServiceConnector.getService() + "" + url);
        HttpURLConnection conn = (HttpURLConnection) serviceURL.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("PUT");
        conn.setRequestProperty("Content-Type", "application/json");
        JSONObject jsonc = new JSONObject(entity);

        OutputStream os = conn.getOutputStream();
        os.write(jsonc.toString().getBytes());
        os.flush();

        if (!(conn.getResponseCode() + "").equals(200 + "")) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseMessage());
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(
                (conn.getInputStream())));

        String output;
        String x = "";
        while ((output = br.readLine()) != null) {
            if ("".equals(x)) {
                x = output;
            } else {
                x += output;
            }

        }

        JSONObject jo = null;

        if (!"".equals(x)) {
            try {
                jo = new JSONObject(x);
            } catch (JSONException ex) {
                Logger.getLogger(RequestControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        conn.disconnect();

        return jo;
    }
}
