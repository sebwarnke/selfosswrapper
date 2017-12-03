package de.sebwarnke.restwrapper.selfoss.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Article implements Serializable {

	@JsonProperty("id")
	private String id;
	@JsonProperty("datetime")
	private String datetime;
	@JsonProperty("title")
	private String title;
	@JsonProperty("content")
	private String content;
	@JsonProperty("unread")
	private String unread;
	@JsonProperty("starred")
	private String starred;
	@JsonProperty("source")
	private String source;
	@JsonProperty("thumbnail")
	private String thumbnail;
	@JsonProperty("icon")
	private String icon;
	@JsonProperty("uid")
	private String uid;
	@JsonProperty("link")
	private String link;
	@JsonProperty("updatetime")
	private String updatetime;
	@JsonProperty("author")
	private String author;
	@JsonProperty("sourcetitle")
	private String sourcetitle;
	@JsonProperty("tags")
	private String tags;

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("datetime")
	public String getDatetime() {
		return datetime;
	}

	@JsonProperty("datetime")
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("content")
	public String getContent() {
		return content;
	}

	@JsonProperty("content")
	public void setContent(String content) {
		this.content = content;
	}

	@JsonProperty("unread")
	public String getUnread() {
		return unread;
	}

	@JsonProperty("unread")
	public void setUnread(String unread) {
		this.unread = unread;
	}

	@JsonProperty("starred")
	public String getStarred() {
		return starred;
	}

	@JsonProperty("starred")
	public void setStarred(String starred) {
		this.starred = starred;
	}

	@JsonProperty("source")
	public String getSource() {
		return source;
	}

	@JsonProperty("source")
	public void setSource(String source) {
		this.source = source;
	}

	@JsonProperty("thumbnail")
	public String getThumbnail() {
		return thumbnail;
	}

	@JsonProperty("thumbnail")
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	@JsonProperty("icon")
	public String getIcon() {
		return icon;
	}

	@JsonProperty("icon")
	public void setIcon(String icon) {
		this.icon = icon;
	}

	@JsonProperty("uid")
	public String getUid() {
		return uid;
	}

	@JsonProperty("uid")
	public void setUid(String uid) {
		this.uid = uid;
	}

	@JsonProperty("link")
	public String getLink() {
		return link;
	}

	@JsonProperty("link")
	public void setLink(String link) {
		this.link = link;
	}

	@JsonProperty("updatetime")
	public String getUpdatetime() {
		return updatetime;
	}

	@JsonProperty("updatetime")
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}

	@JsonProperty("author")
	public String getAuthor() {
		return author;
	}

	@JsonProperty("author")
	public void setAuthor(String author) {
		this.author = author;
	}

	@JsonProperty("sourcetitle")
	public String getSourcetitle() {
		return sourcetitle;
	}

	@JsonProperty("sourcetitle")
	public void setSourcetitle(String sourcetitle) {
		this.sourcetitle = sourcetitle;
	}

	@JsonProperty("tags")
	public String getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(String tags) {
		this.tags = tags;
	}

  @Override
  public String toString() {
    return "Article [datetime=" + datetime + ", title=" + title + ", author=" + author + "]";
  }

	
	
}
