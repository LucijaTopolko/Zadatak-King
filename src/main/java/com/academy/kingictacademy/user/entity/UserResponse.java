package com.academy.kingictacademy.user.entity;

import com.academy.kingictacademy.user.entity.User;

import java.util.List;

public class UserResponse {
    private List<User> users;
    private int total;
    private int skip;
    private int limit;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public int getTotal() {  // Add getter
        return total;
    }

    public void setTotal(int total) {  // Add setter
        this.total = total;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
