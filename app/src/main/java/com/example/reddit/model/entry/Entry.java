package com.example.reddit.model.entry;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name="entry",strict = false)
public class Entry implements Serializable {

    @Element(name = "content")
    private String content;

    @Element(name = "title")
    private String title;
    @Element(name = "updated")
    private String updated;
    @Element(name = "id")
    private String id;
    @Element(required = false ,name = "author")
    private Author author;






    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }


    public String toString() {
        return "\n\nEntry{" +
                "content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", updated='" + updated + '\'' +
                '}'+ "\n" +
                "--------------------------------------------------------------------------------------------------------------------- \n";
    }
}
