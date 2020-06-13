package com.integro.sjii.models;

import java.io.Serializable;

public class Institution implements Serializable {

    private String image;

    private String updated_at;

    private String name;

    private String weblink;

    private String id;

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    public String getUpdated_at ()
    {
        return updated_at;
    }

    public void setUpdated_at (String updated_at)
    {
        this.updated_at = updated_at;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getWeblink ()
    {
        return weblink;
    }

    public void setWeblink (String weblink)
    {
        this.weblink = weblink;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

}
