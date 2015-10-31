package com.example.farmeasy;

/**
 * Represents an item in a ToDo list
 */
public class farmer {

    /**
     * Item text
     */
    @com.google.gson.annotations.SerializedName("text")
    private String fName;

    /**
     * Item Id
     */
    @com.google.gson.annotations.SerializedName("id")
    private String fId;

    /**
     * ToDoItem constructor
     */
    public farmer() {

    }

    @Override
    public String toString() {
        return getText();
    }
    public farmer(String text, String id) {
        this.setText(text);
        this.setId(id);
    }
    public String getText() {
        return fName;
    }
    public final void setText(String text) {
        fName = text;
    }
    public String getId() {
        return fId;
    }
    public final void setId(String id) {
        fId = id;
    }
}