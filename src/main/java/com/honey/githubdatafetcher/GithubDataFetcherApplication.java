package com.honey.githubdatafetcher;

import com.honey.githubdatafetcher.model.User;
import com.honey.githubdatafetcher.util.HttpUtil;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@EnableAutoConfiguration
public class GithubDataFetcherApplication {
    @Value("${github.rootUrl}")
    private String ROOT_URL;

    public static void main(String[] args) {
            SpringApplication.run(GithubDataFetcherApplication.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "<h1>Hello World!</h1>";
    }

    @RequestMapping(value="/getUser", method = RequestMethod.GET)
    public @ResponseBody String getUser(@RequestParam("user") String aUser) throws IOException {
        return new User(HttpUtil.get(ROOT_URL + "/users" + "/" + aUser)).toString();
    }
}
