package com.ambrose.rest.Objects;

public class TodoObject {

    private String todoName;
    private Boolean isComplete;

    public TodoObject(String todoName, Boolean isComplete) {
        this.todoName = todoName;
        this.isComplete = isComplete;
    }

    public String getTodoName() {
        return this.todoName;
    }

    public Boolean getIsComplete() {
        return this.isComplete;
    } 
}