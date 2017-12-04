package com.tdq.tasks.model;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

/**
 * Task DTO
 *
 * @author Nikolay Gorokhov
 */
public class TaskDto {
    private UUID id;
    private String author;
    private Instant date;
    private String name;
    private String description;
    private List<String> options;
    private Type type; 
    
    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public Instant getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
    
    /**
     * Describes type of task
     */
    public enum Type {
        TEXT, LIST, OPTIONS;
    }
}
