package com.study.domain;

public class Book {
    private Integer id;
    private String name;
    private String type;
    private String description;




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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {

        System.out.println("hot-fix ");
        System.out.println("hot 进行更新22：20");
        System.out.println("hot 进行了更新22：43");
        System.out.println("hot 进行了更新22：46");
        System.out.println("hot 进行了更新22：47");
        System.out.println("hot 进行了更新22：50");
        return "domain{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}


