package com.iss.spring1.Models;

public class BarforAnnotations {
    private String description;

    public void setDescription(String description)
    {
        this.description=description;
    }
    public String getDescription()
    {
        return this.description;
    }

    public void print()
    {
        System.out.println(description);
        System.out.println("in bar "+this.description);
    }
}
