package com.honey.githubdatafetcher.model;

import org.json.JSONObject;

public class User {
    private Integer id;
    private String name;
    private String company;
    private String location;
    private String blog;
    private String bio;
    private String avatarUrl;
    private String login;
    private String url;
    private String htmlUrl;
    private Boolean hireable;
    private Integer publicRepos;
    private Integer publicGists;
    private Integer followers;
    private Integer following;

    public User(JSONObject aJsonObj) {
        this(aJsonObj.getInt("id"), aJsonObj.getString("name"), aJsonObj.getString("company"), aJsonObj.getString("location"), aJsonObj.getString("blog"), aJsonObj.getString("bio"), aJsonObj.getString("avatar_url"), aJsonObj.getString("login"), aJsonObj.getString("url"), aJsonObj.getString("html_url"), aJsonObj.getBoolean("hireable"), aJsonObj.getInt("public_repos"), aJsonObj.getInt("public_gists"), aJsonObj.getInt("followers"), aJsonObj.getInt("following"));
    }

    public User(Integer id, String name, String company, String location, String blog, String bio, String avatarUrl, String login, String url, String htmlUrl, Boolean hireable, Integer publicRepos, Integer publicGists, Integer followers, Integer following) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.location = location;
        this.blog = blog;
        this.bio = bio;
        this.avatarUrl = avatarUrl;
        this.login = login;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.hireable = hireable;
        this.publicRepos = publicRepos;
        this.publicGists = publicGists;
        this.followers = followers;
        this.following = following;
    }

    public String toString() {
        JSONObject aJSONObject = new JSONObject();
        aJSONObject.put("id", id);
        aJSONObject.put("name", name);
        aJSONObject.put("company", company);
        aJSONObject.put("location", location);
        aJSONObject.put("blog", blog);
        aJSONObject.put("bio", bio);
        aJSONObject.put("avatarUrl", avatarUrl);
        aJSONObject.put("login", login);
        aJSONObject.put("url", url);
        aJSONObject.put("htmlUrl", htmlUrl);
        aJSONObject.put("hireable", hireable);
        aJSONObject.put("publicRepos", publicRepos);
        aJSONObject.put("publicGists", publicGists);
        aJSONObject.put("followers", followers);
        aJSONObject.put("following", following);

        return aJSONObject.toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Boolean getHireable() {
        return hireable;
    }

    public void setHireable(Boolean hireable) {
        this.hireable = hireable;
    }

    public Integer getPublicRepos() {
        return publicRepos;
    }

    public void setPublicRepos(Integer publicRepos) {
        this.publicRepos = publicRepos;
    }

    public Integer getPublicGists() {
        return publicGists;
    }

    public void setPublicGists(Integer publicGists) {
        this.publicGists = publicGists;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getFollowing() {
        return following;
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }

}
