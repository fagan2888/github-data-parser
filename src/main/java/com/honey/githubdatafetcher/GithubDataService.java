package com.honey.githubdatafetcher;

import com.honey.githubdatafetcher.model.User;
import com.honey.githubdatafetcher.util.HttpUtil;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

public class GithubDataService {
    @Value("${github.rootUrl}")
    private String ROOT_URL;

    public User getUser(String userName) throws IOException {
        JSONObject response = HttpUtil.get(ROOT_URL + "/users" + userName);
        return new User(response);
    }
}
