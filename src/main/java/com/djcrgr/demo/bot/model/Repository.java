package com.djcrgr.demo.bot.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Repository {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("fork")
    @Expose
    private Boolean fork;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("ssh_url")
    @Expose
    private String sshUrl;
    @SerializedName("clone_url")
    @Expose
    private String cloneUrl;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("stars_count")
    @Expose
    private Integer starsCount;
    @SerializedName("forks_count")
    @Expose
    private Integer forksCount;
    @SerializedName("watchers_count")
    @Expose
    private Integer watchersCount;
    @SerializedName("open_issues_count")
    @Expose
    private Integer openIssuesCount;
    @SerializedName("default_branch")
    @Expose
    private String defaultBranch;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
}
