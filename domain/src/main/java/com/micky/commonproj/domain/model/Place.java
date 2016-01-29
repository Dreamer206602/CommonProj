package com.micky.commonproj.domain.model;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "PLACE".
 */
public class Place {

    private Long id;
    private String label;
    private String name;
    private String pinyin;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Place() {
    }

    public Place(Long id) {
        this.id = id;
    }

    public Place(Long id, String label, String name, String pinyin) {
        this.id = id;
        this.label = label;
        this.name = name;
        this.pinyin = pinyin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    // KEEP METHODS - put your custom methods here
    @Override
    public int hashCode() {
        return pinyin.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Place) {
            return pinyin.equals(((Place)o).pinyin);
        }
        return false;
    }

    @Override
    public int compareTo(Place another) {
        return pinyin.compareTo(another.pinyin);
    }
    // KEEP METHODS END

}
