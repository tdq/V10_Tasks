package com.tdq.tasks.model;

/**
 * Represents one option in task card.
 *
 * @author Nikolay Gorokhov
 */
public class OptionDto {
    private int id;
    private String value;
    private boolean checked;

    public OptionDto() {}

    public OptionDto(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean getChecked() {
        return checked;
    }
}
