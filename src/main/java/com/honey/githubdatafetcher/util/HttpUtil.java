package com.honey.githubdatafetcher.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;

public class HttpUtil {
    private static OkHttpClient getClient() {
        return new OkHttpClient();
    }

    public static JSONObject get(String url) throws IOException {
        OkHttpClient client = HttpUtil.getClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        if(!response.isSuccessful())
            throw new IOException("Unexpected code " + response);

        return new JSONObject(response.body().string());
    }

    public static JSONObject post(String url, RequestBody requestBody) throws Exception {
        OkHttpClient client = HttpUtil.getClient();
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();

        Response response = client.newCall(request).execute();
        if(!response.isSuccessful())
            throw new IOException("Unexpected code " + response);

        return new JSONObject(response.body().string());
    }
}
