package com.example.reddit.model;

import com.example.reddit.model.entry.Entry;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Root(name="feed" , strict = false)
public class Feed implements Serializable {
    @Element (name ="icon")
    private String icon;

    @Element (name ="id")
    private String id;

    @Element (name ="logo")
    private String logo;


    @Element (name ="updated")
    private String updated;

    @Element (name ="subtitle")
    private String subtitle;

    @Override
    public String toString() {
        return "Feed: \n [Entries"+ entries ;
    }

    @ElementList(inline = true,name ="entries")
    private List<Entry> entries;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
