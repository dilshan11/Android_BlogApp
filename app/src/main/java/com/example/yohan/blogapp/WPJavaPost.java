package com.example.yohan.blogapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WPJavaPost {


    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_gmt")
    @Expose
    private String dateGmt;
    @SerializedName("guid")
    @Expose
    private WPPost.Guid guid;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("modified_gmt")
    @Expose
    private String modifiedGmt;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("title")
    @Expose
    private WPPost.Title title;
    @SerializedName("content")
    @Expose
    private WPPost.Content content;
    @SerializedName("excerpt")
    @Expose
    private WPPost.Excerpt excerpt;
    @SerializedName("author")
    @Expose
    private Integer author;
    @SerializedName("featured_media")
    @Expose
    private Integer featuredMedia;
    @SerializedName("comment_status")
    @Expose
    private String commentStatus;
    @SerializedName("ping_status")
    @Expose
    private String pingStatus;
    @SerializedName("sticky")
    @Expose
    private Boolean sticky;
    @SerializedName("template")
    @Expose
    private String template;
    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("meta")
    @Expose
    private List<Object> meta = null;
    @SerializedName("categories")
    @Expose
    private List<Integer> categories = null;
    @SerializedName("tags")
    @Expose
    private List<Integer> tags = null;
    @SerializedName("better_featured_image")
    @Expose
    private WPPost.BetterFeaturedImage betterFeaturedImage;
    @SerializedName("_links")
    @Expose
    private WPPost.Links links;
    @SerializedName("_embedded")
    @Expose
    private WPPost.Embedded embedded;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateGmt() {
        return dateGmt;
    }

    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    public WPPost.Guid getGuid() {
        return guid;
    }

    public void setGuid(WPPost.Guid guid) {
        this.guid = guid;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public void setModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public WPPost.Title getTitle() {
        return title;
    }

    public void setTitle(WPPost.Title title) {
        this.title = title;
    }

    public WPPost.Content getContent() {
        return content;
    }

    public void setContent(WPPost.Content content) {
        this.content = content;
    }

    public WPPost.Excerpt getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(WPPost.Excerpt excerpt) {
        this.excerpt = excerpt;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Integer getFeaturedMedia() {
        return featuredMedia;
    }

    public void setFeaturedMedia(Integer featuredMedia) {
        this.featuredMedia = featuredMedia;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public Boolean getSticky() {
        return sticky;
    }

    public void setSticky(Boolean sticky) {
        this.sticky = sticky;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public List<Object> getMeta() {
        return meta;
    }

    public void setMeta(List<Object> meta) {
        this.meta = meta;
    }

    public List<Integer> getCategories() {
        return categories;
    }

    public void setCategories(List<Integer> categories) {
        this.categories = categories;
    }

    public List<Integer> getTags() {
        return tags;
    }

    public void setTags(List<Integer> tags) {
        this.tags = tags;
    }

    public WPPost.BetterFeaturedImage getBetterFeaturedImage() {
        return betterFeaturedImage;
    }

    public void setBetterFeaturedImage(WPPost.BetterFeaturedImage betterFeaturedImage) {
        this.betterFeaturedImage = betterFeaturedImage;
    }

    public WPPost.Links getLinks() {
        return links;
    }

    public void setLinks(WPPost.Links links) {
        this.links = links;
    }

    public WPPost.Embedded getEmbedded() {
        return embedded;
    }

    public void setEmbedded(WPPost.Embedded embedded) {
        this.embedded = embedded;
    }


    public class About {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class About_ {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class About__ {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class Author {

        @SerializedName("embeddable")
        @Expose
        private Boolean embeddable;
        @SerializedName("href")
        @Expose
        private String href;

        public Boolean getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(Boolean embeddable) {
            this.embeddable = embeddable;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class Author_ {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("avatar_urls")
        @Expose
        private WPPost.AvatarUrls avatarUrls;
        @SerializedName("_links")
        @Expose
        private WPPost.Links_ links;

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

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public WPPost.AvatarUrls getAvatarUrls() {
            return avatarUrls;
        }

        public void setAvatarUrls(WPPost.AvatarUrls avatarUrls) {
            this.avatarUrls = avatarUrls;
        }

        public WPPost.Links_ getLinks() {
            return links;
        }

        public void setLinks(WPPost.Links_ links) {
            this.links = links;
        }

    }


    public class Author__ {

        @SerializedName("embeddable")
        @Expose
        private Boolean embeddable;
        @SerializedName("href")
        @Expose
        private String href;

        public Boolean getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(Boolean embeddable) {
            this.embeddable = embeddable;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class AvatarUrls {

        @SerializedName("24")
        @Expose
        private String _24;
        @SerializedName("48")
        @Expose
        private String _48;
        @SerializedName("96")
        @Expose
        private String _96;

        public String get24() {
            return _24;
        }

        public void set24(String _24) {
            this._24 = _24;
        }

        public String get48() {
            return _48;
        }

        public void set48(String _48) {
            this._48 = _48;
        }

        public String get96() {
            return _96;
        }

        public void set96(String _96) {
            this._96 = _96;
        }

    }


    public class BetterFeaturedImage {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("alt_text")
        @Expose
        private String altText;
        @SerializedName("caption")
        @Expose
        private String caption;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("media_type")
        @Expose
        private String mediaType;
        @SerializedName("media_details")
        @Expose
        private WPPost.MediaDetails mediaDetails;
        @SerializedName("post")
        @Expose
        private Integer post;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getAltText() {
            return altText;
        }

        public void setAltText(String altText) {
            this.altText = altText;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getMediaType() {
            return mediaType;
        }

        public void setMediaType(String mediaType) {
            this.mediaType = mediaType;
        }

        public WPPost.MediaDetails getMediaDetails() {
            return mediaDetails;
        }

        public void setMediaDetails(WPPost.MediaDetails mediaDetails) {
            this.mediaDetails = mediaDetails;
        }

        public Integer getPost() {
            return post;
        }

        public void setPost(Integer post) {
            this.post = post;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class Caption {

        @SerializedName("rendered")
        @Expose
        private String rendered;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

    }


    public class Collection {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }



    public class Collection_ {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class Collection__ {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class Collection___ {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class Content {

        @SerializedName("rendered")
        @Expose
        private String rendered;
        @SerializedName("protected")
        @Expose
        private Boolean _protected;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

        public Boolean getProtected() {
            return _protected;
        }

        public void setProtected(Boolean _protected) {
            this._protected = _protected;
        }

    }


    public class Cury {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("templated")
        @Expose
        private Boolean templated;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public Boolean getTemplated() {
            return templated;
        }

        public void setTemplated(Boolean templated) {
            this.templated = templated;
        }

    }


    public class Cury_ {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("templated")
        @Expose
        private Boolean templated;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public Boolean getTemplated() {
            return templated;
        }

        public void setTemplated(Boolean templated) {
            this.templated = templated;
        }

    }


    public class Embedded {

        @SerializedName("author")
        @Expose
        private List<WPPost.Author_> author = null;
        @SerializedName("wp:featuredmedia")
        @Expose
        private List<WPPost.WpFeaturedmedium_> wpFeaturedmedia = null;
        @SerializedName("wp:term")
        @Expose
        private List<List<WPPost.WpTerm_>> wpTerm = null;

        public List<WPPost.Author_> getAuthor() {
            return author;
        }

        public void setAuthor(List<WPPost.Author_> author) {
            this.author = author;
        }

        public List<WPPost.WpFeaturedmedium_> getWpFeaturedmedia() {
            return wpFeaturedmedia;
        }

        public void setWpFeaturedmedia(List<WPPost.WpFeaturedmedium_> wpFeaturedmedia) {
            this.wpFeaturedmedia = wpFeaturedmedia;
        }

        public List<List<WPPost.WpTerm_>> getWpTerm() {
            return wpTerm;
        }

        public void setWpTerm(List<List<WPPost.WpTerm_>> wpTerm) {
            this.wpTerm = wpTerm;
        }

    }




    public class Excerpt {

        @SerializedName("rendered")
        @Expose
        private String rendered;
        @SerializedName("protected")
        @Expose
        private Boolean _protected;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

        public Boolean getProtected() {
            return _protected;
        }

        public void setProtected(Boolean _protected) {
            this._protected = _protected;
        }

    }


    public class Full {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class Guid {

        @SerializedName("rendered")
        @Expose
        private String rendered;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

    }


    public class ImageMeta {

        @SerializedName("aperture")
        @Expose
        private String aperture;
        @SerializedName("credit")
        @Expose
        private String credit;
        @SerializedName("camera")
        @Expose
        private String camera;
        @SerializedName("caption")
        @Expose
        private String caption;
        @SerializedName("created_timestamp")
        @Expose
        private String createdTimestamp;
        @SerializedName("copyright")
        @Expose
        private String copyright;
        @SerializedName("focal_length")
        @Expose
        private String focalLength;
        @SerializedName("iso")
        @Expose
        private String iso;
        @SerializedName("shutter_speed")
        @Expose
        private String shutterSpeed;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("orientation")
        @Expose
        private String orientation;
        @SerializedName("keywords")
        @Expose
        private List<Object> keywords = null;

        public String getAperture() {
            return aperture;
        }

        public void setAperture(String aperture) {
            this.aperture = aperture;
        }

        public String getCredit() {
            return credit;
        }

        public void setCredit(String credit) {
            this.credit = credit;
        }

        public String getCamera() {
            return camera;
        }

        public void setCamera(String camera) {
            this.camera = camera;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public String getCreatedTimestamp() {
            return createdTimestamp;
        }

        public void setCreatedTimestamp(String createdTimestamp) {
            this.createdTimestamp = createdTimestamp;
        }

        public String getCopyright() {
            return copyright;
        }

        public void setCopyright(String copyright) {
            this.copyright = copyright;
        }

        public String getFocalLength() {
            return focalLength;
        }

        public void setFocalLength(String focalLength) {
            this.focalLength = focalLength;
        }

        public String getIso() {
            return iso;
        }

        public void setIso(String iso) {
            this.iso = iso;
        }

        public String getShutterSpeed() {
            return shutterSpeed;
        }

        public void setShutterSpeed(String shutterSpeed) {
            this.shutterSpeed = shutterSpeed;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getOrientation() {
            return orientation;
        }

        public void setOrientation(String orientation) {
            this.orientation = orientation;
        }

        public List<Object> getKeywords() {
            return keywords;
        }

        public void setKeywords(List<Object> keywords) {
            this.keywords = keywords;
        }

    }


    public class ImageMeta_ {

        @SerializedName("aperture")
        @Expose
        private String aperture;
        @SerializedName("credit")
        @Expose
        private String credit;
        @SerializedName("camera")
        @Expose
        private String camera;
        @SerializedName("caption")
        @Expose
        private String caption;
        @SerializedName("created_timestamp")
        @Expose
        private String createdTimestamp;
        @SerializedName("copyright")
        @Expose
        private String copyright;
        @SerializedName("focal_length")
        @Expose
        private String focalLength;
        @SerializedName("iso")
        @Expose
        private String iso;
        @SerializedName("shutter_speed")
        @Expose
        private String shutterSpeed;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("orientation")
        @Expose
        private String orientation;
        @SerializedName("keywords")
        @Expose
        private List<Object> keywords = null;

        public String getAperture() {
            return aperture;
        }

        public void setAperture(String aperture) {
            this.aperture = aperture;
        }

        public String getCredit() {
            return credit;
        }

        public void setCredit(String credit) {
            this.credit = credit;
        }

        public String getCamera() {
            return camera;
        }

        public void setCamera(String camera) {
            this.camera = camera;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public String getCreatedTimestamp() {
            return createdTimestamp;
        }

        public void setCreatedTimestamp(String createdTimestamp) {
            this.createdTimestamp = createdTimestamp;
        }

        public String getCopyright() {
            return copyright;
        }

        public void setCopyright(String copyright) {
            this.copyright = copyright;
        }

        public String getFocalLength() {
            return focalLength;
        }

        public void setFocalLength(String focalLength) {
            this.focalLength = focalLength;
        }

        public String getIso() {
            return iso;
        }

        public void setIso(String iso) {
            this.iso = iso;
        }

        public String getShutterSpeed() {
            return shutterSpeed;
        }

        public void setShutterSpeed(String shutterSpeed) {
            this.shutterSpeed = shutterSpeed;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getOrientation() {
            return orientation;
        }

        public void setOrientation(String orientation) {
            this.orientation = orientation;
        }

        public List<Object> getKeywords() {
            return keywords;
        }

        public void setKeywords(List<Object> keywords) {
            this.keywords = keywords;
        }

    }

    public class Links {

        @SerializedName("self")
        @Expose
        private List<WPPost.Self> self = null;
        @SerializedName("collection")
        @Expose
        private List<WPPost.Collection> collection = null;
        @SerializedName("about")
        @Expose
        private List<WPPost.About> about = null;
        @SerializedName("author")
        @Expose
        private List<WPPost.Author> author = null;
        @SerializedName("replies")
        @Expose
        private List<WPPost.Reply> replies = null;
        @SerializedName("version-history")
        @Expose
        private List<WPPost.VersionHistory> versionHistory = null;
        @SerializedName("wp:featuredmedia")
        @Expose
        private List<WPPost.WpFeaturedmedium> wpFeaturedmedia = null;
        @SerializedName("wp:attachment")
        @Expose
        private List<WPPost.WpAttachment> wpAttachment = null;
        @SerializedName("wp:term")
        @Expose
        private List<WPPost.WpTerm> wpTerm = null;
        @SerializedName("curies")
        @Expose
        private List<WPPost.Cury> curies = null;

        public List<WPPost.Self> getSelf() {
            return self;
        }

        public void setSelf(List<WPPost.Self> self) {
            this.self = self;
        }

        public List<WPPost.Collection> getCollection() {
            return collection;
        }

        public void setCollection(List<WPPost.Collection> collection) {
            this.collection = collection;
        }

        public List<WPPost.About> getAbout() {
            return about;
        }

        public void setAbout(List<WPPost.About> about) {
            this.about = about;
        }

        public List<WPPost.Author> getAuthor() {
            return author;
        }

        public void setAuthor(List<WPPost.Author> author) {
            this.author = author;
        }

        public List<WPPost.Reply> getReplies() {
            return replies;
        }

        public void setReplies(List<WPPost.Reply> replies) {
            this.replies = replies;
        }

        public List<WPPost.VersionHistory> getVersionHistory() {
            return versionHistory;
        }

        public void setVersionHistory(List<WPPost.VersionHistory> versionHistory) {
            this.versionHistory = versionHistory;
        }

        public List<WPPost.WpFeaturedmedium> getWpFeaturedmedia() {
            return wpFeaturedmedia;
        }

        public void setWpFeaturedmedia(List<WPPost.WpFeaturedmedium> wpFeaturedmedia) {
            this.wpFeaturedmedia = wpFeaturedmedia;
        }

        public List<WPPost.WpAttachment> getWpAttachment() {
            return wpAttachment;
        }

        public void setWpAttachment(List<WPPost.WpAttachment> wpAttachment) {
            this.wpAttachment = wpAttachment;
        }

        public List<WPPost.WpTerm> getWpTerm() {
            return wpTerm;
        }

        public void setWpTerm(List<WPPost.WpTerm> wpTerm) {
            this.wpTerm = wpTerm;
        }

        public List<WPPost.Cury> getCuries() {
            return curies;
        }

        public void setCuries(List<WPPost.Cury> curies) {
            this.curies = curies;
        }

    }


    public class Links_ {

        @SerializedName("self")
        @Expose
        private List<WPPost.Self_> self = null;
        @SerializedName("collection")
        @Expose
        private List<WPPost.Collection_> collection = null;

        public List<WPPost.Self_> getSelf() {
            return self;
        }

        public void setSelf(List<WPPost.Self_> self) {
            this.self = self;
        }

        public List<WPPost.Collection_> getCollection() {
            return collection;
        }

        public void setCollection(List<WPPost.Collection_> collection) {
            this.collection = collection;
        }

    }


    public class Links__ {

        @SerializedName("self")
        @Expose
        private List<WPPost.Self__> self = null;
        @SerializedName("collection")
        @Expose
        private List<WPPost.Collection__> collection = null;
        @SerializedName("about")
        @Expose
        private List<WPPost.About_> about = null;
        @SerializedName("author")
        @Expose
        private List<WPPost.Author__> author = null;
        @SerializedName("replies")
        @Expose
        private List<WPPost.Reply_> replies = null;

        public List<WPPost.Self__> getSelf() {
            return self;
        }

        public void setSelf(List<WPPost.Self__> self) {
            this.self = self;
        }

        public List<WPPost.Collection__> getCollection() {
            return collection;
        }

        public void setCollection(List<WPPost.Collection__> collection) {
            this.collection = collection;
        }

        public List<WPPost.About_> getAbout() {
            return about;
        }

        public void setAbout(List<WPPost.About_> about) {
            this.about = about;
        }

        public List<WPPost.Author__> getAuthor() {
            return author;
        }

        public void setAuthor(List<WPPost.Author__> author) {
            this.author = author;
        }

        public List<WPPost.Reply_> getReplies() {
            return replies;
        }

        public void setReplies(List<WPPost.Reply_> replies) {
            this.replies = replies;
        }

    }


    public class Links___ {

        @SerializedName("self")
        @Expose
        private List<WPPost.Self___> self = null;
        @SerializedName("collection")
        @Expose
        private List<WPPost.Collection___> collection = null;
        @SerializedName("about")
        @Expose
        private List<WPPost.About__> about = null;
        @SerializedName("wp:post_type")
        @Expose
        private List<WPPost.WpPostType> wpPostType = null;
        @SerializedName("curies")
        @Expose
        private List<WPPost.Cury_> curies = null;
        @SerializedName("up")
        @Expose
        private List<WPPost.Up> up = null;

        public List<WPPost.Self___> getSelf() {
            return self;
        }

        public void setSelf(List<WPPost.Self___> self) {
            this.self = self;
        }

        public List<WPPost.Collection___> getCollection() {
            return collection;
        }

        public void setCollection(List<WPPost.Collection___> collection) {
            this.collection = collection;
        }

        public List<WPPost.About__> getAbout() {
            return about;
        }

        public void setAbout(List<WPPost.About__> about) {
            this.about = about;
        }

        public List<WPPost.WpPostType> getWpPostType() {
            return wpPostType;
        }

        public void setWpPostType(List<WPPost.WpPostType> wpPostType) {
            this.wpPostType = wpPostType;
        }

        public List<WPPost.Cury_> getCuries() {
            return curies;
        }

        public void setCuries(List<WPPost.Cury_> curies) {
            this.curies = curies;
        }

        public List<WPPost.Up> getUp() {
            return up;
        }

        public void setUp(List<WPPost.Up> up) {
            this.up = up;
        }

    }

    public class MediaDetails {

        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("sizes")
        @Expose
        private WPPost.Sizes sizes;
        @SerializedName("image_meta")
        @Expose
        private WPPost.ImageMeta imageMeta;

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public WPPost.Sizes getSizes() {
            return sizes;
        }

        public void setSizes(WPPost.Sizes sizes) {
            this.sizes = sizes;
        }

        public WPPost.ImageMeta getImageMeta() {
            return imageMeta;
        }

        public void setImageMeta(WPPost.ImageMeta imageMeta) {
            this.imageMeta = imageMeta;
        }

    }



    public class MediaDetails_ {

        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("sizes")
        @Expose
        private WPPost.Sizes_ sizes;
        @SerializedName("image_meta")
        @Expose
        private WPPost.ImageMeta_ imageMeta;

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public WPPost.Sizes_ getSizes() {
            return sizes;
        }

        public void setSizes(WPPost.Sizes_ sizes) {
            this.sizes = sizes;
        }

        public WPPost.ImageMeta_ getImageMeta() {
            return imageMeta;
        }

        public void setImageMeta(WPPost.ImageMeta_ imageMeta) {
            this.imageMeta = imageMeta;
        }

    }


    public class Medium {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime-type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class Medium_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class Reply {

        @SerializedName("embeddable")
        @Expose
        private Boolean embeddable;
        @SerializedName("href")
        @Expose
        private String href;

        public Boolean getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(Boolean embeddable) {
            this.embeddable = embeddable;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class Reply_ {

        @SerializedName("embeddable")
        @Expose
        private Boolean embeddable;
        @SerializedName("href")
        @Expose
        private String href;

        public Boolean getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(Boolean embeddable) {
            this.embeddable = embeddable;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class Self {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Self_ {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class Self__ {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class Self___ {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class Sizes {

        @SerializedName("thumbnail")
        @Expose
        private WPPost.Thumbnail thumbnail;
        @SerializedName("medium")
        @Expose
        private WPPost.Medium medium;
        @SerializedName("tie-small")
        @Expose
        private WPPost.TieSmall tieSmall;
        @SerializedName("tie-medium")
        @Expose
        private WPPost.TieMedium tieMedium;
        @SerializedName("tie-large")
        @Expose
        private WPPost.TieLarge tieLarge;
        @SerializedName("slider")
        @Expose
        private WPPost.Slider slider;

        public WPPost.Thumbnail getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(WPPost.Thumbnail thumbnail) {
            this.thumbnail = thumbnail;
        }

        public WPPost.Medium getMedium() {
            return medium;
        }

        public void setMedium(WPPost.Medium medium) {
            this.medium = medium;
        }

        public WPPost.TieSmall getTieSmall() {
            return tieSmall;
        }

        public void setTieSmall(WPPost.TieSmall tieSmall) {
            this.tieSmall = tieSmall;
        }

        public WPPost.TieMedium getTieMedium() {
            return tieMedium;
        }

        public void setTieMedium(WPPost.TieMedium tieMedium) {
            this.tieMedium = tieMedium;
        }

        public WPPost.TieLarge getTieLarge() {
            return tieLarge;
        }

        public void setTieLarge(WPPost.TieLarge tieLarge) {
            this.tieLarge = tieLarge;
        }

        public WPPost.Slider getSlider() {
            return slider;
        }

        public void setSlider(WPPost.Slider slider) {
            this.slider = slider;
        }

    }


    public class Sizes_ {

        @SerializedName("thumbnail")
        @Expose
        private WPPost.Thumbnail_ thumbnail;
        @SerializedName("medium")
        @Expose
        private WPPost.Medium_ medium;
        @SerializedName("tie-small")
        @Expose
        private WPPost.TieSmall_ tieSmall;
        @SerializedName("tie-medium")
        @Expose
        private WPPost.TieMedium_ tieMedium;
        @SerializedName("tie-large")
        @Expose
        private WPPost.TieLarge_ tieLarge;
        @SerializedName("slider")
        @Expose
        private WPPost.Slider_ slider;
        @SerializedName("full")
        @Expose
        private WPPost.Full full;

        public WPPost.Thumbnail_ getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(WPPost.Thumbnail_ thumbnail) {
            this.thumbnail = thumbnail;
        }

        public WPPost.Medium_ getMedium() {
            return medium;
        }

        public void setMedium(WPPost.Medium_ medium) {
            this.medium = medium;
        }

        public WPPost.TieSmall_ getTieSmall() {
            return tieSmall;
        }

        public void setTieSmall(WPPost.TieSmall_ tieSmall) {
            this.tieSmall = tieSmall;
        }

        public WPPost.TieMedium_ getTieMedium() {
            return tieMedium;
        }

        public void setTieMedium(WPPost.TieMedium_ tieMedium) {
            this.tieMedium = tieMedium;
        }

        public WPPost.TieLarge_ getTieLarge() {
            return tieLarge;
        }

        public void setTieLarge(WPPost.TieLarge_ tieLarge) {
            this.tieLarge = tieLarge;
        }

        public WPPost.Slider_ getSlider() {
            return slider;
        }

        public void setSlider(WPPost.Slider_ slider) {
            this.slider = slider;
        }

        public WPPost.Full getFull() {
            return full;
        }

        public void setFull(WPPost.Full full) {
            this.full = full;
        }

    }


    public class Slider {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime-type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class Slider_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class Thumbnail {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime-type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class Thumbnail_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class TieLarge {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime-type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class TieLarge_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class TieMedium {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime-type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class TieMedium_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class TieSmall {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime-type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }

    public class TieSmall_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class Title {

        @SerializedName("rendered")
        @Expose
        private String rendered;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

    }


    public class Title_ {

        @SerializedName("rendered")
        @Expose
        private String rendered;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

    }


    public class Up {

        @SerializedName("embeddable")
        @Expose
        private Boolean embeddable;
        @SerializedName("href")
        @Expose
        private String href;

        public Boolean getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(Boolean embeddable) {
            this.embeddable = embeddable;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class VersionHistory {

        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("href")
        @Expose
        private String href;

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class WpAttachment {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class WpFeaturedmedium {

        @SerializedName("embeddable")
        @Expose
        private Boolean embeddable;
        @SerializedName("href")
        @Expose
        private String href;

        public Boolean getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(Boolean embeddable) {
            this.embeddable = embeddable;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class WpFeaturedmedium_ {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("title")
        @Expose
        private WPPost.Title_ title;
        @SerializedName("author")
        @Expose
        private Integer author;
        @SerializedName("caption")
        @Expose
        private WPPost.Caption caption;
        @SerializedName("alt_text")
        @Expose
        private String altText;
        @SerializedName("media_type")
        @Expose
        private String mediaType;
        @SerializedName("mime_type")
        @Expose
        private String mimeType;
        @SerializedName("media_details")
        @Expose
        private WPPost.MediaDetails_ mediaDetails;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;
        @SerializedName("_links")
        @Expose
        private WPPost.Links__ links;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public WPPost.Title_ getTitle() {
            return title;
        }

        public void setTitle(WPPost.Title_ title) {
            this.title = title;
        }

        public Integer getAuthor() {
            return author;
        }

        public void setAuthor(Integer author) {
            this.author = author;
        }

        public WPPost.Caption getCaption() {
            return caption;
        }

        public void setCaption(WPPost.Caption caption) {
            this.caption = caption;
        }

        public String getAltText() {
            return altText;
        }

        public void setAltText(String altText) {
            this.altText = altText;
        }

        public String getMediaType() {
            return mediaType;
        }

        public void setMediaType(String mediaType) {
            this.mediaType = mediaType;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public WPPost.MediaDetails_ getMediaDetails() {
            return mediaDetails;
        }

        public void setMediaDetails(WPPost.MediaDetails_ mediaDetails) {
            this.mediaDetails = mediaDetails;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

        public WPPost.Links__ getLinks() {
            return links;
        }

        public void setLinks(WPPost.Links__ links) {
            this.links = links;
        }

    }


    public class WpPostType {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class WpTerm {

        @SerializedName("taxonomy")
        @Expose
        private String taxonomy;
        @SerializedName("embeddable")
        @Expose
        private Boolean embeddable;
        @SerializedName("href")
        @Expose
        private String href;

        public String getTaxonomy() {
            return taxonomy;
        }

        public void setTaxonomy(String taxonomy) {
            this.taxonomy = taxonomy;
        }

        public Boolean getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(Boolean embeddable) {
            this.embeddable = embeddable;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class WpTerm_ {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("taxonomy")
        @Expose
        private String taxonomy;
        @SerializedName("_links")
        @Expose
        private WPPost.Links___ links;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getTaxonomy() {
            return taxonomy;
        }

        public void setTaxonomy(String taxonomy) {
            this.taxonomy = taxonomy;
        }

        public WPPost.Links___ getLinks() {
            return links;
        }

        public void setLinks(WPPost.Links___ links) {
            this.links = links;
        }

    }
}



