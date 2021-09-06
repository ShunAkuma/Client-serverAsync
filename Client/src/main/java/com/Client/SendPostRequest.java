package com.Client;

import com.Client.Model.object;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class SendPostRequest {

    public void PostRequest() throws IOException {
        String urlAdress3 = "http://localhost:8080/main/upload/test";
        URL url;
        HttpURLConnection httpURLConnection;
        OutputStream os = null;


        com.Client.Model.object modelobj = new object();

        var objectMapper = new ObjectMapper();
        String requesBody = objectMapper.writeValueAsString(modelobj);

        InputStreamReader reader = null;
        BufferedReader bfr = null;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i  = 0;i <=10;i++) {
            try {

                url = new URL(urlAdress3);
                httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);


                httpURLConnection.addRequestProperty("User-Agent", "Google");
                httpURLConnection.addRequestProperty("Content-Type", "application/json");

                httpURLConnection.setConnectTimeout(200);
                httpURLConnection.setReadTimeout(200);

                httpURLConnection.connect();

                try {
                    os = httpURLConnection.getOutputStream();
                    os.write(requesBody.toString().getBytes(StandardCharsets.UTF_8));

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                if (HttpURLConnection.HTTP_OK == httpURLConnection.getResponseCode()) {
                    reader = new InputStreamReader(httpURLConnection.getInputStream());
                    bfr = new BufferedReader(reader);
                    String line;
                    while ((line = bfr.readLine()) != null) {
                        stringBuilder.append(line);
                    }
                }

                System.out.println(stringBuilder);

            } catch (MalformedURLException ex) {

            } finally {
                reader.close();
                bfr.close();
                os.close();
            }
        }
    }
}
